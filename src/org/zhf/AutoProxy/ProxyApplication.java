package org.zhf.AutoProxy;

public class ProxyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = (Subject)(new JdkProxyFactory().getInstance(new ConcreteSubject()));
		subject.hello();
		
		Subject subject2 = (Subject)(new CglibProxyFactory().getInstance(new ConcreteSubject()));
		subject2.hello();
		
	}

}
