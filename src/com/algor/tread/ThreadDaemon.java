package com.algor.tread;

import com.util.Print;

public class ThreadDaemon implements Runnable{
	
	@Override
	public void run() {
		while(true){
			Print.println(Thread.currentThread().getName()+"������");
		}
	}
	
	public static void main(String[] args){
		ThreadDaemon tj = new ThreadDaemon();
        Thread demo = new Thread(tj,"�߳�");
        
        demo.setDaemon(true);
        
        demo.start();
        
	}
	
	
	
}
