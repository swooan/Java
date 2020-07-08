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
		
		System.out.println("�ߺ����� �ʴ� ���ڸ� ���ڸ� �Է����ּ���!");
		
		if(n > 0) {
			System.out.println("[���� ��ȸ] : " + n);			
		}
		else if(n == 0) {
			System.out.println("[[[[[[[[[[������ ��ȸ�Դϴ�.]]]]]]]]]]]");
		}
		do {
			
			System.out.print("õ�� �ڸ� ���ڸ� �Է����ּ��� : ");
			num1 = scan.nextInt();
		}
		while(num1 > 9);
		
		do {
			System.out.print("���� �ڸ� ���ڸ� �Է����ּ��� : ");
			num2 = scan.nextInt();
		}
		while(num1 == num2 || num2 > 9);
		
		do {
			System.out.print("���� �ڸ� ���ڸ� �Է����ּ��� : ");
			num3 = scan.nextInt();
		}
		while(num1 == num3 || num3 == num2 || num3 > 9);
		
		do {
			System.out.print("���� �ڸ� ���ڸ� �Է����ּ��� : ");
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
			System.out.println("��ȸ�� ��� ����ϼ̽��ϴ�.");
			views[3].show();
		}
		
	}

}
