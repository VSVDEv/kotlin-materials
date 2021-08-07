
fun main(args: Array<String>){
    val car: Car = MyCar()
    car.move()
    car.stop()
    car.turn(EDirection.LEFT)

    println()

    val car2: Car = DelegationCar()
    car2.move()
    car2.stop()
    car2.turn(EDirection.LEFT)

    println()

    val car3: Car = DelegationCar2()
    car3.move()
    car3.stop()
    car3.turn(EDirection.LEFT)

    println()
//
//    val delegationMap = DelegationMap()
//    delegationMap.put("first", 1)
//    delegationMap.put("second", 2)
//    delegationMap.put("third", 3)
//
//    println("size = ${delegationMap.size}")
//    println("get first = ${delegationMap["first"]}")
//    println("size = ${delegationMap.size}")
//    println("temp = ${delegationMap.tempPair}")

//    println()
//
//    val note = ArticleSimple()
//    note.article = "article"
//    println(note.article)
//    note.description = "description"
//    println(note.description)
//
//    val note2 = ArticleSimple()
//    note2.article = "article 2"
//    println(note2.article)
//    note2.description = "description 2"
//    println(note2.description)
//
//    val note3 = ArticleSimple()
//    note3.article = "article 3"
//    println(note3.article)
//    note3.description = "description 3"
//    println(note3.description)

//    val articleMap = ArticleMap()
//    articleMap.setArticle("article", "article .............")
//    articleMap.setArticle("authors", "Jim, Bob")
//    articleMap.setArticle("description", "description .............")
//    println(articleMap.article)
//    println(articleMap.authors)
//    println(articleMap.description)

    createFile()
    val articleLazy = ArticleLazy()
    println(articleLazy.article)

    val articleLazyKotlin = ArticleLazyKotlin()
    println(articleLazyKotlin.article)
}