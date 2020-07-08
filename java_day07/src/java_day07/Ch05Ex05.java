package java_day07;

import java.util.Scanner;

public class Ch05Ex05 {

	// ���� ��¥���� �����ϴ� �迭

	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// �� �Է� : 4
		// �� �Է� : 29
		// ���� �� ��¥�� �˰� ��������? 200
		// 4�� 29�� 200�� �� ��¥�� ?�� ?�� �Դϴ�.

		int total1 = 0;
		int total2 = 0;
		int day1 = 0;
		int month1 = 0;
		int tar = 0;

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		System.out.print("���� �� ��¥�� �˰� ��������? ");
		tar = scan.nextInt();

		for (int j = 0; j < (month - 1)%12; j++) {
			total1 += days[j];
		}
		total1 += day; // ���ϴ� ��¥������ �ϼ� ����
		total1 += (tar%365); // ?�� �� ������ �ϼ� ���� + �Է°��� 365�� �Ѿ�� 1�Ϻ��� �ٽ�
		if (total1 > 365) {
			total1 -= 365; // ���� ?�� �İ� 365�� �Ѿ�� 1������ ���۵ǰ�
		}

		for (int i = 0; i < days.length; i++) {
			total += days[i];
			if (total >= total1) {
				month1 = i + 1;
				break; // �˰� ���� ��¥�� ��
			}
		}

		for (int k = 0; k < month1 - 1; k++) {
			total2 += days[k]; // �˰� ���� ��¥�� ���������� �ϼ� ����
		}

		day1 = total1 - total2; // ?���� ������ �� �ϼ� - �˰���� ��¥ ���������� �� �ϼ� = �˰���� ��¥�� ��

		System.out.println(month + "�� " + day + "�Ͽ��� " + tar + "�� ���� ��¥�� " + month1 + "��" + day1 + "�� �Դϴ�.");

	}

	public static void test05(String[] args) {
		// �� �Է� : 4
		// �� �Է� : 29
		// 4�� 29���� 100�� �� ��¥�� ?�� ?�� �Դϴ�.

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();

		int total1 = 0;
		int total2 = 0;
		int day1 = 0;
		int month1 = 0;

		for (int j = 0; j < month - 1; j++) {
			if (month != 1) {
				total1 += days[j];
			}
		}
		total1 += day; // ���ϴ� ��¥������ �ϼ� ����
		total1 += 100; // 100�� �� ������ �ϼ� ����
		if (total1 > 365) {
			total1 -= 365; // ���� 100�� �İ� 365�� �Ѿ�� 1������ ���۵ǰ�
		}

		for (int i = 0; i < days.length; i++) {
			total += days[i]; 
			if (total >= total1) {
				month1 = i + 1;
				break;              // �˰� ���� ��¥�� ��
			}
		}

		for (int k = 0; k < month1 - 1; k++) {
			total2 += days[k]; // �˰� ���� ��¥�� ���������� �ϼ� ����
		}

		day1 = total1 - total2; // 100���� ������ �� �ϼ� - �˰���� ��¥ ���������� �� �ϼ� = �˰���� ��¥�� ��

		System.out.println(month + "�� " + day + "�� ���� 100�� ���� ��¥�� " + month1 + "��" + day1 + "�� �Դϴ�.");
	}

	public static void test04(String[] args) {
		// �� �Է� : 4
		// �� �Է� : 29
		// 4�� 29�� ���� 1���� ?�� ���ҽ��ϴ�.

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();

		for (int i = month - 1; i < 12; i++) {
			total += days[i];
		}
		total = total - day;
		System.out.println(month + "��" + day + "�� ���� 1����" + total + "�� ���ҽ��ϴ�.");
	}

	public static void test03(String[] args) {
		// �� �Է� : 5
		// 1������ 5�������� �� ?�� �Դϴ�.

		System.out.print("�� �Է� : ");
		month = scan.nextInt();

		for (int i = 0; i < month; i++) {
			total += days[i];
		}
		System.out.print("1�� ~ " + month + "�� ������ " + total + "�� �Դϴ�.");
	}

	public static void test02(String[] args) {
		// days �迭�� ��� ��� ���� total�� �����Ѵ�.
		// 1���� 365�� �Դϴ�.

		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		System.out.println("1���� " + total + "�� �Դϴ�.");

	}

	public static void test01(String[] args) {
		// �� �Է�: 2
		// 2���� 28�� ���� �ֽ��ϴ�.

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print(month + "���� " + days[month - 1] + "�ϱ��� �ֽ��ϴ�.");

	}

}
