package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Modify extends MyView {

	@Override
	public void display() {
		System.out.println("�˻��� �׸��� �����ϼ���.");
		System.out.print("1.�̸� 2.��ȣ >>> ");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println("�̸��� �Է��ϼ���.");
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
			System.out.println("�����Ͻ� �׸��� �����ϼ���.");
			System.out.println("1.�̸� 2.��ȣ 3.�ּ�");
			System.out.print(">>> ");
			int modNum1 = scan.nextInt();
			if(modNum1 == 1) {
				System.out.println("�����Ͻ� �̸��� �Է��ϼ���.");
				System.out.print(">>> ");
				String modName1 = scan.next();
				
				for(People p : searchList) {
					p.setName(modName1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
			else if(modNum1 == 2) {
				System.out.println("�����Ͻ� ��ȣ�� �Է��ϼ���.");
				System.out.print(">>> ");
				String modPhone1 = scan.next();
				
				for(People p : searchList) {
					p.setPhone(modPhone1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
			else if(modNum1 == 3) {
				System.out.println("�����Ͻ� �ּҸ� �Է��ϼ���.");
				System.out.print(">>> ");
				String modAddress1 = scan2.nextLine();
				
				for(People p : searchList) {
					p.setAddress(modAddress1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
		}
		
		else if(choiceNum == 2) {
			System.out.println("�˻��Ͻ� ��ȣ�� �Է��ϼ���.");
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
			System.out.println("�����Ͻ� �׸��� �����ϼ���.");
			System.out.println("1.�̸� 2.��ȣ 3.�ּ�");
			System.out.print(">>> ");
			int modNum2 = scan.nextInt();
			if(modNum2 == 1) {
				System.out.println("�����Ͻ� �̸��� �Է��ϼ���.");
				System.out.print(">>> ");
				String modName1 = scan.next();
				
				for(People p : searchList1) {
					p.setName(modName1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
			else if(modNum2 == 2) {
				System.out.println("�����Ͻ� ��ȣ�� �Է��ϼ���.");
				System.out.print(">>> ");
				String modPhone1 = scan.next();
				
				for(People p : searchList1) {
					p.setPhone(modPhone1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
			else if(modNum2 == 3) {
				System.out.println("�����Ͻ� �ּҸ� �Է��ϼ���.");
				System.out.print(">>> ");
				String modAddress1 = scan2.nextLine();
				
				for(People p : searchList1) {
					p.setAddress(modAddress1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			}
		}
		
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			display();
		}
		
	}

}
