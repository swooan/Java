package org.comstudy21.phonebook.resource;

import java.util.ArrayList;
import java.util.Hashtable;

import org.comstudy21.phonebook.model.PhonebookDao;
import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.view.*;

public interface R {
	Hashtable<String, Object> request = new Hashtable<String, Object>(); // request를 통해서 키와 밸류를 저장 - 키는 중복되지 않으므로 키값이
																			// 같으면 안에 벨류 덮어쓰기

	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	// 분기시 상수로 쓰겠다.(해도 그만 안해도 그만)
	
	// Menu menu = new Menu(); 이걸 배열타입으로 변환
	PhonebookView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	
	ArrayList<PhonebookDto> dtoList = new ArrayList<PhonebookDto>(); // dao에 쓸 데이터 저장소
	PhonebookDao dao = new PhonebookDao(dtoList); // Dao 미리 선언 / dtoList를 안에 넣어 줌으로 써 Dao에 스태틱 혹은 임포트를 안시켜도 됨 대신에 생성자 필요
}
