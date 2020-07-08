package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Modify extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: MODIFY ::::");
		puts("���� �� idx �Է� >>> ");
		int idx = scan.nextInt();
		// ��ȿ�� üũ - ����
		puts("�� �̸� >>> ");
		String name = scan.next();
		puts("�� ��ȭ��ȣ >>> ");
		String phone = scan.next();
		puts("�� �̸��� >>> ");
		String email = scan.next();
		
		request.put("dto", new PhonebookDto(idx, name, phone, email));
	}

}
