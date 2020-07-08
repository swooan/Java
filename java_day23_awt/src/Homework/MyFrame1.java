package Homework;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.comstudy21.day23_2.MyFrame;

public class MyFrame1 extends Frame{

	public MyFrame1() {
		this(800,450);
	}
	
	public MyFrame1(int w, int h) {
		this("Calculator",w,h);
	}
	
	public MyFrame1(String title, int w, int h) {
		
		setTitle(title);
		setSize(w, h);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}
	
}
