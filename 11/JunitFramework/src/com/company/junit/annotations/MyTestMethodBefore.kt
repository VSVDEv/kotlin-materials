package com.company.junit.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/** MyTestMethodBefore
 * Annotates the method which calls before the current method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class MyTestMethodBefore(val methodBefore: String)
