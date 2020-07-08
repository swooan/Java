package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Modify extends MyView {

	@Override
	public void display() {
		System.out.println("검색할 항목을 선택하세요.");
		System.out.print("1.이름 2.번호 >>> ");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println("이름을 입력하세요.");
			System.out.print(">>> ");
			String searchName = scan.next();
			
			ArrayList<People> list = (ArrayList<People>)request.get("list");
			ArrayList<People> searchList = new ArrayList<People>();
			for(People p : list) {
				if(p.getName().equals(searchName)) {			
					searchList.add(p);
					System.out.println(p);
				}
			}
			System.out.println("---------------------------------------");
			System.out.println("수정하실 항목을 선택하세요.");
			System.out.println("1.이름 2.번호 3.주소");
			System.out.print(">>> ");
			int modNum1 = scan.nextInt();
			if(modNum1 == 1) {
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String modName1 = scan.next();
				
				for(People p : searchList) {
					p.setName(modName1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else if(modNum1 == 2) {
				System.out.println("수정하실 번호를 입력하세요.");
				System.out.print(">>> ");
				String modPhone1 = scan.next();
				
				for(People p : searchList) {
					p.setPhone(modPhone1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else if(modNum1 == 3) {
				System.out.println("수정하실 주소를 입력하세요.");
				System.out.print(">>> ");
				String modAddress1 = scan2.nextLine();
				
				for(People p : searchList) {
					p.setAddress(modAddress1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
		}
		
		else if(choiceNum == 2) {
			System.out.println("검색하실 번호를 입력하세요.");
			System.out.print(">>> ");
			String searchPhone = scan.next();
			
			ArrayList<People> list = (ArrayList<People>)request.get("list");
			ArrayList<People> searchList1 = new ArrayList<People>();
			for(People p : list) {
				if(p.getPhone().equals(searchPhone)) {	
					searchList1.add(p);
					System.out.println(p);
				}
			}
			
			System.out.println("---------------------------------------");
			System.out.println("수정하실 항목을 선택하세요.");
			System.out.println("1.이름 2.번호 3.주소");
			System.out.print(">>> ");
			int modNum2 = scan.nextInt();
			if(modNum2 == 1) {
				System.out.println("수정하실 이름을 입력하세요.");
				System.out.print(">>> ");
				String modName1 = scan.next();
				
				for(People p : searchList1) {
					p.setName(modName1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else if(modNum2 == 2) {
				System.out.println("수정하실 번호를 입력하세요.");
				System.out.print(">>> ");
				String modPhone1 = scan.next();
				
				for(People p : searchList1) {
					p.setPhone(modPhone1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else if(modNum2 == 3) {
				System.out.println("수정하실 주소를 입력하세요.");
				System.out.print(">>> ");
				String modAddress1 = scan2.nextLine();
				
				for(People p : searchList1) {
					p.setAddress(modAddress1);
					System.out.println("수정이 완료되었습니다.");
				}
			}
		}
		
		else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}
		
	}

}
