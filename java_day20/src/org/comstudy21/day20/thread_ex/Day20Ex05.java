package org.comstudy21.day20.thread_ex;

class MyThread extends Thread {
	public MyThread() {
		super("MyThread");
	}

	// ������ run()�޼ҵ忡 , ������ start() �޼ҵ�� �Ѵ�.
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
