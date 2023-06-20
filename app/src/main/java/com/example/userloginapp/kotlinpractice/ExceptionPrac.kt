import java.lang.Exception
import java.lang.IllegalArgumentException


fun main(){

    try{
        println("In try Line1")
        var s = 13
        s = 5

        if(s in 1..10){
            throw Exception("S  is between 1 to 10 So throwing Exception")
        }
        println("S is not in between 1 to 10")

    } catch (e : Exception){
        println(e)
    } catch (e : IllegalArgumentException){
        println(e)
    } finally {
        println("In Finally")
    }

}


