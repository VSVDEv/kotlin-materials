//               constructor else empty
class SomeClass constructor(someValue: String) {
    val value: String

    init {
        value = someValue
    }
}

class SomeClass2 constructor(someValue: String) {
    val value: String = someValue
}

// also constructor
class SomeClass3(private val someValue: String)

class Simple

//open allow inherrit by default final
open class Parent(someValue: String)

class Child(someValue: String) : Parent(someValue)

private class PrivateClass

//default internal acessible in module
class Outer {
    inner class Inner
    class StaticInner
}

class Robot {

    var x: Int = 0
        set(value) {
            if (value > field) println("moved to the right")
            else if (value < field) println("moved to the left")
            else println("stayed in his place")
            field = value
        }

    var y: Int = 0
        set(value) {
            if (value > field) println("moved to the top")
            else if (value < field) println("moved to the bottom")
            else println("stayed in his place")
            field = value
        }

    var isInTheCentre: Boolean = true
        get() = x == 0 && y == 0
        private set

//    override fun toString(): String {
//        return "${this.javaClass} [coordinates: x = $x, y = $y]"
//    }

//    override fun equals(other: Any?): Boolean {
//        return other is Robot && x == other.x && y == other.y
//    }

    override fun hashCode(): Int {
        return (x.hashCode() / 2) + (y.hashCode() / 2)
    }
}

data class DataClass(val name: String, val id: Int)

object Singleton {
    const val serialNumber: Int = 654321984

    fun logSerialNumber() = println("serial number = $serialNumber")
}

class Cat {
    val name: String
    var age: Int

    private constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "${this.javaClass} [name = $name, age = $age]"
    }

    companion object {
        fun getInstance(name: String, age: Int): Cat {
            return Cat(name, age)
        }
    }
}