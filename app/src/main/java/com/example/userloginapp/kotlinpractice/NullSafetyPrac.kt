import java.lang.Exception


fun main(){

    try{

        //Declaring a variable null using ? otherwise compiler won't allow and error throw karega
        var a : String? = null
        // initializing the string
        a = "String"

        //checking if a is null or not and then assigning its length to b
        // and if found null then b will be -1

        var b =   if (a != null)
                             a.length
                        else
                            -1

        println("Value of b is $b")
        //We can also use safe call ( ?. ) to check if it is null or not and if it is not null
        // then only to proceed otherwise null
        println(a?.length)

        //toString returns a null when recieved null value
        //helpfull in logging aur debugging k liye
        println(a.toString())


        /** Elvis Operator ( ?: ) can be used instead of if else
         *  First Elvis k left wale ko check karega null k liye aur null nhi hua toh wohi return kardega
         *  otherwise right side run hoga of Elvis operator
         */

        var l = a?.length ?: -1

        println("Value of l is $l")

        val nullPointerException1 : Int? =  a?.length ?: throw NullPointerException()
        val nullPointerException2 : Int? =  a?.length ?: null


        /** We can also use !! operator which tells that the value is not null to the compiler
         * and if still found null by the compiler , It will throw Null pointer Exception
         */

        val d = a!!.length
        println("Value of d is $d")









    }catch (e : NullPointerException){
        println(e)
    } catch (e : Exception){
        println(e)
    }



}