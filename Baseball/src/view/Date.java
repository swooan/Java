package view;

import static util.MyUtil.*;

import resource.Res;

public class Date implements Res {
	
	static void days() {
		
		System.out.println("원하시는 날짜를 선택해주세요~");
		System.out.println("--------------------");
		System.out.println("1. 5월 26일");
		System.out.println("2. 5월 27일");
		System.out.println("3. 5월 28일");
		System.out.print(">>> ");
		int dateNo = scan.nextInt();
		
		if(dateNo < 1 || dateNo >3) {
			System.out.println("잘못 입력하셨습니다.");
			days();
		}
		else {
			
		request.put("dateNo", dateNo);
		
		}
	}
	
}
