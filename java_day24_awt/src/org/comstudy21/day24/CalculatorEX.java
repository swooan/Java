package org.comstudy21.day24;

import java.awt.*;

public class CalculatorEX extends MyFrame{
	
	Panel p1 = new Panel(new GridLayout(6,1, 5,5));
	Panel p2 = new Panel(new GridLayout(6,2,5,5));
	Panel p3 = new Panel(new GridLayout(3,1,5,5));
	Panel keyboard = new Panel(new FlowLayout());
	
	Button[] btns1 = new Button[11];
	Button[] btns2 = new Button[12];
	Button[] btns3 = new Button[5];
	
	String[] txt1 = {
		"MC", "MR", 
		"<-", "CE", 
		"7", "8", 
		"4", "5", 
		"1", "2",
		"0"	
	};
	String[] txt2 = {
			"MS", "M+", 
			"C", "¡¾",
			"9", "/", 
			"6", "*", 
			"3", "-", 
			".", "+"	
	};
	String[] txt3 = {
			"M-", "¡î", "%", "1/x", "="	
	};
	
	{
		for(int i = 0; i < btns1.length; i++) {
			btns1[i] = new Button(txt1[i]);
			btns2[i] = new Button(txt2[i]);
		}
		btns2[11] = new Button(txt2[11]);
		for(int i=0; i<btns3.length; i++) {
			btns3[i] = new Button(txt3[i]);
		}
	}
	
	public CalculatorEX() {
		super(200, 250);
		
		int cnt = 0;
		
		Panel row = null;
		
		for(int i=0; i<5; i++) {
			row = new Panel(new GridLayout(1,2,5,5));
			row.add(btns1[cnt++]);
			row.add(btns1[cnt++]);
			p1.add(row);
		}

		p1.add(btns1[cnt]);
		
		for(int i = 0; i < btns2.length; i++) {
			p2.add(btns2[i]);
		}
		
		cnt = 0;
		for(int i = 0; i < 2; i++) {
			row = new Panel(new GridLayout(2,1,5,5));
			row.add(btns3[cnt++]);
			row.add(btns3[cnt++]);
			p3.add(row);
		}
		p3.add(btns3[cnt]);
		
		keyboard.add(p1);
		keyboard.add(p2);
		keyboard.add(p3);
		add(keyboard);
		
		TextField txtField = new TextField("0",23);
		Panel txtPanel = new Panel();
		txtPanel.add(txtField);
//		txtField.setBounds(0, 10, 200, 30);
		add(BorderLayout.NORTH, txtPanel);
		
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new CalculatorEX();
	}
}
