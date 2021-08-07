//can`t be null
var someString: String = "some string"
//can be null
val someStringOrNull: String? = "some string, but may be null"

var someStringOrNullMutable: String? = null

var someInt: Int = 0

val theBestHorse: Horse? = Horse("Andalouse")
//lazy
lateinit var theBestRobot: Robot


fun main(args: Array<String>){

    someString = someStringOrNull
//check null
    someString = if (someStringOrNull != null) someStringOrNull else ""

//not compile cuz can be null
  //  someInt = someStringOrNull.length

//not compile cuz can be null
   // someInt = someStringOrNull?.length

//elvis operator if value null return right value(default)
    someInt = someStringOrNull?.length ?: 0

    someString = someStringOrNull ?: ""

//check cast "as?" else elvis  check safellly
    var someHorse: Horse = theBestRobot as? Horse ?: Horse("Abaco Barb")

    //we say run it it is safe(not reccomend)
	someHorse = theBestHorse!!

    someString = theBestHorse!!.breed

// check null then paste it to value and use its(it) in method
   println(theBestHorse?.let { getLengthOfString(it.breed) })

    theBestRobot = Robot("R-2")

    println(theBestRobot.type.addPrefix("type", "="))

    println(someStringOrNullMutable.addPrefix("string", "="))

    castToRobotIfPossible(null)
	
	val dog: Dog(null,8)
	dog.sayBowWow()
	
	//val breed: String = dog.breed
	
	val puppy = Puppy(null,2)
	
	val breed2: String = puppy.breed
	
	val b: Byte = 12
	//auto Long
	val l = b + 31L
	
	val i = 25
	val long: Long = i+6L
	val c: Char = 5.toChar()
	println(l)
	//lazy init
	lateinit var rob: Robot
}

fun getLengthOfString(someString: String): Int{
    return someString.length
}


//share func 
fun String?.addPrefix(somePrefix: String, delimiter: String?): String {
    return "$somePrefix${delimiter ?: " "}${this ?: "string is null"}"
	//                                       elment of class  
}

fun <T> castToRobotIfPossible(someObject: T){
    someObject as? Robot
}
class Horse(val breed: String)

class Robot(val type: String)

class Puppy(breed: String?, age: Int): Dog(breed,age)

var byte: Byte =2 //-128..+127
var short: Short =56 // -32768	..+32767  16bit
vat int: Int = 2569//-2,147,483,648 (-2 31)..+2,147,483,647 (2 31- 1) 32bit
var long: Long = 456987 // -9,223,372,036,854,775,808 (-2 63)..+9,223,372,036,854,775,807 (2 63- 1) 64 bit

var float: Float = 25.3F  //-..+  32 bit
var double: Double = 45.689//-..+ 64 bit

var char: Char = '['  //16 bit

var boolean: Boolean = true //

// like Object in Java superclass for all
val any: Any = Any() 

//if fun doesn`t return we can not write or write ":Unit"
// Unit ===== void Java
fun g(s: String): Unit {////}

//for endless loop(while(true){}) type return nothing 