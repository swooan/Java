package view;

import static util.MyUtil.*;

import java.util.ArrayList;

import model.BaseballDto;

public class Search extends ViewMain {

	@Override
	protected void display() {
		Date.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Type.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists11");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type1 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists12");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type1 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists13");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			}
		} else if (dateNo == 2) {
			Type.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists21");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type2 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists22");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type2 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists23");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			}
		} else if (dateNo == 3) {
			Type.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists31");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type3 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists32");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
			} else if (type3 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("lists33");
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
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
