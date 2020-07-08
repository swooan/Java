package org.comstudy21.day20.thread_ex;

class MyThread extends Thread {
	public MyThread() {
		super("MyThread");
	}

	// 구현은 run()메소드에 , 시작은 start() 메소드로 한다.
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thread.getName());
		}
	}
}

public class Day20Ex05 {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();

		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thread.getName());
		}
	}
}
