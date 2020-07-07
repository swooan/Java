package controller;

import java.util.ArrayList;
import java.util.Vector;

import handler.MouseEventHandler;
import model.Dto;
import view.Output;

public class OutputController implements Controller {

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
		
		Output.l1.setIcon(Output.white.getIcon());
		Output.l2.setIcon(Output.white.getIcon());
		Output.l3.setIcon(Output.white.getIcon());
		Output.l4.setIcon(Output.white.getIcon());
		Output.l5.setIcon(Output.white.getIcon());
		Output.l6.setIcon(Output.white.getIcon());
		Output.l7.setIcon(Output.white.getIcon());
		Output.l8.setIcon(Output.white.getIcon());
		Output.l9.setIcon(Output.white.getIcon());
		
		for(int j = 0; j < seatArr.size(); j++) {
			if(seatArr.get(j).equals(Output.l1.getText())) {
				Output.l1.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l2.getText())) {
				Output.l2.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l3.getText())) {
				Output.l3.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l4.getText())) {
				Output.l4.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l5.getText())) {
				Output.l5.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l6.getText())) {
				Output.l6.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l7.getText())) {
				Output.l7.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l8.getText())) {
				Output.l8.setIcon(Output.black.getIcon());
			}
			else if(seatArr.get(j).equals(Output.l9.getText())) {
				Output.l9.setIcon(Output.black.getIcon());
			}
			
		}
		
	}

}
