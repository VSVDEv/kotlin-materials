fun leftView(message: String = "", translation: String = "") {
    println(message)
    println("  ___")
    println(" {*,*}")
    println("/|   |\\")
    println(" O---O")
    println(translation)
}

fun centerView(message: String = "", translation: String = "") {
    println("                                       $message")
    println("                                         ___")
    println("                                        {*,*}")
    println("                                       /|   |\\")
    println("                                        O---O")
    println("                                       $translation")
}

fun rightView(message: String = "", translation: String = "") {
    println("                                                                              $message")
    println("                                                                                ___")
    println("                                                                               {*,*}")
    println("                                                                              /|   |\\")
    println("                                                                               O---O")
    println("                                                                              $translation")
}