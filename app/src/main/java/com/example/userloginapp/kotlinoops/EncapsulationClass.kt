



class EncapsulationClass {

    private var name = "Nitin"

    internal var age = 15
    protected var value1 = "Value1"
    var temp = "Temp"

    fun getMyName() : String{
        return name
    }

    fun setMyName(name : String){
        this.name = name
    }

    protected class Nested{
        val p : Int = 36
    }


}

//
//class A: EncapsulationClass(){
//    val a = value1
////    val b = name  //Not allowing
//    val c = age
//
//   val d = Nested().p
//
//}

fun main(){
    val obj =EncapsulationClass()
    obj.setMyName("s")
    println(obj.getMyName())






    println(obj.age)


    println(obj.getMyName())
    println(obj.setMyName("Nick"))
    println(obj.getMyName())

    val obj1 =EncapsulationClass()
    println(obj1.getMyName())

}