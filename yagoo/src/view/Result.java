package view;

import static util.MyUtil.scan;

import controller.YagooController;

public class Result extends YagooView {

	@Override
	protected void display() {
		int a= (int)request.get("q1");
		int b= (int)request.get("q2");
		int c= (int)request.get("q3");
		int d= (int)request.get("q4");
		
		System.out.println("������ " + a + b + c + d + " �Դϴ�.");
		
		System.out.println("�ٽ� �����Ͻðڽ��ϱ�?");
		System.out.println("��<1> �ƴϿ�(����)<2>");
		System.out.print(">>> ");
		int choice = scan.nextInt();
		
		if(choice == 1) {
//			request.put("n", -1);
			YagooController control = new YagooController();
			control.service();
		}
		else if(choice == 2) {
			System.out.println("�����ϼ̽��ϴ�.");
			System.exit(0);
		}
	}

}
