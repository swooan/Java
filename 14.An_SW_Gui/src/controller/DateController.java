package controller;

import java.util.Vector;

import model.Dao;
import model.Dto;

public class DateController implements Controller {

	@Override
	public void service() {
		Vector<Vector> dateVector = dao.date();
//		dm1.addAll(dateVector);
		dm1.setDataVector(dateVector, dateNames);
		
	}

}
