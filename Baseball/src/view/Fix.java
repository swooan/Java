package view;

import static util.MyUtil.*;

import java.util.ArrayList;

import model.BaseballDto;

public class Fix extends ViewMain {

	@Override
	protected void display() {
		Date.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Type.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				System.out.println("예약하신 분의 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf11");
				ArrayList<BaseballDto> searchList11 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList11.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList11) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof11",new BaseballDto(fixName,a,b));
				}
				
			} else if (type1 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf12");
				ArrayList<BaseballDto> searchList12 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList12.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList12) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof12",new BaseballDto(fixName,a,b));
				}
			} else if (type1 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf13");
				ArrayList<BaseballDto> searchList13 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList13.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList13) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof13",new BaseballDto(fixName,a,b));
				}
			}
		} else if (dateNo == 2) {
			Type.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf21");
				ArrayList<BaseballDto> searchList21 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList21.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList21) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof21",new BaseballDto(fixName,a,b));
				}
			} else if (type2 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf22");
				ArrayList<BaseballDto> searchList22 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList22.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList22) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof22",new BaseballDto(fixName,a,b));
				}
			} else if (type2 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf23");
				ArrayList<BaseballDto> searchList23 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList23.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList23) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof23",new BaseballDto(fixName,a,b));
				}
			}
		} else if (dateNo == 3) {
			Type.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf31");
				ArrayList<BaseballDto> searchList31 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList31.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList31) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof31",new BaseballDto(fixName,a,b));
				}
			} else if (type3 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf32");
				ArrayList<BaseballDto> searchList32 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList32.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList32) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof32",new BaseballDto(fixName,a,b));
				}
			} else if (type3 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listf33");
				ArrayList<BaseballDto> searchList33 = new ArrayList<BaseballDto>();
				boolean flag = false;
				for(BaseballDto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList33.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					if(flag = false) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(BaseballDto s11 : searchList33) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof33",new BaseballDto(fixName,a,b));
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

	}

}