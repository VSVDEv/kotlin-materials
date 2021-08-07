internal class Vocabulary {
    private val vocabularyMap = mapOf("hello" to "привет", "world" to "мир", "cat" to "кот")

    fun getTranslation(words: List<String>): String{
        val mutableCollection: MutableList<String> = arrayListOf("")
        words.forEachIndexed { index, s ->
            mutableCollection.add(vocabularyMap[s] ?: "")
        }
        return mutableCollection.joinToString(" ")
    }
}