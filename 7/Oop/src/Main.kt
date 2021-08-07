import java.util.*

fun main(args: Array<String>){
    val robot = RobotTranslator()
    val key = enterMessage.randomKey()
    execute(enterMessage[key])
    val message = readLine()!!.toString().split(' ').joinToString(" ")
    do {
        print("enter the command : ")
        val (command) = readLine()!!.split(' ')
        if (robot.position == key) robot.readMessage(message)
        robot.setCommand(command)
    } while (command != "e")
}

val enterMessage = mapOf(
        EDirection.LEFT to {println("enter the message: ")},
        EDirection.CENTER to {print("enter the message:                      ")},
        EDirection.RIGHT to {print("enter the message:                                                           ")})

fun execute(func: (() -> Unit)?){
    if (func != null) {
        func()
    }
}

fun <E, V> Map<E, V>.randomKey(): E? = keys.toList()[Random().nextInt(size)]

enum class EDirection (val direction: String){
    LEFT("left"), RIGHT("right"), CENTER("center")
}