package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Input extends PhonebookView {

	@Override
	protected void display() {
		// ���� ��ƿ Ŭ������ puts / putsln �Լ��� �����ؼ� Ȱ��
		System.out.println(":::: INPUT ::::");
		puts("���� �Է� >>> ");
		String name = scan.next();
		puts("��ȭ��ȣ �Է� >>> ");
		String phone = scan.next();
		puts("�̸��� �Է� >>> ");
		String email = scan.next();
		
		// �Է¹��� ������ dto ��ü�� ��Ƽ� request�� ���ε��Ѵ�.
		PhonebookDto dto = new PhonebookDto(0, name, phone, email);
		request.put("dto",dto);
		// �Է� �Ϸ� �� controller�� �̵��Ѵ�.
	}

}
