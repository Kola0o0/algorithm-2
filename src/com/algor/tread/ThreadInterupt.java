package com.algor.tread;

import com.util.Print;

public class ThreadInterupt implements Runnable{
	
	@Override
	public void run() {
		Print.println("�߳̿�ʼִ��");
			try {
				Print.println("�߳̿�ʼ����");
				Thread.sleep(10000);
				Print.println("�߳����߽���");
			} catch (InterruptedException e) {
				Print.println("���߱����");
				return;
			}
			Print.println("�߳���������");
	}
	
	public static void main(String[] args){
		ThreadInterupt tj = new ThreadInterupt();
        Thread demo = new Thread(tj,"�߳�");
        demo.start();
        try {
        	Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        demo.interrupt();
	}
	
	
	
}
