package org.comstudy21.day23;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day23Ex03 extends Frame {

	public Day23Ex03() {
		init();
		
		//Window Adapter 를 이용하여 익명 클래스 활용
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			// WindowAdapter는 추상 클래스 => 메소드 오버라이드(재정의) 한다.
			
		});
	}
	
	private void init() {
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day23Ex03();
	}
	
}
