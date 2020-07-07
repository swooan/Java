package view;

public class Baseball2Reservation extends Baseball2View {

	@Override
	public void show() {
		Baseball2Timetable.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Baseball2SeatType.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				Baseball2Seats.seat11();
			} else if (type1 == 2) {
				Baseball2Seats.seat12();
			} else if (type1 == 3) {
				Baseball2Seats.seat13();
			}
		} else if (dateNo == 2) {
			Baseball2SeatType.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				Baseball2Seats.seat21();
			} else if (type2 == 2) {
				Baseball2Seats.seat22();
			} else if (type2 == 3) {
				Baseball2Seats.seat23();
			}
		} else if (dateNo == 3) {
			Baseball2SeatType.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				Baseball2Seats.seat31();
			} else if (type3 == 2) {
				Baseball2Seats.seat32();
			} else if (type3 == 3) {
				Baseball2Seats.seat33();
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

	}

}
