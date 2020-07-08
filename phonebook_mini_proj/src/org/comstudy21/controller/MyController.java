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
			// request에 저장된 dto 꺼내오기 - object로 업캐스팅은 자유지만 People 타입으로 다운캐스팅은 아니란다.
			People dto = (People)request.get("dto");
			//System.out.println("controller => " + dto);
			dao.insert(dto);
		}
		else if(no == OUTPUT) {
			// show 하기 전에 dao에서 list를 받아와서 request에 바인딩한다.
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no); // 뷰 호출
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
			System.out.println("해당 사항 없습니다.");
		}
		System.out.println("------------------------------------------------------");
		
		// 재귀호출 (다시 처음으로)
		service();
		
	}
}
