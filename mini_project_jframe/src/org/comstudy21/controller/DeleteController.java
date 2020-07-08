package org.comstudy21.controller;

import org.comstudy21.model.Dto;

public class DeleteController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		// System.out.println("Service - DeleteController");
		
		int no = Integer.parseInt(noLabel.getText().trim()); 
		Dto dto = new Dto(no, null, null, null);
		dao.delete(dto);
		
		listController.service();
		
		nameField.setText("");
		emailField.setText("");
		phoneField.setText("");
		noLabel.setText("");
	}

}
