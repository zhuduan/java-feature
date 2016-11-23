package org.zhf.AutoProxy;

public class ConcreteSubject implements Subject {

	@Override
	public void hello() {
		System.out.println(this.getClass().getName() + " says: hello world!");		
	}

}
