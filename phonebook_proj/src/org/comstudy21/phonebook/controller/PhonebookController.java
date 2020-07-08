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
		
		// menu.show(); R에 메뉴 호출문이 바꼈으니 아래와 같이 바꿔준다.
		
		views[MENU].show();

		// System.out.println(request.get("no")); getNum 이 잘 들어오나 테스트

		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			// 입력이 끝나면 request에 정보가 있을 것이다.
			// 입력 받은 정보를 Dao로 넘겨준다.
			// System.out.println(request.get("dto")); - dto에 잘 들어갔나 확인
			dao.insert((PhonebookDto)request.get("dto"));
			break;
		case OUTPUT:
			outputCmd();
			break;
		case SEARCH:
			views[SEARCH].show();
			// request 에서 dto를 가져온다.
			PhonebookDto dto = (PhonebookDto)request.get("dto");
			System.out.println(dto);
			ArrayList<PhonebookDto> searchList = dao.select(dto);
			request.put("list", searchList);
			views[OUTPUT].show();
			break;
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			// 입력받은 데이터 dao로 전달
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
			System.out.println("해당 사항 없습니다.");
		}
		
		//재귀호출
		service();
	}
}
