package controller;

import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Dto;
import view.Reservation;
import view.Update;

public class UpdateController implements Controller {
	String name2;
	JTextField tf2 = new JTextField(15);

	@Override
	public void service() {
		
		JTextField tf2 = new JTextField();
		JOptionPane.showMessageDialog(null, tf2, "이름을 입력하세요",1);
		
		if(tf2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 넣으셔야 합니다.");
			name2 = null;
			
			new Update();
		}
		else {
			JOptionPane.showMessageDialog(null, "예약자 수정이 완료되었습니다.");
			
			String name2 = tf2.getText();
						
			String name = nameField.getText();
			String date = date1Field.getText();
			String type = type1Field.getText();
			int num = Integer.parseInt(numField.getText());
			
			Dto dto = new Dto(name, date, type, num, name2);
			
			dao.update(dto);
			
			tf2.setText("");
		}
		

		
	}
	
}
