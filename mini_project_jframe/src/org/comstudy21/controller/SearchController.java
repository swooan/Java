package org.comstudy21.controller;

import java.util.Vector;

import org.comstudy21.model.Dto;

public class SearchController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
//		System.out.println("Service - SearchController");
		String name = nameField.getText();
		
		Dto dto = new Dto(0, name, null, null);
//		Dto searchDto = dao.select(dto);
//		nameField.setText(searchDto.getName());
//		emailField.setText(searchDto.getEmail());
//		phoneField.setText(searchDto.getPhone());
//		noLabel.setText(""+searchDto.getNo());
		
		Vector<Vector> dataVector = dao.select(dto);
		dm.setDataVector(dataVector, columnNames);
	}

}
