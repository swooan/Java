package org.comstudy21.view;

import static java.lang.System.*;

import org.comstudy21.model.People;

public class Input extends MyView {

	@Override
	public void display() {
		out.print("���� �Է� >>> ");
		String name = scan.next();
		out.print("��ȭ��ȣ �Է� >>> ");
		String phone = scan.next();
		out.print("�ּ� �Է� >>> ");
		String address = scan2.nextLine(); // ���� ����
		
		// ���ε� ��Ű�� controller�� ���ư���.
		request.put("dto", new People(0, name, phone, address));
	}

}
