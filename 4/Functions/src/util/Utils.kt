package util

fun Int.isEvenNumber(): Boolean {
    return this.div(2).times(2) == this
}

infix fun Int.multiple(i: Int): Int {
    return this * i
}

infix fun Int.div(i: Int): Int {
    return if (i > 0) this / i else 0
}

// Int.isEvenNumber in Java
fun isEvenNumberJava(i: Int): Boolean {
    return i.div(2).times(2) == i
}


// Определяем выражение как Int
infix fun Int.shl(x: Int): Int {
...
}

// вызываем функцию, используя инфиксную запись

1 shl 2

// то же самое, что

1.shl(2)