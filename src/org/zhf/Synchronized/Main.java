package org.zhf.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		SyncMethod sync1 = new SyncMethod("thread 1");
		SyncMethod sync2 = new SyncMethod("thread 2");
		SyncMethod sync3 = new SyncMethod("thread 3");
		
		(new Thread(sync1)).start();
		(new Thread(sync1)).start();	
		(new Thread(sync2)).start();
		(new Thread(sync3)).start();
		
		sync1.getTheName("other");
	}

}
