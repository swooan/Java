package org.comstudy21.day24_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;


class MainContent extends JPanel {
	JLabel label = new JLabel("Hello Swing World");
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");	
	
	JPanel p1 = new JPanel(new GridBagLayout());
	JPanel p2 = new JPanel(new GridBagLayout());
	
	public MainContent() {
		this.setLayout(new BorderLayout());
		
		p1.add(label);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		
		this.add(p1);
		this.add(new BorderLayout().SOUTH, p2);
		
		Handler l = new Handler();
		
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		btn3.addActionListener(l);
	}
	
	class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String cmd = e.getActionCommand();
			if(e.getSource() instanceof JButton) {
				JButton btn = (JButton)e.getSource();
				
				if(btn == btn1) {
					p1.setBackground(Color.PINK);
				}
				else if(btn == btn2) {
					p1.setBackground(Color.CYAN);
				}
				else if(btn == btn3) {
					p1.setBackground(Color.GREEN);
				}
			}
			
		}
		
	}
}

public class Day24Ex22 extends JFrame {
	
	public Day24Ex22() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(new MainContent());
		
		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day24Ex22();
	}

}
