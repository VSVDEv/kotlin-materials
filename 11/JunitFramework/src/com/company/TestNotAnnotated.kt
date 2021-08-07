package com.company

import com.company.junit.annotations.*

import com.company.junit.JUnitLogic.ifEqualsFail
import com.company.junit.JUnitLogic.ifEqualsPass

class TestNotAnnotated {

    @MyTestMethodAfter(methodAfter = "current1")
    fun after1() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwe")
        println("after current 1")
    }

    @MyTestMethodInit
    fun init() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwet")
        println("init method")
    }

    @MyTestMethodAfter(methodAfter = "current")
    fun after() {
        val qwe = "qwe"
        ifEqualsFail(qwe, "qwe")
        println("after current")
    }

    @MyTestMethod
    fun current() {
        val t = 1 + 1
        ifEqualsPass(t, 2)
        println("current")
    }

    @MyTestMethodBefore(methodBefore = "current")
    fun before() {
        val t = "qwe"
        ifEqualsPass(t, "asd")
        println("before current")
    }

    @MyTestMethodBefore(methodBefore = "current")
    fun before1() {
        val t = "qwe"
        ifEqualsPass(t, "qwe")
        println("before current")
    }

    @MyTestMethod
    fun current1() {
        val t = 1 + 1
        ifEqualsPass(t, 2)
        println("current 1")
    }

    @MyTestMethodBefore(methodBefore = "current1")
    fun before2() {
        val t = "qwe"
        ifEqualsPass(t, "asd")
        println("before current 1")
    }
}
