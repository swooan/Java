package org.comstudy21.controller;

import java.util.ArrayList;

import org.comstudy21.model.People;
import org.comstudy21.resource.Res;

public class MyController implements Res {
	public void service() {
		views[MENU].show(MENU);
		
		//System.out.println("no => " + request.get("no"));

		int no = (int)request.get("no");
		if(no == INPUT) {
			views[no].show(no);
			// request�� ����� dto �������� - object�� ��ĳ������ �������� People Ÿ������ �ٿ�ĳ������ �ƴ϶���.
			People dto = (People)request.get("dto");
			//System.out.println("controller => " + dto);
			dao.insert(dto);
		}
		else if(no == OUTPUT) {
			// show �ϱ� ���� dao���� list�� �޾ƿͼ� request�� ���ε��Ѵ�.
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no); // �� ȣ��
		}
		else if(no == SEARCH) {
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no);
		}
		else if(no == MODIFY) {
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no);
		}
		else if(no == DELETE) {
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no);
		}
		else if(no == END) {
			views[no].show(no);
		}
		else {
			System.out.println("�ش� ���� �����ϴ�.");
		}
		System.out.println("------------------------------------------------------");
		
		// ���ȣ�� (�ٽ� ó������)
		service();
		
	}
}
