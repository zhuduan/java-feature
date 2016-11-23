package org.zhf.Synchronized;

public class SyncMethod implements Runnable{

	
	private int count = 0;
	private String name = "defalut";
	
	
	public SyncMethod(String name){
		this.name = name;
	}
	
	
	@Override	
	public void run() {
		getTheName("default");
	}
	
	
	public synchronized void getTheName(String mark){
		for(int i=0;i<20;i++){
			System.out.println(mark + "," + name + " ：" + (count++));	
		}
	}

}
