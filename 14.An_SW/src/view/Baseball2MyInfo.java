package view;

import static Util.Util.scan;

import java.util.ArrayList;

import model.Baseball2Dto;

public class Baseball2MyInfo extends Baseball2View {

	@Override
	public void show() {
		Baseball2Timetable.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Baseball2SeatType.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists11");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type1 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists12");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type1 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists13");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			}
		} else if (dateNo == 2) {
			Baseball2SeatType.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists21");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type2 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists22");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type2 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists23");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			}
		} else if (dateNo == 3) {
			Baseball2SeatType.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists31");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type3 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists32");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type3 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("lists33");
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

	}

}
