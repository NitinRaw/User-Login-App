
fun main(){

    val u1 = User1("User", 21)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "U3")
    val u4 = u1.copy(age = 21)

    println("Printing User \n"
            + u1 + " \n"
            + u2 + "\n"
            + u3 + "\n"
            + u4 + "\n")

    if (u1 == u2)
        println("u1 and u2 are same")
    else
        println("They are not same")

    // destructuring in data class
    val (name, age) = u1
    println("Name is $name & Age is $age")

    println()

    val obj = Person1("Person1")
    println(obj)
    obj.speak()

}

data class User1(val name : String, val age : Int)

data class UserWithDefaultParameters1(val name: String = "User", val age : Int = 18)

data class Person1(val name : String){
    val age : Int = 18

    fun speak(){
        println("Person can speak")
    }

}