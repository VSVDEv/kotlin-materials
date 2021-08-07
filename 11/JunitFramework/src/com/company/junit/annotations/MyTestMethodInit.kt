package com.company.junit.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/** MyTestMethodInit
 * Annotates the methods which calls one time only
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class MyTestMethodInit
