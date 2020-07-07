package controller;

import java.util.Vector;

import model.Dto;
import view.Update;

public class Search2Controller implements Controller {

	String name;
	
	@Override
	public void service() {
		name = Update.tf1.getText();
		
		
		Dto dto = new Dto(0,null,0,null,0,name);
		
		Vector<Vector> list = dao.search(dto);

		dm4.setDataVector(list, typeNames3);

	}

}
