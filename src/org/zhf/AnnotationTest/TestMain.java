package org.zhf.AnnotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) {
		UsingAnno ua = new UsingAnno();
		ua.using();
		Method[] methods = UsingAnno.class.getMethods();
		for(Method method : methods){
			Annotation[] anno = method.getAnnotations();
			System.out.println(method.getName()+"'s anno num is "+anno.length);
			
			for(Annotation aa : anno){
				System.out.println("toString : "+aa.toString());
				System.out.println("anno type : "+aa.annotationType());
			}
		}
	}

}
