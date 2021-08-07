package com.company.junit.exceptions

class NoTestClassException @JvmOverloads constructor(private val e: String = "not test class..") : Exception() {

    override fun toString(): String {
        return e
    }
}
