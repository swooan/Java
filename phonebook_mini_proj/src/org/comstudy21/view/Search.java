package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Search extends MyView {

	@Override
	public void display() {
		System.out.println("검색할 방법을 선택하세요.");
		System.out.print("1.이름으로 검색 2.번호로 검색 >>> ");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println("검색하실 이름을 입력하세요.");
			System.out.print(">>> ");
			String searchName = scan.next();
			
			ArrayList<People> list = (ArrayList<People>)request.get("list");
			for(People p : list) {
				if(p.getName().equals(searchName)) {					
					System.out.println(p);
				}
			}	
		}
		
		else if(choiceNum == 2) {
			System.out.println("검색하실 번호를 입력하세요.");
			System.out.print(">>> ");
			String searchPhone = scan.next();
			
			ArrayList<People> list = (ArrayList<People>)request.get("list");
			for(People p : list) {
				if(p.getPhone().equals(searchPhone)) {					
					System.out.println(p);
				}
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}
		
	}

}
