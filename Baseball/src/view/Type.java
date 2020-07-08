package view;

import resource.Res;
import static util.MyUtil.*;

public class Type implements Res {
	
	static void timeTi() {
		System.out.println("좌석 종류를 골라주세요.");
		System.out.println("1.내야 1루석 2.내야 3루석 3.외야석");
		System.out.print(">>> ");
		int type1 = scan.nextInt();
		
		request.put("type1",type1);
	
	}
	
	static void timeLo() {
		System.out.println("시간을 골라주세요.");
		System.out.println("1.4층 일반석 2.중앙 테이블석 3.외야석");
		System.out.print(">>> ");
		int type2 = scan.nextInt();
		
		request.put("type2",type2);
	}
	
	static void timeTa() {
		System.out.println("시간을 골라주세요.");
		System.out.println("1.버건디석 2.다크버건디석 3.로얄다이아석");
		System.out.print(">>> ");
		int type3 = scan.nextInt();
		
		request.put("type3",type3);
	}

}
