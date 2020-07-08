package org.comstudy21.day23_2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	public MyFrame() {
		this(1280, 720);
		
	}
	
	public MyFrame(int width, int height) {
		this("MyFrame", width, height);
	}
	
	public MyFrame(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// �����׽�Ʈ(TDD - �׽�Ʈ �ֵ� ����)
		
		MyFrame window = new MyFrame("MyFrame test", 1280, 720);
		window.setVisible(true);
	}
	
}


