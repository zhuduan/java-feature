package org.zhf.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) throws Exception {
		
		//获取构造方法
		Constructor constructor = TargetObject.class.getConstructor();		
		TargetObject myClassReflect = (TargetObject) constructor.newInstance(); //创建对象
		
		//获取域
	    Field field = TargetObject.class.getDeclaredField("innerA"); 
	    field.setAccessible(true);
	    System.out.println(field.getName() + " : " + field.getInt(myClassReflect));
		
		//获取方法
	    Method method = TargetObject.class.getDeclaredMethod("getNum");  
	    method.setAccessible(true);
	    System.out.println(method.getName() + " : " + method.invoke(myClassReflect)); 			
	    
	    
	}

}
