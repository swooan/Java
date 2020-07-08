package org.comstudy21.ch05;

import java.util.Scanner;

public class day07homework {
	
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		while(month<1 || month>12) {
			System.out.println("월은 1월에서 12월 사이만 허용합니다.");
			System.out.println("다시 월 입력 : ");
			month = scan.nextInt();
		}
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		while (day<1 || day>days[month-1]) {
			System.out.println("날짜는 1일부터 " + days[month-1] + "사이여야 합니다.");
			System.out.println("다시 일 입력 : ");
			day = scan.nextInt();
		}
		System.out.print("며칠 후 날짜를 알고 싶으세요? 입력 : ");
		int dDay = scan.nextInt();
		System.out.printf("%d월 %d일 " , month , day);
		
		if(dDay <= days[month-1] - day) {
			System.out.print(dDay + "일 후는 " + month);
			System.out.println("월 " + (day+dDay) + "일 입니다.");
			return;
		}
		else {
			//100에서 현재 달의 남은 날짜를 뺀다.
			total = dDay - (days[month-1] - day);
			int i = month;
			for(; total > days[i%12]; i++) {
				total -= days[i%12];
			}
			
			System.out.print(dDay + "일 후는 " + (i%12+1));
			System.out.println("월 " + total + "일 입니다.");
		}
		
		
	}
	
	public static void test01(String[] args) {
		// 월 입력 : 4
		// 일 입력 : 29
		// 4월 29일 100일 후 날짜는 ?월?일 입니다.
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		System.out.printf("%d월 %d일 " , month , day);
		
		// 현재 달의 남은 날짜를 total에 저장한다.
		total = days[month-1] - day;
		int i = month;
		//while(i<(month+3)) {
		while (total < 100) {
			total += days[i%12];
			i++;
		}
		//System.out.println("total => " + total);
		int dDay = 0, dMonth = 0;
		//if(total >= 100) {
			// 100보다 크다면 증가한 만큼 후진한다.
			dMonth = i%12;
			dDay = days[(i-1)%12] - (total-100);
		//}
//		else {
//			// 부족하다면 한달 후에서 부족한 날짜를 보탠다.
//			dMonth = i%12 + 1;
//			dDay = 100 - total;
//		}
		if(dMonth == 0) {
			dMonth = 12;
		}
		System.out.printf("100일 후는 %d월 %d일 입니다.",dMonth,dDay);
	}
	
}
