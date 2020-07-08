package org.comstudy21.day24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Day24Ex01 extends MyFrame {
	
	Label label = new Label("[결과] : 아무 버튼도 눌리지 않았습니다.");
	
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2");
	
	Panel panel1 = new Panel(new FlowLayout());
	Panel panel2 = new Panel(new GridBagLayout());
	
	
	public Day24Ex01() {
		
		panel1.add(btn1);
		panel1.add(btn2);
		
		
		panel2.add(label);	
		add(panel2);

		add(new BorderLayout().SOUTH, panel1);
		
		BtnEvtHandeler l = new BtnEvtHandeler();
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
		setVisible(true);
		
	}
	
	// Inner Class (클래스 내부에 클래스 선언)
	class BtnEvtHandeler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("버튼을 눌렀습니다.");
			
			String actionCmd = e.getActionCommand();
			if(e.getSource() instanceof Button) {
				Button btn = (Button)e.getSource();
				String msg = "btn1";
				if(btn == btn1) {
					msg = "btn2";
				}
				msg = actionCmd + " : 버튼을 눌렀습니다.";
				label.setText(msg);									
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Day24Ex01();
	}
}
