package com.algor.tread;

public class ThreadJoin implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args){
		ThreadJoin tj = new ThreadJoin();
	//	Thread th = new Thread(tj,"�߳�f");
		
        Thread demo = new Thread(tj,"�߳�");
        demo.start();
        for(int i=0;i<50;++i){
            if(i>10){
                try{
                    demo.join();  //ǿ��ִ��demo
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main �߳�ִ��-->"+i);
        }
		
	}
	
	
	
}
