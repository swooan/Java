package org.comstudy21.view;

import java.util.Scanner;

import org.comstudy21.resource.Res;

public abstract class MyView implements Res {
	public static final String [] items = {"", "INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
	public static final String[] viewTitles = {
			":::: MENU ::::",
			":::: INPUT ::::",
			":::: OUTPUT ::::",
			":::: SEARCH ::::",
			":::: MODIFY ::::",
			":::: DELETE ::::",
			":::: END ::::"
	};
	
	public static final Scanner scan = new Scanner(System.in);
	public static final Scanner scan2 = new Scanner(System.in); // 띄어쓰기용 스캐너
	
	final int MAX = 100;
	int top = 0;
	String[][] inputData;
	
	// 템플릿 메소드
	public void show(int index) {
		System.out.println(viewTitles[index]);
		display();
	}
	
	public abstract void display();
}
