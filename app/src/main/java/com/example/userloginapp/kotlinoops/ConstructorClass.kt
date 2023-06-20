


fun main(){

    val obj  = ConstructorClass("Nitin")
    obj.print()

    val obj1 = constructorA("Nitin")





}



class constructorA {

    var name : String? = null


    init {
        this.name = name
        println("In init")
    }

    init {
        println("In init 2")
    }


    constructor(name : String) : this("name",21){
        println("I am calling constructor with age parameter")

    }

    constructor(name1 : String, age : Int){
        println("I am at constructor with age: $age")

    }

    constructor(gender : Boolean, name : String){
        println("Constructor with gender and name")
    }

   private constructor(gender : Boolean){
       println("In private constructor $gender")

    }





    fun fun1(){
        println(name)
    }

}



class ConstructorClass(var n : String) {

    var age = 0
    var name = ""

    init {
        name = n
        println(name)

    }




    constructor(age : Int, name : String) : this(name) {
        this.age = age
        this.name = name
    }

    constructor(age: Int, name: String, nickName : String): this(name){
        println(" $name: $age : $nickName")

    }

    fun print(){
        println(" $name : $age")
    }



}