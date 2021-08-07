import java.util.*

fun main(args: Array<String>) {

//create array
    val arr = arrayOf(1, 2, 3, 4)
    val arr2 = listOf(1, 2, 3).toIntArray()
//array of null(empty)   
   val arr3 = arrayOfNulls<String>(5)
   
   var i = 0
    val arr4: Array<Int> = Array<Int>(4) { i++ }
    arr4.forEach {
        println(it)
    }

//for primitives
    val intArr = intArrayOf(2, 6, 9)
    val charArray = charArrayOf('q', 'r')
    val boolArray = booleanArrayOf(true, false)

// it means <Int?> -array can contain null  ?-variable can be null
    var nullableArray: Array<Int?>? = arrayOf(1, 5, null, 9)

    nullableArray?.forEach {
        println(it?.times(2)) //safe request
    }

// possible null array then filter not null
    nullableArray?.filterNotNull().?forEach{ //forEach safe
	println(it)
	}

//kotlin Collection and MutableCollection
    val mutableCollection: MutableCollection<String> = arrayListOf("")
    val collection: Collection<String> = mutableCollection
    println("collection size = ${collection.size}")
    mutableCollection.add("qwe")
    println("collection size = ${collection.size}")

//Collection !!!! do not have add()
    val immutableCollection: Collection<String> = arrayListOf("")
    val immutableCollectionPlatform: Collection<String> = JavaClass.getCollection(immutableCollection)//.add(null)

    val set = setOf("qwe", "qwe", "asd")
    println("${set.javaClass} size = ${set.size}")
    val set2 = hashSetOf("qwe", "qwe", "asd")
    val set3 = sortedSetOf("qwe", "qwe", "asd")

    val list = listOf(1, 2, 3)
list.toMutableList()

    val listNotNull = listOfNotNull("q", "w", null, "p", "1", "2")
    println(listNotNull)

//                                                          mix random elements
    var count = 0; while (count++ < 5) println(listNotNull.shuffled())

// kotlin Map MutableMap
    val map = mapOf("first" to 25, "second" to 63, "third" to 12)
    println(map["second"])
    println(map.get("first"))

    val mutableMap = mutableMapOf("first" to 25, "second" to 63, "third" to 12)
    mutableMap.put("fourth", 33)
    println(mutableMap["fourth"])
    mutableMap.put("first", 15)
    println(mutableMap.get("first"))

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.joinToString())
    println(numbers.joinToString(prefix = "[", postfix = "]"))
    println(numbers.joinToString(prefix = "{", postfix = "}", separator = "|"))
}

fun getCollection(collection: Collection<String>){
    //collection.add()
}

fun getMutableCollection(collection: MutableCollection<String>){
    collection.add("")
}

//вы можете быть уверены, что не измените коллекцию, из которой делаете копию
fun copy(source: Collection<String>, target: MutableCollection<String>){
    source.forEach {
        target.add(it)
    }
}