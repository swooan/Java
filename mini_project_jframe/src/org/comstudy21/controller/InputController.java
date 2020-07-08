package org.comstudy21.controller;

import org.comstudy21.model.Dto;

public class InputController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
//		System.out.println("Service - InputController");
		
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		
		Dto dto = new Dto(0, name, email, phone);
		dao.insert(dto);
		
		nameField.setText("");
		emailField.setText("");
		phoneField.setText("");
	}

}
