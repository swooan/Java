package view;

import static util.MyUtil.*;

public class Main extends ViewMain {
	
	@Override
	protected void display() {
		System.out.println("<<<< 고척 스카이돔 예매 사이트 >>>>");
		System.out.println("==========================");
		System.out.println("\n원하시는 메뉴를 선택하세요");
		System.out.println("1.예매 2.좌석 확인 3.내 예매 정보 4.예매 내역 수정 5.예매 취소 6.종료");
		System.out.print(">>> ");
		int no = scan.nextInt();
		
		request.put("no",no);
	}
	
}
