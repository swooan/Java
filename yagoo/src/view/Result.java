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
		
		System.out.println("정답은 " + a + b + c + d + " 입니다.");
		
		System.out.println("다시 도전하시겠습니까?");
		System.out.println("예<1> 아니오(종료)<2>");
		System.out.print(">>> ");
		int choice = scan.nextInt();
		
		if(choice == 1) {
//			request.put("n", -1);
			YagooController control = new YagooController();
			control.service();
		}
		else if(choice == 2) {
			System.out.println("수고하셨습니다.");
			System.exit(0);
		}
	}

}
