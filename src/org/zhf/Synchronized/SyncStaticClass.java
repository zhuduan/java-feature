package org.zhf.Synchronized;

public class SyncStaticClass implements Runnable{

	
	private int count = 0;
	private String name = "defalut";
	
	
	public SyncStaticClass(String name){
		this.name = name;
	}
	
	
	@Override	
	public void run() {
		synchronized (SyncStaticClass.class){
			for(int i=0;i<3;i++){
				System.out.println(name + " ：" + (count++));	
			}
		}
	}

}
