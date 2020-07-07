package controller;

import java.util.Vector;

import handler.MouseEventHandler;
import model.Dto;
import view.Reservation;

public class TypeController implements Controller {

	@Override
	public void service() {
		
//		int date = Reservation.list1.getSelectedIndex();
		int date = MouseEventHandler.cnt +1;
		
		Dto dto = new Dto(date, null);
		
		Vector<Vector> typeVector = dao.type(dto);
//		dm2.addAll(typeVector);
		
		dm2.setDataVector(typeVector, typeNames);
	}

}
