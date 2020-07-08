package org.comstudy21.day29;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bullet extends JFrame implements Runnable {
	
	int x = 320, y = 480, w = 50, h = 50;
	int stepSize = 50;
	int width = 640, height = 480;
	JLabel label = new JLabel("i");
	Container contentPane;
	
	public Bullet() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.setLayout(null);
		contentPane.add(label);
		label.setBounds(x,y,w,h);
		
		setSize(width, height);
		
		Thread thread2 = new Thread(this);
		thread2.start();
	}
	
	@Override
	public void run() {
		while(true) {
			y -= stepSize;
			label.setLocation(x, y);
			if(y <= 0) {
				new Bullet();
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new Bullet().setVisible(true);
	}


}
