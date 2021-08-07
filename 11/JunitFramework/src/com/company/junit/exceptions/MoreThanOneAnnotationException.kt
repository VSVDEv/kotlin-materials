package com.company.junit.exceptions

class MoreThanOneAnnotationException @JvmOverloads constructor(private val e: String = "More than one test annotation! You can use only one test annotation for methods!") : Exception() {

    override fun toString(): String {
        return e
    }
}
