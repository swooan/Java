package org.comstudy21.day24_2;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Day24Ex21 extends JFrame {
	
	JPanel content = null; // => J �г��� ����Ʈ�� �ٿ� ĳ�����ؾ��Ѵ�.
	
	JLabel label = new JLabel("JFrame test");
	JPanel p1 = new JPanel(new GridBagLayout()); 
	public Day24Ex21() {
		// 0. dafaultColseOpertation() => ���� ��� ����
		// 1. ContentPanel�� �޾ƿ´�.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		content = (JPanel)getContentPane(); // => �г� �ٿ�ĳ����
		
		p1.add(label);
		content.add(p1);
		
		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day24Ex21();
	}
}
