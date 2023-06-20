class PolymorphismClass {

    var num1 = 0

    fun add(num1 : Int, num2: Int){
        println(num1+num2)
    }

    fun add(num1 : Int, num2: Int, num3 : Int){
        println(num1+num2+num3)
    }

}

fun main(){
    val obj = PolymorphismClass()

    obj.add(2,7)
    obj.add(4,7,8)




    val obj1 = Abc()
    obj1.show()
}

open class Ab{

   open fun show(){
        println("in Ab show")
    }

}

class Abc : Ab(){

    override fun show(){
        println("in Abc Show")
    }

}