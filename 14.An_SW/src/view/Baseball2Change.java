package view;

import static Util.Util.scan;

import java.util.ArrayList;

import model.Baseball2Dto;

public class Baseball2Change extends Baseball2View {

	@Override
	public void show() {
		Baseball2Timetable.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Baseball2SeatType.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				System.out.println("예약하신 분의 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf11");
				ArrayList<Baseball2Dto> searchList11 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList11.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList11) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof11",new Baseball2Dto(fixName,a,b));
				}
				
			} else if (type1 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf12");
				ArrayList<Baseball2Dto> searchList12 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList12.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList12) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof12",new Baseball2Dto(fixName,a,b));
				}
			} else if (type1 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf13");
				ArrayList<Baseball2Dto> searchList13 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList13.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList13) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof13",new Baseball2Dto(fixName,a,b));
				}
			}
		} else if (dateNo == 2) {
			Baseball2SeatType.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf21");
				ArrayList<Baseball2Dto> searchList21 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList21.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList21) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof21",new Baseball2Dto(fixName,a,b));
				}
			} else if (type2 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf22");
				ArrayList<Baseball2Dto> searchList22 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList22.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList22) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof22",new Baseball2Dto(fixName,a,b));
				}
			} else if (type2 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf23");
				ArrayList<Baseball2Dto> searchList23 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList23.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList23) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof23",new Baseball2Dto(fixName,a,b));
				}
			}
		} else if (dateNo == 3) {
			Baseball2SeatType.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf31");
				ArrayList<Baseball2Dto> searchList31 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList31.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList31) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof31",new Baseball2Dto(fixName,a,b));
				}
			} else if (type3 == 2) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf32");
				ArrayList<Baseball2Dto> searchList32 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList32.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList32) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof32",new Baseball2Dto(fixName,a,b));
				}
			} else if (type3 == 3) {
				System.out.println("검색하실 이름을 입력하세요.");
				String searchName = scan.next();
				
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listf33");
				ArrayList<Baseball2Dto> searchList33 = new ArrayList<Baseball2Dto>();
				boolean flag = false;
				for(Baseball2Dto s11 : b11) {
					if(s11.getName().equals(searchName)) {
						searchList33.add(s11);
						System.out.println(s11);
						flag = true;
						break;
					}
					else if(!flag) {
						System.out.println("이름을 찾을 수 없습니다.");
						display();
					}
				}
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String fixName = scan.next();
				
				for(Baseball2Dto s11 : searchList33) {
					s11.setName(fixName);
					System.out.println("예약자 변경이 완료되었습니다.");
					System.out.println(s11);
					int a = s11.getArr();
					int b = s11.getCol();
					request.put("dtof33",new Baseball2Dto(fixName,a,b));
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

	}

}