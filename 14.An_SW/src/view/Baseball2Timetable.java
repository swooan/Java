package view;

import static Util.Util.scan;

import Resource.Res;

public class Baseball2Timetable implements Res {
	
static void days() {
		
		int dateNo = 0;
		try {
			System.out.println("원하시는 날짜를 선택해주세요~");
			System.out.println("--------------------");
			System.out.println("1. 5월 26일");
			System.out.println("2. 5월 27일");
			System.out.println("3. 5월 28일");
			System.out.print(">>> ");
			dateNo = scan.nextInt();
			if(dateNo < 1 || dateNo >3) {
				System.out.println("잘못 입력하셨습니다.");
				days();
			}
			else {
				
				request.put("dateNo", dateNo);
				
			}
		} catch (Exception e) {
			System.out.println("\n<<<<< 숫자를 입력해주세요 >>>>>\n");
			scan.nextLine();
			days();
		}
		
	}

}
