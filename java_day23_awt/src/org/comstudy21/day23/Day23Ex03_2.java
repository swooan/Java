package org.comstudy21.day23;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day23Ex03_2 extends Frame {
	
	public Day23Ex03_2() {
		init();
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
			
			
		});
		
	}
	
private void init() {
		setSize(1280,720);
		setBackground(Color.DARK_GRAY);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Day23Ex03_2();
		
	}
}
