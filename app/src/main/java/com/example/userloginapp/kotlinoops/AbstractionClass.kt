fun main() {

    var obj : human = Male()
    obj.think()
    obj.talk()

}

abstract class human{
    abstract fun think()

    fun talk(){
        println(" In talk ")
    }

}



class Male: human(){
    override fun think() {
        println("In Male Think")
    }
}