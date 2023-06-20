

fun main(){

    /**
     * immutable Collection
     */

    /**
     * Creationg a list with listOf() function and it is a immutable list means new elements can't
     * be added in it,and it is ordered list means elements can be accessed through indices
     */

    var fruitList = listOf("Apple", "banana","pineapple","orange")

    //printing elements at index 2 of fruitlist
    println(fruitList[2])

    //Printing the fruitlist
    for(fruit in fruitList){
        println(fruit)
    }

    /**
     * creating a set with setof() function and it is a immutable set ,So new elements can't be added,
     * and it is unordered so elements can't be accessed using indices
     * and it is a collection of unique element so only unique elements are stored
     */

    var set = setOf(6,12,18,"Nitin", "Pandey", 12,18)

   // println(set[2])  ->  Compiler gives error since it is unordered collection

    //Printing the set

    for (item in set){
        println(item)
    }

    /**
     * Creating a map with a mapOf() function and it is immutable in nature so can't add new elements in it
     * here key is unique and value can be duplicate
     * each key maps to only one value
     * */

    var immutableMap = mapOf( 2 to "Apple", 3 to "banana", 4 to "Orange", 5 to "grape")


    //Printing the immutable map using keys
    for(key in immutableMap.keys){
        println("Key is $key and value is " + immutableMap[key])
    }

    //printing it using key-value pair
    for((key, value) in immutableMap){
        println("Value is $value  and Key is $key")
    }


    /**
     * Mutable Collection
     */

    /**
     * Mutable list can be created using mutableListOf(), arrayListOf(), and ArrayList
     * since it is mutable,  new elemants can be added and it is ordered list so element can be accessed using index
     *
     * arraylist is dynamic in nature so its size can increase and decrease according to need
     */

    var list1 = mutableListOf("apple", "banana", "pineapple")
    list1.add("grape")

    for(element in list1){
        println(element)
    }

    var list2 = arrayListOf<String>("lion", "monkey")
    list2.add("elephant")

    for(e in list2){
        println(e)
    }

    val list = ArrayList<String>()
    list.add("abc")
    list.add("def")

    //Printing element at index 1
    println(list[1])


    /**
     * Mutable set is created using mutableSetOf(), hashSetOf() function
     * since it is mutable,  new elemants can be added
     */

    var set1 = mutableSetOf(6, 10, 13)
    set1.add(5)

    for(e in set1){
        println(e)
    }

    var set2 = hashSetOf(6, 10, 13)
    set2.add(5)


    for(e in set2){
        println(e)
    }

    /**
     * Mutable Map can be created using mutableMapOf(), hashMapOf() and HashMap functon
     * since it is mutable,  new elemants can be added and removed using put, remove,clear method
     *
     */

    var map1 = mutableMapOf<Int, String>(2 to "apple", 3 to "pineapple", 4 to "orange")

    map1.put(5, "mango")

    for ((key,value) in map1){
        println("Key is $key and value is $value")
    }

    var map2 = hashMapOf<Int, String>(2 to "lion", 3 to "monkey")

    map2.put(5, "elephant")

    for ((key,value) in map1){
        println("Key is $key and value is $value")
    }












}