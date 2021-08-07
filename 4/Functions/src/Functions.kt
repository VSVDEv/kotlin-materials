@file:JvmName("SomeFunctions")

import util.div as divide
import util.multiple
import util.isEvenNumber as isEven

fun main(args: Array<String>) {

    println(4.isEven())

    println(5 multiple 4)

    fun toStringAndGetHalfString(any: Any): String {
        val str = any.toString()
        return str.subSequence(0, str.length divide 2).toString()
    }

    println(toStringAndGetHalfString(1234567890))

    multiArgumentFunction(5, 9, 7, 10)
// like forEach
    val (key, value) = "first" to 1

    val array = arrayListOf(Programmer("John", 29), Programmer("Bill", 35), Programmer("Bob", 31))

    println(array.maxBy { it.age })

    val lambda = { a: Int, b: Int -> a divide b }

    println(lambda(4, 2))

    println({ "Hello Lambda" }())

//l age field
    val age = Programmer::age
//l call constructor
    val programmer = ::Programmer

    println(age(programmer("John", 29, null)))

    println(array.filter { true })
    println(array.filter { it.age > 30 })

    array.map { it.age++ }
    println(array)

    println(array.map { it.age - 5 }.filter { it > 30 })

    val predicate = { programmer: Programmer -> programmer.age > 30 }
//first   
   println(array.find(predicate))
//all
    println(array.all(predicate))
//one element	
    println(array.any(predicate))
//quantity
    println(array.count(predicate))
    array.add(Programmer("Jim", 30))
//gropping
    println(array.groupBy(age))

    var count = 0
    array.map {
        it.programmingLanguages = arrayListOf(
                arrayListOf("Java", "Kotlin"),
                arrayListOf("Python"),
                arrayListOf("C#", "Kotlin"),
                arrayListOf("C#", "Java")
        )[count++]
    }

    println(array.flatMap { it.programmingLanguages!! }.toSet())

    println(arrayListOf(
            arrayListOf("Java", "Kotlin"),
            arrayListOf("Python"),
            arrayListOf("C#", "Kotlin"),
            arrayListOf("C#", "Java")
    ).flatten())

    val ints = getArray()
    val startTime = System.currentTimeMillis()
    val result = ints.map { it * 2 }.filter { it.isEven() }
    val stopTime = System.currentTimeMillis()
    println("without sequence: work time = ${stopTime - startTime}, result = ${result.size}")

    val ints2 = getArray()
    val startTime2 = System.currentTimeMillis()
    val result2 = ints2.asSequence().map { it * 2 }.filter { it.isEven() }.toList()
    val stopTime2 = System.currentTimeMillis()
    println("with sequence: work time = ${stopTime2 - startTime2}, result = ${result2.size}")

//    val ints = getArray()
//    val startTime = System.currentTimeMillis()
//    val result = ints.map { it * 2 }.find { it.isEven() }
//    val stopTime = System.currentTimeMillis()
//    println("without sequence: work time = ${stopTime - startTime}, result = ${result}")
//
//    val ints2 = getArray()
//    val startTime2 = System.currentTimeMillis()
//    val result2 = ints2.asSequence().map { it * 2 }.find { it.isEven() }
//    val stopTime2 = System.currentTimeMillis()
//    println("with sequence: work time = ${stopTime2 - startTime2}, result = ${result2}")

    Thread(Runnable() { println("hello runnable class") }).start()

    Thread { println("hello runnable lambda") }.start()

    with(array) {
        println(this[0])
        println(get(0))
    }

    val developer = Programmer("John", 40).apply { summary = "speed learning" }
    println(developer.summary)

    val lambdaExp: (Int, Int) -> Int = {a: Int, b: Int -> a + b}

    val lambdaUnit: () -> Unit = { println("returns unit") }

    val lambdaExp2: (a: Int, b: Int) -> Int = {a, b -> a + b}

    println(doWithInts(5, 10, lambdaExp))
    println(doWithInts(5, 10){a: Int, b: Int -> a + b})
    println(doWithInts(5, 10, getLambda(Operation.MULTIPLE)))
}

fun multiArgumentFunction(vararg values: Int) {
    values.forEach {
        print("$it, ")
    }
}

fun getArray(): ArrayList<Int> {
    val arr = ArrayList<Int>()
    var count = 1000000; while (count-- >= 0) {
        arr.add(count)
    }
    return arr
}

fun doWithInts(a: Int, b: Int, func: (a: Int, b: Int) -> Int): Int{
    return func(a, b)
}

fun getLambda(operation: Operation): (Int, Int) -> Int {
    return when (operation){
        Operation.PLUS -> {a: Int, b: Int -> a + b}
        Operation.MINUS -> {a: Int, b: Int -> a - b}
        Operation.MULTIPLE -> {a: Int, b: Int -> a * b}
        Operation.DIVIDE -> {a: Int, b: Int -> a / b}
    }
}

class Programmer(val name: String, var age: Int, var programmingLanguages: ArrayList<String>? = null) {
    var summary: String? = null

    override fun toString(): String {
        return "class Programmer(name = $name, age = $age)"
    }
}

enum class Operation {PLUS, MINUS, MULTIPLE, DIVIDE}