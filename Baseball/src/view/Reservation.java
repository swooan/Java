package view;

import java.util.Hashtable;
import java.util.Map;

import model.BaseballDto;

public class Reservation extends ViewMain {
	
	@Override
	protected void display() {
		Date.days();
		
		int dateNo = (int)request.get("dateNo");
				
		if(dateNo == 1) {
			Type.timeTi();
			int type1 = (int)request.get("type1");
			if(type1 == 1) {
				Seats.seat11();
			}
			else if(type1 == 2) {
				Seats.seat12();
			}
			else if (type1 == 3) {
				Seats.seat13();
			}
		}
		else if(dateNo == 2) {
			Type.timeLo();
			int type2 = (int)request.get("type2");
			if(type2 == 1) {
				Seats.seat21();
			}
			else if(type2 == 2) {
				Seats.seat22();
			}
			else if(type2 == 3) {
				Seats.seat23();
			}
		}
		else if(dateNo == 3) {
			Type.timeTa();
			int type3 = (int)request.get("type3");
			if(type3 == 1) {
				Seats.seat31();
			}
			else if(type3 == 2) {
				Seats.seat32();
			}
			else if(type3 == 3) {
				Seats.seat33();
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

		
	}

}
