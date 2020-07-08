package date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print("���� �Է� : ");
		int myear = scan.nextInt();
		System.out.print("���� �Է� : ");
		int mmonth = scan.nextInt();
		System.out.print("���� �Է� : ");
		int mday = scan.nextInt();
		
		int mage = year - myear;
		if(month < mmonth) {
			System.out.println("�� ���̴� �� " + (mage -1) + "�� �Դϴ�.");
		}
		else if(month > mmonth) {
			System.out.println("�� ���̴� �� " + mage + "�� �Դϴ�.");
		}
		else {
			if(day < mday) {
				System.out.println("�� ���̴� �� " + (mage -1) + "�� �Դϴ�.");
			}
			else {
				System.out.println("�� ���̴� �� " + mage + "�� �Դϴ�.");
			}
		}
		
		
	}
	
	public static void test(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); // ���� +1 �߰��� ��� �Ѵ�. (1�� -> 0 ���� ����)
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "�� " + (month+1) + "�� " + day + "��");
		
		String[] weekStr = {"","��","��","ȭ","��","��","��","��"};
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] + "����");
		if(week == Calendar.WEDNESDAY) {
			System.out.println("������ ������ �Դϴ�.");
		}
	}
	
	// �������� : �ڱ� �¾ �⵵�� �Է� �޾Ƽ� ���� �⵵�� �����������ϴ� ���α׷�
	
}
