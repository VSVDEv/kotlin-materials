abstract class Robot {
    abstract var position: EDirection
    abstract fun move(direction: EDirection)
    abstract fun setCommand(command: String)
}