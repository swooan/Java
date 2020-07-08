package org.comstudy21.view;

public class Search extends MyView {

	@Override
	public void display() {
		System.out.println("검색 방법을 선택하세요.");
		System.out.print("이름으로 검색(1) 전화번호로 검색(2) >>> ");
		int searchNum = scan.nextInt();
		
		if(searchNum == 1) {
			System.out.print("이름 입력 >>> ");
			String searchName = scan.next();
			
				
				
			
		}
		
	}

}
