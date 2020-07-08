package view;

import static util.MyUtil.scan;

import controller.YagooController;
import model.Dto;

public class Act extends YagooView {
	
	int n = 8;
	
	@Override
	protected void display() {
		int num1, num2, num3, num4 = 0;
		
		int a = (int)request.get("n");
		if(a == -1) {
			n = 8;
		}
		
		System.out.println("중복되지 않는 네자리 숫자를 입력해주세요!");
		
		if(n > 0) {
			System.out.println("[남은 기회] : " + n);			
		}
		else if(n == 0) {
			System.out.println("[[[[[[[[[[마지막 기회입니다.]]]]]]]]]]]");
		}
		do {
			
			System.out.print("천의 자리 숫자를 입력해주세요 : ");
			num1 = scan.nextInt();
		}
		while(num1 > 9);
		
		do {
			System.out.print("백의 자리 숫자를 입력해주세요 : ");
			num2 = scan.nextInt();
		}
		while(num1 == num2 || num2 > 9);
		
		do {
			System.out.print("십의 자리 숫자를 입력해주세요 : ");
			num3 = scan.nextInt();
		}
		while(num1 == num3 || num3 == num2 || num3 > 9);
		
		do {
			System.out.print("일의 자리 숫자를 입력해주세요 : ");
			num4 = scan.nextInt();
		}
		while(num4 == num1 || num4 == num2 || num4 == num3 || num4 > 9);
		
		
		Dto num = new Dto(num1,num2,num3,num4);
		request.put("num", num);
		
		YagooController.compare();
		
		n--;
		request.put("n", n);
		
		if(n < 0) {
			n = 8;
			System.out.println("기회를 모두 사용하셨습니다.");
			views[3].show();
		}
		
	}

}
