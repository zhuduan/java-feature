package org.zhf.Synchronized;

public class SyncThis implements Runnable{

	
	private int count = 0;
	private String name = "defalut";
	
	
	public SyncThis(String name){
		this.name = name;
	}
	
	
	@Override	
	public void run() {
		synchronized (this){
			for(int i=0;i<3;i++){
				System.out.println(name + " ：" + (count++));				
			}
		}
	}

}
