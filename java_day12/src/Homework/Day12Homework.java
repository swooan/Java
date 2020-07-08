package Homework;

import java.util.Scanner;

class Info {
	
	private String name;
	private String phone;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}

public class Day12Homework {
	static final int MAX = 100;
	static int top = 0;

	static String[][] inputInfo = new String[MAX][3];

	static Scanner scan = new Scanner(System.in);

	static void delete() {
		System.out.println("--------------------------------");
		System.out.println("���� ����� �����ϼ̽��ϴ�.");
		if (top == 0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		System.out.print("������ �̸� �Է� : ");
		String inputName3 = scan.next();

		for (int i = 0; i < top; i++) {
			if (inputName3.equals(inputInfo[i][0])) {
				inputInfo[i][0] = inputInfo[i + 1][0];
				inputInfo[i][1] = inputInfo[i + 1][1];
				inputInfo[i][2] = inputInfo[i + 1][2];

				top--;
			}
		}
	}

	static void modify() {

		System.out.println("--------------------------------");
		System.out.println("���� ����� �����ϼ̽��ϴ�.");
		System.out.println();
		System.out.println("������ �̸��� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String inputName2 = scan.next();

		for (int i = 0; i < top; i++) {
			if (inputName2.equals(inputInfo[i][0])) {
				System.out.println("�ٲ� �׸��� �������ּ���");
				System.out.println("1. �̸� ����");
				System.out.println("2. ��ȣ ����");
				System.out.println("3. ���� ����");
				System.out.print("��ȣ : ");
				int inputNum3 = scan.nextInt();

				switch (inputNum3) {

				case 1:
					System.out.println("�ٲ� �̸��� �Է����ּ���");
					System.out.println("�� �̸� : ");
					inputInfo[i][0] = scan.next();

					break;

				case 2:
					System.out.println("�ٲ� ��ȣ�� �Է����ּ���");
					System.out.println("�� ��ȣ : ");
					inputInfo[i][1] = scan.next();

					break;

				case 3:
					System.out.println("�ٲ� ���� �Է����ּ���");
					System.out.println("�� ���� : ");
					inputInfo[i][2] = scan.next();

					break;

				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}

		}

	}

	static void search() {

		System.out.println("--------------------------------");
		System.out.println("�˻� ����� �����ϼ̽��ϴ�.");
		System.out.println();
		System.out.println("�˻��� ����� �����ϼ���.");
		System.out.println("1. �̸����� �˻�");
		System.out.println("2. ��ȣ�� �˻�");
		System.out.println("3. ���÷� �˻�");
		System.out.print("��ȣ : ");
		int inputNum2 = scan.nextInt();

		switch (inputNum2) {

		case 1:

			System.out.println("�̸����� �˻��� �����ϼ̽��ϴ�.");
			System.out.println("�˻��Ͻ� �̸��� �Է����ּ���.");
			System.out.print("�̸� : ");
			String inputName = scan.next();

			if (top == 0) {
				System.out.println("����� ������ ������ �����ϴ�.");
				return;
			}

			System.out.println("�̸�\t ��ȭ��ȣ\t ����");
			System.out.println("==================================");
			boolean flag = false;
			for (int i = 0; i < top; i++) {
				if (inputName.equals(inputInfo[i][0])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("�˻��Ͻ� ������ ã�� ���Ͽ����ϴ�.");
			}
			break;
		case 2:

			System.out.println("��ȣ�� �˻��� �����ϼ̽��ϴ�.");
			System.out.println("�˻��Ͻ� ��ȣ�� �Է����ּ���.");
			System.out.print("��ȣ : ");
			String inputPhone = scan.next();

			if (top == 0) {
				System.out.println("����� ������ ������ �����ϴ�.");
				return;
			}

			System.out.println("�̸�\t ��ȭ��ȣ\t ����");
			System.out.println("==================================");
			boolean flag1 = false;
			for (int i = 0; i < top; i++) {
				if (inputPhone.equals(inputInfo[i][1])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag1 = true;
				}
			}
			if (!flag1) {
				System.out.println("�˻��Ͻ� ������ ã�� ���Ͽ����ϴ�.");
			}
			break;

		case 3:

			System.out.println("���÷� �˻��� �����ϼ̽��ϴ�.");
			System.out.println("�˻��Ͻ� ���ø� �Է����ּ���.");
			System.out.print("���� : ");
			String inputCity = scan.next();

			if (top == 0) {
				System.out.println("����� ������ ������ �����ϴ�.");
				return;
			}

			System.out.println("�̸�\t ��ȭ��ȣ\t ����");
			System.out.println("==================================");
			boolean flag2 = false;
			for (int i = 0; i < top; i++) {
				if (inputCity.equals(inputInfo[i][2])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag2 = true;
				}
			}
			if (!flag2) {
				System.out.println("�˻��Ͻ� ������ ã�� ���Ͽ����ϴ�.");
			}
			break;

		default:
			System.out.println("��ȣ�� �ٽ� �Է����ּ���");

		}

	}

	static void output() {

		System.out.println("--------------------------------");
		System.out.println("��� ����� �����ϼ̽��ϴ�.");
		System.out.println("�̸�\t ��ȭ��ȣ\t ����");
		System.out.println("==================================");
		for (int i = 0; i < top; i++) {
			System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
			System.out.println();
		}
		System.out.println();

	}

	static void input() {

		System.out.println("--------------------------------");
		System.out.println("�Է±���� �����ϼ̽��ϴ�.");
		System.out.print("�̸��� �Է����ּ��� : ");
		inputInfo[top][0] = scan.next();
		System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
		inputInfo[top][1] = scan.next();
		System.out.print("������ �Է����ּ��� : ");
		inputInfo[top][2] = scan.next();

		top++;

		System.out.println();
	}

	public static void main(String[] args) {

		while (true) {

			Scanner scan = new Scanner(System.in);

			System.out.println("==== ��ȭ��ȣ�� ==== \n");
			System.out.println("1.���ο� �׸� �߰�\t 2.��ȭ��ȣ�� ��ü ����");
			System.out.println("3.�˻��ϱ�\t 4.�����ϱ�");
			System.out.println("5.�����ϱ�\t 6.����");
			System.out.println("���Ͻô� ����� �������ּ��� : ");
			int inputNum1 = scan.nextInt();

			switch (inputNum1) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 6:
				System.out.println();
				System.out.println("--------------------------");
				System.out.println("��ȭ��ȣ�θ� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� : ");

			}
			System.out.println();
		}

	}

}