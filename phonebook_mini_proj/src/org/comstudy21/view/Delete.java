package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Delete extends MyView {

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>) request.get("list");
		for (People p : list) {
			System.out.println(p);
		}

		System.out.print("������ �׸��� ��ȣ�� �Է����ּ��� >>> ");
		int delNum = scan.nextInt();

		for (People p : list) {
			if (p.getIdx() == delNum) {
				list.remove(p);
				dao.remove();
				break;
			}

		}
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
		for (People p : list) {
			if(p.getIdx() > delNum) {
				p.setIdx(p.getIdx()-1);
			}
		}

	}
}
