package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Input extends PhonebookView {

	@Override
	protected void display() {
		// 마이 유틸 클래스에 puts / putsln 함수를 선언해서 활용
		System.out.println(":::: INPUT ::::");
		puts("성명 입력 >>> ");
		String name = scan.next();
		puts("전화번호 입력 >>> ");
		String phone = scan.next();
		puts("이메일 입력 >>> ");
		String email = scan.next();
		
		// 입력받은 정보를 dto 객체에 담아서 request에 바인딩한다.
		PhonebookDto dto = new PhonebookDto(0, name, phone, email);
		request.put("dto",dto);
		// 입력 완료 후 controller로 이동한다.
	}

}
