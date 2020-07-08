package org.comstudy21.day23_2;

import java.awt.Button;
import java.awt.FlowLayout;

public class Day23Ex04 extends MyFrame {
	// 유능한 개발자 - 두번작업하지 않는다 ( 상속등 이용)
	// Is A 관계이기 때문에 이 클래스는 MyFrame 클래스이다
	public Day23Ex04() {
		this("default window", 100, 200);

	}
	
	
	
	public Day23Ex04(String title, int w, int h) {
		// 부모의 생성자 호출
		super(title, w, h);
		
		//레이아웃 설정은 이곳에서
		initLayout();
		
		// MyFrame 에는 setVisible() 설정이 없다.
		// setVisible() 은 모든 설정 후에 마지막에 호출
		setVisible(true);
	}
	
	private void initLayout() {
		// FlowLayout으로 레이아웃 설정
		this.setLayout(new FlowLayout());
		this.add(new Button("BTN1"));
		this.add(new Button("BTN2"));
		this.add(new Button("BTN3"));
		this.add(new Button("BTN4"));
		this.add(new Button("BTN5"));
		this.add(new Button("BTN6"));
		}

	public static void main(String[] args) {
		//객체생성하면 Frame이 생성된다.
		new Day23Ex04("레이아웃 매니저 연습", 1920, 1080);
		
	}
	
}
