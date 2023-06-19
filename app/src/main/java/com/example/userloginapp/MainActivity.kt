package com.example.userloginapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Initializing name, email, and password edit Text and submit button
         */

        val nameEt = findViewById<TextInputEditText>(R.id.username_et)

        val emailEt = findViewById<TextInputEditText>(R.id.email_et)

        val passwordEt = findViewById<TextInputEditText>(R.id.password_et)

        val submitBtn = findViewById<Button>(R.id.submit_btn)


        /**
         * checking if user has already logged in and if already logged in , Sent to user Detail Screen
         */

        checkIfUserLoggedIn()



        submitBtn.setOnClickListener {

            /**
             * checking if all fields are properly filled
             * and if all fields are satisfied then sent it to User Detail Screen
             */

            checkIfAllFieldsSatisfied(nameEt, emailEt, passwordEt)


        }




    }

    private fun checkIfAllFieldsSatisfied(
        nameEt: TextInputEditText,
        emailEt: TextInputEditText,
        passwordEt: TextInputEditText
    ) {
        val name = nameEt.text.toString()
        val email = emailEt.text.toString()
        val password = passwordEt.text.toString()

        if (name.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_LONG).show()

        } else if (email.isEmpty()) {
            Toast.makeText(this, "Please Enter your Email", Toast.LENGTH_LONG).show()

        } else if (isEmailValid(email) == false) {
            Toast.makeText(this, "Please Enter Valid Email", Toast.LENGTH_LONG).show()

        } else if (password.isEmpty()) {
            Toast.makeText(this, "Please Enter your Password", Toast.LENGTH_LONG).show()

        } else {

            /**
             * Do User Login
             */
            doUserLogin(name, email, password)

        }
    }

    private fun doUserLogin(name: String, email: String, password: String) {

        /**
         * Storing email ,name and password in shared preference
         * and changing the login flag to true
         */

        val sharedPref = getSharedPreferences("user", MODE_PRIVATE)
        val edit = sharedPref.edit()
        edit.apply {
            putBoolean("flag", true)
            putString("name", name)
            putString("email", email)
            putString("password", password)
        }
        edit.apply()

        /**
         * Sending it to User Detail Screen
         */

        val intent = Intent(this, UserScreen::class.java)
        startActivity(intent)
        finish()
    }

    private fun checkIfUserLoggedIn() {

        val checkSharedPref = getSharedPreferences("user", MODE_PRIVATE)

        /**
         * check if login flag is true or false and if true send it to user Detail Screen
         */

        if (checkSharedPref.getBoolean("flag", false) == true) {

            val intent = Intent(this, UserScreen::class.java)
            startActivity(intent)

        }
    }

    /**
     * Returns true if Given string is of type Email Address
     */
    fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


    /**
     * Below code will toast on every lifecycle method
     */

//
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this,"OnStart MainActivity",Toast.LENGTH_LONG).show()
//
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this,"OnResume MainActivity",Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this,"OnPause MainActivity",Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(this,"OnStop MainActivity",Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Toast.makeText(this,"OnRestart MainActivity",Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"OnDestroy MainActivity",Toast.LENGTH_LONG).show()
//
//    }


}













