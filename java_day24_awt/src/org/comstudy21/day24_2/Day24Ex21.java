package org.comstudy21.day24_2;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Day24Ex21 extends JFrame {
	
	JPanel content = null; // => J 패널을 콘텐트로 다운 캐스팅해야한다.
	
	JLabel label = new JLabel("JFrame test");
	JPanel p1 = new JPanel(new GridBagLayout()); 
	public Day24Ex21() {
		// 0. dafaultColseOpertation() => 종료 기능 구현
		// 1. ContentPanel을 받아온다.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		content = (JPanel)getContentPane(); // => 패널 다운캐스팅
		
		p1.add(label);
		content.add(p1);
		
		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day24Ex21();
	}
}
