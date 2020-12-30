package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS) // 기본값
@Target(ElementType.FIELD)
@interface Field {
	int value(); // 기본 속성명
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}