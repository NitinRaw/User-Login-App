import java.util.Scanner

fun main(){
    var obj = C()
    obj.show()
    obj.display()
    obj.eat()


}

interface I1 {



    fun show()

    fun eat() {
        println("Eating ...I1")

    }

}

interface I2{

    fun display()

   fun eat(){
        println("Eating ...I2")
    }

}

abstract class Nit{
    abstract fun abc()
}

class C : I1,I2 , Nit(){

    override fun show() {
        println("In show")
    }

    override fun display() {
        println("In Display")

    }

    override fun eat() {
        super<I1>.eat()

    }

    override fun abc() {
        println("In abc")
    }

}