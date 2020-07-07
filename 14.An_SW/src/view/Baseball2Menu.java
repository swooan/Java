package view;

import static Util.Util.scan;

public class Baseball2Menu extends Baseball2View {

	@Override
	public void show() {
		int no = 0;
		
		try {
			
		System.out.println("<<<< 고척 스카이돔 예매 사이트 >>>>");
		System.out.println("==========================");
		
		do {
			System.out.println("\n원하시는 메뉴를 선택하세요");
			System.out.println("1.예매 2.좌석 확인 3.내 예매 정보 4.예매 내역 수정 5.예매 취소 6.종료");
			System.out.print(">>> ");
				no = scan.nextInt();
		} while (no < 1 || no > 6);

		request.put("no", no);
		
		} catch (Exception e) {
			scan.nextLine();
			System.out.println("\n<<<<< 숫자를 입력해주세요 >>>>>\n");
			show();
		}

	}

}
