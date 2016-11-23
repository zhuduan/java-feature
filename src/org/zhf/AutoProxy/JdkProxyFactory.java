package org.zhf.AutoProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyFactory implements InvocationHandler{

	private Object target;
	
	
	public Object getInstance(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		
		// before
		System.out.println("before by jdk");
		
		//actual invoke
		result = method.invoke(this.target, args);
		
		//after
		System.out.println("after by jdk");
		
		return result;
	}

}
