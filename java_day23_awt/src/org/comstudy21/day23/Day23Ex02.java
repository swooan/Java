package org.comstudy21.day23;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Day23Ex02 extends Frame implements WindowListener{
	
	public Day23Ex02() {
		// this. 생략
		setSize(640, 480);
		setBackground(Color.MAGENTA);
		setVisible(true);
		
		this.addWindowListener(this); // 윈도우 창에 관련된 이벤트를 제어하는 역할
	}

	// 닫기 버튼에 이벤트 설정
	// 이벤트 인터페이스를 상속받기 -> 추상 메소드 구현
	
	
	public static void main(String[] args) {
		Frame window = new Day23Ex02();
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기 버튼을 누름");
		dispose();
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
