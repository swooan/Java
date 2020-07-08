package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhonebookController implements R {
	
	PhonebookDto dto;
	
	private void outputCmd() {
		ArrayList<PhonebookDto> list = dao.selectAll();
		request.put("list", list);
		views[OUTPUT].show();
	}
	
	public void service() {
		
		// menu.show(); R�� �޴� ȣ�⹮�� �ٲ����� �Ʒ��� ���� �ٲ��ش�.
		
		views[MENU].show();

		// System.out.println(request.get("no")); getNum �� �� ������ �׽�Ʈ

		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			// �Է��� ������ request�� ������ ���� ���̴�.
			// �Է� ���� ������ Dao�� �Ѱ��ش�.
			// System.out.println(request.get("dto")); - dto�� �� ���� Ȯ��
			dao.insert((PhonebookDto)request.get("dto"));
			break;
		case OUTPUT:
			outputCmd();
			break;
		case SEARCH:
			views[SEARCH].show();
			// request ���� dto�� �����´�.
			PhonebookDto dto = (PhonebookDto)request.get("dto");
			System.out.println(dto);
			ArrayList<PhonebookDto> searchList = dao.select(dto);
			request.put("list", searchList);
			views[OUTPUT].show();
			break;
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			// �Է¹��� ������ dao�� ����
			dto = (PhonebookDto)request.get("dto");
			dao.update(dto);
			break;
		case DELETE:
			outputCmd();
			views[DELETE].show();
			dto = (PhonebookDto)request.get("dto");
			dao.delete(dto);
			break;
		case END:
			views[END].show();
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�.");
		}
		
		//���ȣ��
		service();
	}
}
