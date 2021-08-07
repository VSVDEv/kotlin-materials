import java.io.File

class ArticleLazy() {
    private var _article: String? = null

    val article: String
        get() {
            if (_article == null){
                _article = getTextFromFile()
            }
            return _article!!
        }
}

fun createFile() {
    File("delegation.txt").writeText("Delegation is the assignment of any responsibility or authority to another person (normally from a manager to a subordinate) to carry out specific activities. It is one of the core concepts of management leadership. However, the person who delegated the work remains accountable for the outcome of the delegated work. Delegation empowers a subordinate to make decisions, i.e. it is a shifting of decision-making authority from one organizational level to a lower one. Delegation, if properly done, is not fabrication. The opposite of effective delegation is micromanagement, where a manager provides too much input, direction, and review of delegated work. In general, delegation is good and can save money and time, help in building skills, and motivate people. On the other hand, poor delegation might cause frustration and confusion to all the involved parties. Some agents, however, do not favour a delegation and consider the power of making a decision rather burdensome.")
}

fun getTextFromFile(): String {
    return File("delegation.txt").readText()
}

class ArticleLazyKotlin() {
    val article by lazy { getTextFromFile() }
}