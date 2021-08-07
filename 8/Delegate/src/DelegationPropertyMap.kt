class ArticleMap(){
    private val articleMap = hashMapOf<String, String>()

    fun setArticle(title: String, article: String){
        articleMap[title] = article
    }

    var article: String by articleMap
    var authors: String by articleMap
    var description: String by articleMap
}