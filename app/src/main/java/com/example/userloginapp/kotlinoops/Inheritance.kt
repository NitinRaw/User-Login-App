
fun main(){

    var obj = P("Nitin")

    obj.think()

    var obj1 : N = P("Nitin")
    obj1.think()

}


open class N(name : String) {

    init {
        println(" In N : $name")
    }

  open fun think(){
        println("In A think")
    }
}

class P(name : String) : N(name) {

    init {
        println(" In P : $name")
    }

   override fun think(){
        println("In P think")
    }

    fun one(){
        println("In One")
    }

}