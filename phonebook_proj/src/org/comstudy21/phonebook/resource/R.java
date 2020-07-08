package org.comstudy21.phonebook.resource;

import java.util.ArrayList;
import java.util.Hashtable;

import org.comstudy21.phonebook.model.PhonebookDao;
import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.view.*;

public interface R {
	Hashtable<String, Object> request = new Hashtable<String, Object>(); // request�� ���ؼ� Ű�� ����� ���� - Ű�� �ߺ����� �����Ƿ� Ű����
																			// ������ �ȿ� ���� �����

	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	// �б�� ����� ���ڴ�.(�ص� �׸� ���ص� �׸�)
	
	// Menu menu = new Menu(); �̰� �迭Ÿ������ ��ȯ
	PhonebookView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	
	ArrayList<PhonebookDto> dtoList = new ArrayList<PhonebookDto>(); // dao�� �� ������ �����
	PhonebookDao dao = new PhonebookDao(dtoList); // Dao �̸� ���� / dtoList�� �ȿ� �־� ������ �� Dao�� ����ƽ Ȥ�� ����Ʈ�� �Ƚ��ѵ� �� ��ſ� ������ �ʿ�
}
