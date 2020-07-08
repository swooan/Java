package org.comstudy21.controller;

import java.util.Vector;

import org.comstudy21.model.Dto;

public class ListController implements Controller {

	@Override
	public void service() {
//		System.out.println("Service - ListController");
		
		Vector<Vector> dataVector = dao.selectAll();
		dm.setDataVector(dataVector, columnNames);

	}

}
