package com.company.junit.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/** MyTestMethodAfter
 * Annotates the method which calls after the current method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class MyTestMethodAfter(val methodAfter: String)
