package controller;

import java.util.Vector;

import model.Dto;
import view.Delete;
import view.Update;

public class Search3Controller implements Controller {

String name;
	
	@Override
	public void service() {
		name = Delete.tf1.getText();
		
		
		Dto dto = new Dto(0,null,0,null,0,name);
		
		Vector<Vector> list = dao.search(dto);

		dm5.setDataVector(list, typeNames4);

	}

}
