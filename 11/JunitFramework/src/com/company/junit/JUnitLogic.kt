package com.company.junit

import java.util.ArrayList

/** JUnitLogic
 * This class describes all methods, which controls test methods
 */
object JUnitLogic {
    private var passed = 0
    private var failed = 0
    val failedTests = ArrayList<StringBuilder>()

    val testResults: StringBuilder
        get() = StringBuilder().append("passed: ").append(passed).append("\n").append("failed: ").append(failed)

    /**
     * checks if given objects are equal
     * @param tCurrent
     * @param tExpected
     * @param <T>
    </T> */
    fun <T> ifEqualsPass(tCurrent: T, tExpected: T) {
        if (tCurrent == tExpected) {
            passed()
        } else {
            failed()
        }

    }

    /**
     * checks if given objects are different
     * @param tCurrent
     * @param tExpected
     * @param <T>
    </T> */
    fun <T> ifEqualsFail(tCurrent: T, tExpected: T) {
        if (tCurrent == tExpected) {
            failed()
        } else {
            passed()
        }
    }

    private fun failed() {
        failed++
        failedTests.add(StringBuilder().append("test failed: ").append(Thread.currentThread().stackTrace[3].toString()))
    }

    private fun passed() {
        passed++
    }
}
