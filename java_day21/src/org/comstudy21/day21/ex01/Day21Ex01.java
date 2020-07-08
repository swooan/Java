package org.comstudy21.day21.ex01;

class MyThread extends Thread {
	
	boolean isPause = false;
	
	// run�� ������ �ϰ� ������ start�� �Ѵ�.
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread : " + i);
			
			if(isPause) {
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		}
	}
	
	public void pause() {
		isPause = true;
	}
	
	public void play() {
		isPause = false;
		synchronized (this) {
			this.notify(); // wait ~ notify �Ͻ� wait�� ���� notify�� �ܺ�
		}
	}
	
}

public class Day21Ex01 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main : " + i);
			
			if (i == 10) {
				t.pause();
			}
			if(i == 20) {
				t.play();
			}
		}
	}
}
