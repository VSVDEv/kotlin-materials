package com.company.junit.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/** MyTestMethod
 * Annotates the test method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class MyTestMethod
