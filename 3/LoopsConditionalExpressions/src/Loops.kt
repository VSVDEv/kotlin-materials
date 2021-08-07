import kotlin.coroutines.experimental.coroutineContext

fun main(args: Array<String>) {

//like Java while
    var count = 0
    while (count++ < 10) {
        println("count = $count")
    }

    while (args.iterator().hasNext()) {
        println(args.iterator().next())
    }

    do {
        //println(args.iterator().next())
    } while (args.iterator().hasNext())

//read comand line args
    do {
        println("enter pin: ")
        val (pin) = readLine()!!.split(' ')
    } while (pin.toInt() != 123)

//for
    val numbers = arrayListOf(1, 2, 5, 9, 6, 7, 4)
    for (n in numbers) {
        println(n)
    }

//diapason
    val range = 3..6
    val rangeReverse = 3 downTo 6

    for (r in range){
        println(numbers[r])
    }

//step 0,2 element
    for (r in range step 2){
        println(numbers[r])
    }

    val map = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    for((key, value) in map){
        println("$key = $value")
    }

    val array = arrayListOf("first", "second", "third")
    for((index, value) in array.withIndex()){
        println("${array[index]} = $value")
    }

// h in range
    println('h' in 'a'..'z')

// c= from 'a' to 'z'
    for (c in 'a'..'z'){
        println(c)
    }

    map.forEach { t, u ->
        println("$t - $u")
    }

    map.forEach {
        println("${it.key} = ${it.value}")
    }

//it current element
    array.forEach {
        println(it)
    }

//index element
    array.forEachIndexed { index, s ->
        println("$index = $s")
    }

    array.reversed().forEach {
        println(it)
    }

// run next step loop
    for((key, value) in map){
        if (key == 2) {
            continue
        }
        println("$key = $value")
    }
 
 //stop loop
    for((key, value) in map){
        if (key == 2) {
            break
        }
        println("$key = $value")
    }

    val arrayOfMap = arrayListOf(map)

//@loop link
    loop@for(v in arrayOfMap){
        for((key, value) in map){
            if (key == 2) {
                break@loop
            }
            println("$key = $value")
        }
        println("$v")
    }

    loop@for(v in arrayOfMap){
        for((key, value) in map){
            if (key == 2) {
                continue@loop
            }
            println("$key = $value")
        }
        println("$v")
    }

//return ====stop forEach
    map.forEach {
        println("${it.key} = ${it.value}")
        if (it.key == 2) return@forEach
    }
}
