package day14_Homework;

import java.util.Scanner;

class Input {
	final static int MAX = 100;
	int top = 0;
	
	String[][] inputData = new String[MAX][3];
	
	Scanner scan = new Scanner(System.in);

	
	void inputData() {
		
		System.out.println("--------------------------------");
		System.out.println("입력기능을 선택하셨습니다.");
		System.out.print("이름을 입력해주세요 : ");
		inputData[top][0] = scan.next();
		System.out.print("전화번호를 입력해주세요 : ");
		inputData[top][1] = scan.next();
		System.out.print("지역을 입력해주세요 : ");
		inputData[top][2] = scan.next();

		Output a1 = new Output();
		a1.inputData[top][0] = inputData[top][0];
		a1.inputData[top][1] = inputData[top][1];
		a1.inputData[top][2] = inputData[top][2];
		
		top++;		
	}
	

}
