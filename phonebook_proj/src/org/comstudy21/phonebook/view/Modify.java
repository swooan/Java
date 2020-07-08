package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Modify extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: MODIFY ::::");
		puts("수정 할 idx 입력 >>> ");
		int idx = scan.nextInt();
		// 유효성 체크 - 생략
		puts("새 이름 >>> ");
		String name = scan.next();
		puts("새 전화번호 >>> ");
		String phone = scan.next();
		puts("새 이메일 >>> ");
		String email = scan.next();
		
		request.put("dto", new PhonebookDto(idx, name, phone, email));
	}

}
