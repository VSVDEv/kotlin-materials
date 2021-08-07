package com.company.junit.exceptions

/** IllegalAnnotationException
 */
class IllegalAnnotationException @JvmOverloads constructor(private val e: String = "Illegal annotation!") : Exception() {

    override fun toString(): String {
        return e
    }
}
