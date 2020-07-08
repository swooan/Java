package org.comstudy21.day20.thread_ex2;

class MyThread implements Runnable {
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

public class Day20Ex06 {

	public static void main(String[] args) {
		// Runnable 인터페이스에는 start() 메소드가 없다.
		// Runnable 객체를 Thread 객체로 만든다.
		MyThread target = new MyThread();
		Thread runnable = new Thread(target);
		runnable.start();

		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			// 메인에 i가 20일 때 쓰레드를 멈추고 i가 30이 되면 쓰레드를 재구동
			if(i == 20) {
				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(thread.getName());
		}

	}

}
