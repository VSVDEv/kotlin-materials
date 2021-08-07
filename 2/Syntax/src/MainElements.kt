//define variable
var message: String = "Hello World"
//define value its like final in Java
val simpleNumber: Int = 38

var numberOfCharsInString: Int = 0
//function main
fun main(args: Array<String>) {
    printToConsole(message)
    printToConsole(getFirstAndLastCharToString(message))
    printToConsole(getNumberOfChars(message).toString())
}
//                  name : Type      default value
fun printToConsole(message: String = "nothing"){
    println(message)
}
//                                              //return Type 
fun getFirstAndLastCharToString(message: String): String{
    return message.last().plus(message[0].toString())
}
// fun without body
fun getNumberOfChars(message: String): Int = message.length