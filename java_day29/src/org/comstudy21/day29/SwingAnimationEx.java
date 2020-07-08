package org.comstudy21.day29;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAnimationEx extends JFrame implements Runnable {
	
	int x = 10, y = 30, w = 50, h = 50;
	int stepSize = 3;
	int width = 640, height = 480;
	JLabel label = new JLabel("Âü»õ...");
	Container contentPane;
	
	public SwingAnimationEx() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.setLayout(null);
		contentPane.add(label);
		label.setBounds(x, y, w, h);
		
		setSize(width,height);
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			x += stepSize;
			label.setLocation(x,y);
			if(x >= 600 || x <= 0) {
				stepSize *= -1;
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new SwingAnimationEx().setVisible(true);

	}


}
