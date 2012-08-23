package com.algor.tread;

import com.util.Print;

public class ThreadSynchronizedMethod implements Runnable{
	
	private int count = 5;
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			sale();
		}
	}
	
	public synchronized void sale(){
		if(count > 0){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			Print.println(Thread.currentThread().getName()+" "+count--);
		}
	}
	
	
	public static void main(String[] args){
		ThreadSynchronizedMethod tj = new ThreadSynchronizedMethod();
        Thread demo = new Thread(tj,"�߳�");
        Thread demo2 = new Thread(tj,"�߳�1");
        Thread demo3 = new Thread(tj,"�߳�2");
        Thread demo4 = new Thread(tj,"�߳�3");
        Thread demo5 = new Thread(tj,"�߳�4");
        Thread demo6 = new Thread(tj,"�߳�5");
        demo.start();
        demo2.start();
        demo3.start();
        demo4.start();
        demo5.start();
        demo6.start();
	}
	
	
	
}
