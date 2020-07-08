package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Search extends MyView {

	@Override
	public void display() {
		System.out.println("�˻��� ����� �����ϼ���.");
		System.out.print("1.�̸����� �˻� 2.��ȣ�� �˻� >>> ");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println("�˻��Ͻ� �̸��� �Է��ϼ���.");
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
			System.out.println("�˻��Ͻ� ��ȣ�� �Է��ϼ���.");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			display();
		}
		
	}

}
