package com.company.junit.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/** MyTestClass
 * Annotates the test class
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class MyTestClass
