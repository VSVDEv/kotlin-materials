package com.company

import com.company.junit.annotations.*

import com.company.junit.JUnitLogic.ifEqualsFail
import com.company.junit.JUnitLogic.ifEqualsPass

@MyTestClass
class Test2 {

    @MyTestMethodAfter(methodAfter = "current1")
    fun after1() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwe")
        println("test 2 - after current 1")
    }

    @MyTestMethodInit
    fun init() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwet")
        println("test 2 - init method")
    }

    @MyTestMethodAfter(methodAfter = "current")
    fun after() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwe")
        println("test 2 - after current")
    }

    @MyTestMethod
    fun current() {
        val t = 1 + 1
        ifEqualsPass(t, 2)
        println("test 2 - current")
    }

    @MyTestMethodBefore(methodBefore = "current")
    fun before() {
        val t = "qwe"
        ifEqualsPass(t, "asd")
        println("test 2 - before current")
    }

    @MyTestMethodBefore(methodBefore = "current")
    fun before1() {
        val t = "qwe"
        ifEqualsPass(t, "qwe")
        println("test 2 - before current")
    }

    @MyTestMethod
    fun current1() {
        val t = 1 + 1
        ifEqualsPass(t, 2)
        println("test 2 - current 1")
    }

    @MyTestMethodBefore(methodBefore = "current1")
    fun before2() {
        val t = "qwe"
        ifEqualsPass(t, "asd")
        println("test 2 - before current 1")
    }
}
