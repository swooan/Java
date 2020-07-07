package controller;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import handler.MouseEventHandler;
import model.Dto;
import view.Reservation;

public class Seat22Controller implements Controller {

	JDialog nameDia;
	JButton b1 = new JButton("확인");
	JLabel la1 = new JLabel("이름을 입력하세요 : ");
	JTextField tf1 = new JTextField(15);
	JFrame f = new JFrame("parent");
	
	String name;

	@Override
	public void service() {

		int cnt =2;
		String date = "6월 24일";
		int dcnt =2;
		String type = "4층 일반석";
		int num =MouseEventHandler.num;
		JOptionPane.showMessageDialog(null, tf1, "이름을 입력하세요",1);
		if(tf1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 넣으셔야 합니다.");
			name = null;
			new Reservation();
		}
		else {
			JOptionPane.showMessageDialog(null, "예약이 완료되었습니다.");
			
			name = tf1.getText();
			tf1.setText("");
			
			Dto dto = new Dto(cnt,date,dcnt,type,num,name);
			dao.reservation(dto);
			
		}


	}

}
