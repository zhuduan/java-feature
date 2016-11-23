package org.zhf.AutoProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class CglibProxyFactory implements MethodInterceptor {

	private Object target;
	
	public Object getInstance(Object target){
		this.target = target;
		Callback[] callbacks = new Callback[]{ this, NoOp.INSTANCE };
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallbacks(callbacks);
		enhancer.setCallbackFilter(new CallBackFilterImpl());		
		return enhancer.create();
	}

	@Override
	public Object intercept(Object targetObj, Method targetMethod, Object[] args, MethodProxy methodProxy) throws Throwable {
		Object result = null;
		
		// before
		System.out.println("before by cglib");
		
		//actual invoke
		result = methodProxy.invokeSuper(targetObj,args);	//for performance not use method.invoke which used in reflection
		
		//after
		System.out.println("after by cglib");
		
		return result;
	}
	
	private class CallBackFilterImpl implements CallbackFilter {

		@Override
		public int accept(Method method) {
			if(method.getName().equals("hello")){
				System.out.println("method equals hello");
				return 1;
			} else {
				return 0;
			}
		}
		
	}

}
