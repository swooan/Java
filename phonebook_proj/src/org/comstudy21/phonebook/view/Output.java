package org.comstudy21.phonebook.view;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Output extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: OUTPUT ::::");
		ArrayList<PhonebookDto> list = (ArrayList<PhonebookDto>)request.get("list");
		for(PhonebookDto dto : list) {
			System.out.println(dto);
		}
	}
}
