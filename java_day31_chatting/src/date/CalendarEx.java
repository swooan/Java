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
		
		System.out.print("생년 입력 : ");
		int myear = scan.nextInt();
		System.out.print("생월 입력 : ");
		int mmonth = scan.nextInt();
		System.out.print("생일 입력 : ");
		int mday = scan.nextInt();
		
		int mage = year - myear;
		if(month < mmonth) {
			System.out.println("내 나이는 만 " + (mage -1) + "살 입니다.");
		}
		else if(month > mmonth) {
			System.out.println("내 나이는 만 " + mage + "살 입니다.");
		}
		else {
			if(day < mday) {
				System.out.println("내 나이는 만 " + (mage -1) + "살 입니다.");
			}
			else {
				System.out.println("내 나이는 만 " + mage + "살 입니다.");
			}
		}
		
		
	}
	
	public static void test(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); // 월은 +1 추가해 줘야 한다. (1월 -> 0 부터 시작)
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + (month+1) + "월 " + day + "일");
		
		String[] weekStr = {"","일","월","화","수","목","금","토"};
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] + "요일");
		if(week == Calendar.WEDNESDAY) {
			System.out.println("오늘은 수요일 입니다.");
		}
	}
	
	// 연습문제 : 자기 태어난 년도를 입력 받아서 현재 년도에 몇살인지출력하는 프로그램
	
}
