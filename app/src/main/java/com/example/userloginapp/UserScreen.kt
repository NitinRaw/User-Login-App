package com.example.userloginapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class UserScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_screen)

        /**
         * Initializing name, email, and password Textview
         */

        val nametv = findViewById<TextView>(R.id.name_tv)
        val emailtv = findViewById<TextView>(R.id.email_tv)
        val passwordtv = findViewById<TextView>(R.id.password_tv)
        val logoutBtn = findViewById<Button>(R.id.logout_btn)


        /**
         * Getting the Stored Value in Shared Preference and putting it to respective textview
         */


        val sharedPref = getSharedPreferences("user", MODE_PRIVATE)
        nametv.text = sharedPref.getString("name", "User")
        emailtv.text = sharedPref.getString("email", "User@gmail.com")
        passwordtv.text = sharedPref.getString("password", "Password")



        //Logging Out and Sending the User back to the login screen
        logoutBtn.setOnClickListener {

            val sharedPref = getSharedPreferences("user", MODE_PRIVATE)
            val edit = sharedPref.edit()
            edit.apply {
                putBoolean("flag", false)
            }
            edit.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

//


    }




//
//
//
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this,"OnStart UserScreen", Toast.LENGTH_LONG).show()
//
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this,"OnResume UserScreen", Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this,"OnPause UserScreen", Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(this,"OnStop UserScreen", Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Toast.makeText(this,"OnRestart UserScreen", Toast.LENGTH_LONG).show()
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"OnDestroy UserScreen", Toast.LENGTH_LONG).show()
//
//    }
}