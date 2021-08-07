abstract class Page {
    val title: String

    constructor(title: String) {
        this.title = title
    }
//overload constructor
    constructor(titleRes: Int) {
        title = titleRes.toString()
    }

//overload constructor
    //constructor(titleRes: Int): this(titleRes.toString())
}