package org.comstudy21.resource;

import java.util.Hashtable;

import org.comstudy21.controller.MyController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.*;

// Res interface : 상수나 객체의 저장용도
public interface Res {
	
	String appTitle = ":::: 전화번호부 프로그램 ::::";
	
//	String [] items = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
//	String[] viewTitles = {
//			":::: MENU ::::",
//			":::: INPUT ::::",
//			":::: OUTPUT ::::",
//			":::: SEARCH ::::",
//			":::: MODIFY ::::",
//			":::: DELETE ::::",
//			":::: END ::::"
//	}; // 뷰에서만 쓰이니까 그냥 뷰로 옮김 => 복잡하다.
	
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	
	
	Hashtable<String, Object> request = new Hashtable<String, Object>(); // keyValue는 String이고 출력 값은 object(최상위) 여서 뭐든지 들어갈 수 있음
	
	MyView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	Dao dao = new Dao();
	
	MyController controller = new MyController();
}
