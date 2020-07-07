package controller;

import java.util.ArrayList;
import java.util.Vector;

import handler.MouseEventHandler;
import model.Dao;
import model.Dto;
import view.Reservation;

public class ShowController implements Controller {

	@Override
	public void service() {
		ArrayList<String> seatArr = new ArrayList<String>();
		
		int cnt1 = MouseEventHandler.cnt + 1;
		int dcnt1 = MouseEventHandler.dcnt + 1;
		int num;
		
		Dto dto = new Dto(cnt1, dcnt1, null);
		
		ArrayList<Integer> seats = dao.seat11(dto);
		
		for(int i =0; i<seats.size(); i++) {			
			seatArr.add(seats.get(i)+"");
		}
		
		Reservation.l1.setIcon(Reservation.white.getIcon());
		Reservation.l2.setIcon(Reservation.white.getIcon());
		Reservation.l3.setIcon(Reservation.white.getIcon());
		Reservation.l4.setIcon(Reservation.white.getIcon());
		Reservation.l5.setIcon(Reservation.white.getIcon());
		Reservation.l6.setIcon(Reservation.white.getIcon());
		Reservation.l7.setIcon(Reservation.white.getIcon());
		Reservation.l8.setIcon(Reservation.white.getIcon());
		Reservation.l9.setIcon(Reservation.white.getIcon());
		
		for(int j = 0; j < seatArr.size(); j++) {
			if(seatArr.get(j).equals(Reservation.l1.getText())) {
				Reservation.l1.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l2.getText())) {
				Reservation.l2.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l3.getText())) {
				Reservation.l3.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l4.getText())) {
				Reservation.l4.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l5.getText())) {
				Reservation.l5.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l6.getText())) {
				Reservation.l6.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l7.getText())) {
				Reservation.l7.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l8.getText())) {
				Reservation.l8.setIcon(Reservation.black.getIcon());
			}
			else if(seatArr.get(j).equals(Reservation.l9.getText())) {
				Reservation.l9.setIcon(Reservation.black.getIcon());
			}
			
		}
		
		
		
//		dm.setDataVector(dataVector, columnNames);

	}

}
