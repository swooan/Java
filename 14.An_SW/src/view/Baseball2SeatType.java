package view;

import static Util.Util.scan;

import Resource.Res;

public class Baseball2SeatType implements Res {
	static void timeTi() {
		int type1 = 0;
		
		try {
			do {
			System.out.println("좌석 종류를 골라주세요.");
			System.out.println("1.내야 1루석 2.내야 3루석 3.외야석");
			System.out.print(">>> ");
			type1 = scan.nextInt();
			}
			while(type1 < 1 || type1 > 3);
			request.put("type1",type1);
		} catch (Exception e) {
			scan.next();
			System.out.println("\n<<<<< 숫자를 입력해주세요 >>>>>\n");
			timeTi();
		}
		
	
	}
	
	static void timeLo() {
		int type2 = 0;
		try {
			do {
				System.out.println("시간을 골라주세요.");
				System.out.println("1.4층 일반석 2.중앙 테이블석 3.외야석");
				System.out.print(">>> ");
				type2 = scan.nextInt();				
			} while(type2 < 1 || type2 >3);
			request.put("type2",type2);
		} catch (Exception e) {
			scan.next();
			System.out.println("\n<<<<< 숫자를 입력해주세요 >>>>>\n");
			timeLo();
		}
		
	}
	
	static void timeTa() {
		int type3 = 0;
		try {
			do {
				System.out.println("시간을 골라주세요.");
				System.out.println("1.버건디석 2.다크버건디석 3.로얄다이아석");
				System.out.print(">>> ");
				type3 = scan.nextInt();				
			}
			while(type3 < 1 || type3 > 3);
			request.put("type3",type3);
		} catch (Exception e) {
			scan.next();
			System.out.println("\n<<<<< 숫자를 입력해주세요 >>>>>\n");
			timeTa();
		}
		
	}

}
