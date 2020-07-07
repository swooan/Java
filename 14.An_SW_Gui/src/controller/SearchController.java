package controller;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import handler.MouseEventHandler;
import model.Dto;
import view.Search;

public class SearchController implements Controller {

		String name;
		
	@Override
	public void service() {

		name = Search.tf1.getText();
		
		Dto dto = new Dto(0,null,0,null,0,name);
		
		Vector<Vector> list = dao.search(dto);

		dm3.setDataVector(list, typeNames2);
		
	}

}
