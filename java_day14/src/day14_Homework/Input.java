package day14_Homework;

import java.util.Scanner;

class Input {
	final static int MAX = 100;
	int top = 0;
	
	String[][] inputData = new String[MAX][3];
	
	Scanner scan = new Scanner(System.in);

	
	void inputData() {
		
		System.out.println("--------------------------------");
		System.out.println("�Է±���� �����ϼ̽��ϴ�.");
		System.out.print("�̸��� �Է����ּ��� : ");
		inputData[top][0] = scan.next();
		System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
		inputData[top][1] = scan.next();
		System.out.print("������ �Է����ּ��� : ");
		inputData[top][2] = scan.next();

		Output a1 = new Output();
		a1.inputData[top][0] = inputData[top][0];
		a1.inputData[top][1] = inputData[top][1];
		a1.inputData[top][2] = inputData[top][2];
		
		top++;		
	}
	

}
