fun main(args: Array<String>){

// == equals() from Java
//=== for primitive //links
    if (true){
        println("1 block")
    } else if(true){
        println("2 block")
    } else {
        println("none of above")
    }

    val message: String = if (args.isEmpty()){
        "args is empty"
    } else if(args.isNotEmpty()){
        "args is not empty"
    } else {
        "none of above"
    }

    if ("a" > "A") {
        println("${'a'.toInt()} > ${'A'.toInt()}")
    }

    if (message is String) println("message is String")

    val someNewString1 = String().plus("qwe")
    val someNewString2 = String().plus("qwe")
    val someString1 = "qwe"
    val someString2 = "qwe"

    if (someNewString1 === someNewString2){
        println("$someNewString1 === $someNewString2")
    } else if (someNewString1 == someNewString2){
        println("$someNewString1 == $someNewString2")//
    }

    if (someString1 === someString2){
        println("$someString1 === $someString2")//
    } else if (someString1 == someString2){
        println("$someString1 == $someString2")
    }
// 0-what compare like switch
    when(1){
        0 -> println("zero")
        1 -> println("even number")
        2 -> println("odd number")
        else -> println("unknown")
    }

    val someClass = SomeClass(message)
    val someClass2 = SomeClass(message)
    val someClassSameReference = someClass
//here compare links
    when (someClass){
        someClass2 -> println("case 1")
        someClassSameReference -> println("case 2")
    }

    val setOfClasses = setOf(someClass, someClass2)
//will be true
    when (setOfClasses){
        setOf(someClass2, someClass) -> println("the same set")
    }

    when {
        1 > 0 -> println("case 1")
        2 < 3 -> println("case 2")
    }

    printType(someClass)

    when (5) {
        in 1..3 -> println("case 1")
        in 3..7 -> println("case 2")
    }
}
//is someClass
private fun printType(someClass: Any) {
    when (someClass) {
        is SomeAnotherClass -> println("type = SomeAnotherClass {${someClass.someValue}}")
        is SomeClass -> println("type = SomeClass {${someClass.someValue}}")
    }
}

class SomeClass(val someValue: String)

class SomeAnotherClass(val someValue: String)