package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Delete extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: DELETE ::::");
		
		
		puts("���� �� idx �Է� >>> ");
		int idx = scan.nextInt();
		
		request.put("dto", new PhonebookDto(idx,null,null,null));
	}

}
