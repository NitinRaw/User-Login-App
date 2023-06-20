

fun main(){
    val arr = Array(10, {i -> i + 1})
    // arr = {1,2....,8,9,10}


    for(i in arr){
        println(i)

    }

    val arrOfNegativeIntegers = Array(10) { ii -> ii - 10 }
    arrOfNegativeIntegers.forEach {
        println(it)
    }


    val s = "abc"
    println("$s.length is ${s.length}")
}