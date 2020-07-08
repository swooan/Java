package org.comstudy21.day24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Inner Class (Ŭ���� ���ο� Ŭ���� ����)
class BtnEvtHandeler implements ActionListener {
	
	Button btn1;
	Button btn2;
	
	Label label;
	
	public BtnEvtHandeler(Button btn1, Button btn2, Label label) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� �������ϴ�.");
		
		String actionCmd = e.getActionCommand();
		if(e.getSource() instanceof Button) {
			Button btn = (Button)e.getSource();
			String msg = "btn1";
			if(btn == btn1) {
				msg = "btn2";
			}
			msg = actionCmd + " : ��ư�� �������ϴ�.";
			label.setText(msg);									
		}
		
	}
}

public class Day24Ex1_2 extends MyFrame {
	
	Label label = new Label("[���] : �ƹ� ��ư�� ������ �ʾҽ��ϴ�.");
	
	Button btn1 = new Button("��ư1");
	Button btn2 = new Button("��ư2");
	
	Panel panel1 = new Panel(new FlowLayout());
	Panel panel2 = new Panel(new GridBagLayout());
	
	
	public Day24Ex1_2() {
		
		panel1.add(btn1);
		panel1.add(btn2);
		
		panel2.add(label);	
		add(panel2);
		
		add(new BorderLayout().SOUTH, panel1);
		
		BtnEvtHandeler l = new BtnEvtHandeler(btn1,btn2,label);
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Day24Ex1_2();
	}
}
