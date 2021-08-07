package com.company.junit

import com.company.junit.annotations.MyTestClass
import com.company.junit.exceptions.IllegalAnnotationException
import com.company.junit.exceptions.MoreThanOneAnnotationException
import com.company.junit.exceptions.NoTestClassException
import org.reflections.Reflections

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.util.ArrayList

object Main {
    val ANSI_RED = "\u001B[31m"
    val ANSI_RESET = "\u001B[0m"

    private var initMethodsInvoked = false

    /**
     * returns all test classes in the package
     * @return
     */
    private val testClasses: Set<Class<*>>
        get() {
            val reflections = Reflections("com.company")
            return reflections.getTypesAnnotatedWith(MyTestClass::class.java!!)
        }

    @JvmStatic
    fun main(args: Array<String>) {

        val testClasses = testClasses
        val iter = testClasses.iterator()

        try {
            while (iter.hasNext()) {
                startTests(iter.next())
            }
            initMethodsInvoked = true
        } catch (e: NoTestClassException) {
            println(e.toString())
        } catch (e: InvocationTargetException) {
            println(ANSI_RED + e.toString() + ANSI_RESET)
        } catch (e: IllegalAccessException) {
            println(ANSI_RED + e.toString() + ANSI_RESET)
        } catch (e: MoreThanOneAnnotationException) {
            println(ANSI_RED + e.toString() + ANSI_RESET)
        } catch (e: NoSuchMethodException) {
            println(ANSI_RED + e.toString() + ANSI_RESET)
        } catch (e: IllegalAnnotationException) {
            println(ANSI_RED + e.toString() + ANSI_RESET)
        } catch (e: InstantiationException) {
            e.printStackTrace()
        }

        printResultToConsole()
    }

    /**
     * starts test methods
     * @param clas
     */
    @Throws(NoTestClassException::class, InvocationTargetException::class, IllegalAccessException::class, MoreThanOneAnnotationException::class, NoSuchMethodException::class, IllegalAnnotationException::class, InstantiationException::class)
    private fun startTests(clas: Class<*>) {

        val methodsToInvokeCollection = MethodsToInvokeCollection()
        val methods = clas.declaredMethods
        for (i in methods.indices) {
            if (methods[i].declaredAnnotations.size > 1) {
                throw MoreThanOneAnnotationException()
            }
            methodsToInvokeCollection.setMethod(methods[i])
        }

        val `object` = clas.getConstructor().newInstance()
        if (!initMethodsInvoked) {
            for (method in methodsToInvokeCollection.methodsInit) {
                method.invoke(`object`)
            }
        }
        for (method in methodsToInvokeCollection.methodsToInvoke) {
            method.invoke(`object`)
        }
    }


    /**
     * prints result to console
     */
    private fun printResultToConsole() {
        val failedTests = JUnitLogic.failedTests
        for (i in failedTests.indices) {
            println(ANSI_RED + failedTests[i] + ANSI_RESET)
        }
        println(JUnitLogic.testResults)
    }


}


