class RobotTranslator: Robot(), ITranslator {

    private val vocabulary = Vocabulary()

    override var position: EDirection = EDirection.LEFT
        set(value) {
            when(value){
                EDirection.LEFT -> leftView(message, translation)
                EDirection.CENTER -> centerView(message, translation)
                EDirection.RIGHT -> rightView(message, translation)
            }
            field = value
        }
    private var message: String = ""
    var translation: String = ""

    override fun readMessage(message: String) {
        this.message = message
    }

    private fun translate(message: String) {
        if (message != "") translation = vocabulary.getTranslation(message.split(" "))
        else translation = "don't see the message.. try to move me somewhere"
        when(position){
            EDirection.LEFT -> leftView(message, translation)
            EDirection.CENTER -> centerView(message, translation)
            EDirection.RIGHT -> rightView(message, translation)
        }
    }

    override fun move(direction: EDirection) {
        translation = ""
        position = direction
    }

    override fun setCommand(command: String) {
        val moveCommand = getMoveCommand(command)
        val currentCommand = getCommand(command)
        if (moveCommand != null) move(moveCommand)
        else if (currentCommand != null) translate(message)
        else println("invalid command")
    }

    private fun getMoveCommand(direction: String) = when (direction){
            EDirection.LEFT.direction -> EDirection.LEFT
            EDirection.CENTER.direction -> EDirection.CENTER
            EDirection.RIGHT.direction -> EDirection.RIGHT
            else -> null
        }

    private fun getCommand(direction: String) = when (direction){
        ECommand.TRANSLATE.command -> ECommand.TRANSLATE
        else -> null
    }

    enum class ECommand (val command: String){
        TRANSLATE("translate")
    }
}