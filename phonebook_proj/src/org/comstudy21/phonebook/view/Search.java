package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Search extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: SEARCH ::::");
		puts("검색 할 이름 입력 >>> ");
		String name = scan.next();
		request.put("dto" , new PhonebookDto(0, name, null, null));

	}

}
