package org.comstudy21.resource;

import java.util.Hashtable;

import org.comstudy21.controller.MyController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.*;

// Res interface : ����� ��ü�� ����뵵
public interface Res {
	
	String appTitle = ":::: ��ȭ��ȣ�� ���α׷� ::::";
	
//	String [] items = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
//	String[] viewTitles = {
//			":::: MENU ::::",
//			":::: INPUT ::::",
//			":::: OUTPUT ::::",
//			":::: SEARCH ::::",
//			":::: MODIFY ::::",
//			":::: DELETE ::::",
//			":::: END ::::"
//	}; // �信���� ���̴ϱ� �׳� ��� �ű� => �����ϴ�.
	
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	
	
	Hashtable<String, Object> request = new Hashtable<String, Object>(); // keyValue�� String�̰� ��� ���� object(�ֻ���) ���� ������ �� �� ����
	
	MyView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	Dao dao = new Dao();
	
	MyController controller = new MyController();
}
