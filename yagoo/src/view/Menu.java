package view;

import static util.MyUtil.*;

import java.util.Arrays;
import java.util.Scanner;

public class Menu extends YagooView {

	@Override
	protected void display() {
		
		System.out.println("1.숫자 입력 2.기록 보기 3.포기하기 4.끝내기");
		System.out.print("Choice >>> ");
		int no = scan.nextInt();
		
		request.put("no",no);
		
	}

}
