package day14_Homework;

import java.util.Scanner;

class End {

}

class Delete {

}

class Modify {

}

class Search {

}
class Phonebook {

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
