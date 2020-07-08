package org.comstudy21.view;

import static java.lang.System.*;

import org.comstudy21.model.People;

public class Input extends MyView {

	@Override
	public void display() {
		out.print("성명 입력 >>> ");
		String name = scan.next();
		out.print("전화번호 입력 >>> ");
		String phone = scan.next();
		out.print("주소 입력 >>> ");
		String address = scan2.nextLine(); // 띄어쓰기 가능
		
		// 바인딩 시키고 controller로 돌아간다.
		request.put("dto", new People(0, name, phone, address));
	}

}
