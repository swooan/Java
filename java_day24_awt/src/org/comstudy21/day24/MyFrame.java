package org.comstudy21.day24;


import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
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
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (int)(screen.getWidth()/2 - width/2);
		int y = (int)(screen.getHeight()/2 - height/2);
		setLocation(x,y);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// 단위테스트(TDD - 테스트 주도 개발)
		
		MyFrame window = new MyFrame("MyFrame test", 1280, 720);
		window.setVisible(true);
	}
	
}


