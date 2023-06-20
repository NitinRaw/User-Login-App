
class Practice{

    /**
     *  lateinit can't be used on primitive data types linke Int,Float,Double, etc
     *  lateinit var abc : Int  ->  Compiler gives error
     *
     *  it also can't be used on nullable types  ( ? )
     *  lateinit var abc : String?  -> Compiler gives Error
     */

    lateinit var abc : String

    /** We can check if lateint var is initialized or not using IsInitialized method like
     *  and it will give false agr woh initialized nhi rhega otherwise true
     *
     *
     *  lateinit must be initialized at some point of time otherwise compiler give error
     */



    fun checkingIfabcIsInitialised(){

        println("Is abc is initialized ?  : ${this::abc.isInitialized} ")

        abc = "Initialising abc"

        println("Is abc is initialized ?  : ${this::abc.isInitialized} ")





    }




    /**
     * Lazy :
     *   initialization will only happen when it is acccessed once until then no memory allocation is done
     *   since it is used for only val properties , it is initialized once only
     *
     * since val is used its only readonly property
     *
     * once initializwed it return the same object which was initialized before
     */

    val lazyValue : String by lazy { "a lazy String" }


    fun doSomethingWithlazy(){
        println(lazyValue)

    }




}


fun main(){

    val obj = Practice()

    obj.checkingIfabcIsInitialised()

    obj.doSomethingWithlazy()


}

