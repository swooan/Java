package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;

public abstract class PhonebookView implements R {
	
	protected static Scanner scan = MyUtil.scan;
	
	protected abstract void display();
	
	// 템플릿 메소드 (외부에서 디스플레이를 볼 수 있게 , 수정은 x) - 동적 바인딩 응용
	public void show() {
		System.out.println("--------------------------------------");
		display();
	}
}
