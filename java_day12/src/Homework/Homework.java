package Homework;

import java.util.Scanner;

// ��ȭ��ȣ�� ����� ���α׷�
class End {

}

class Delete {

}

class Modify {

}

class Search {

}

class Output {
	final int MAX = 100;
	int top = 0;
	String[][] inputData;
	
	public Output() {
		
	}
	
	public Output(String inputData) {
		this.inputData[top][3] = inputData;
		
		top++;
	}
	
	public void outputData() {
		
		System.out.println("--------------------------------");
		System.out.println("��� ����� �����ϼ̽��ϴ�.");
		System.out.println("�̸�\t ��ȭ��ȣ\t ����");
		System.out.println("==================================");
		for (int i=0; i<top; i++) {
			System.out.print(inputData[top][0] + "\t" + inputData[top][1] + "\t" + inputData[top][2]);
			
		}
		
	}

}

class Input {
	final int MAX = 100;
	int top = 0;
	
	String[][] inputData = new String[MAX][3];
	
	Scanner scan = new Scanner(System.in);

	public Input() {


	}
	
	public void inputData() {
		
		System.out.println("--------------------------------");
		System.out.println("�Է±���� �����ϼ̽��ϴ�.");
		System.out.print("�̸��� �Է����ּ��� : ");
		inputData[top][0] = scan.next();
		System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
		inputData[top][1] = scan.next();
		System.out.print("������ �Է����ּ��� : ");
		inputData[top][2] = scan.next();
		

		top++;
	}

}

class Menu {
	int inputNum1;

	public Menu() {
		
	}

	public Menu(int inputNum1) {
		
		this.inputNum1 = inputNum1;
		
		Input i = new Input();
		Output o = new Output();
		
			switch (inputNum1) {
			case 1:
				i.inputData();
				break;
			case 2:
				o.outputData();
				break;
//		case 3:
//			Search();
//			break;
//		case 4:
//			Modify();
//			break;
//		case 5:
//			Delete();
//			break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� : ");
				
		}
	}

}

public class Homework {

	public static void main(String[] args) {

		while(true) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("==== ��ȭ��ȣ�� ==== \n");
			System.out.println("1.���ο� �׸� �߰�\t 2.��ȭ��ȣ�� ��ü ����");
			System.out.println("3.�˻��ϱ�\t 4.�����ϱ�");
			System.out.println("5.�����ϱ�\t 6.����");
			System.out.println("���Ͻô� ����� �������ּ��� : ");
			int inputNum1 = scan.nextInt();
			
			Menu m1 = new Menu(inputNum1);
		}

	}

}
