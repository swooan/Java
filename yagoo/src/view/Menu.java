package view;

import static util.MyUtil.*;

import java.util.Arrays;
import java.util.Scanner;

public class Menu extends YagooView {

	@Override
	protected void display() {
		
		System.out.println("1.���� �Է� 2.��� ���� 3.�����ϱ� 4.������");
		System.out.print("Choice >>> ");
		int no = scan.nextInt();
		
		request.put("no",no);
		
	}

}
