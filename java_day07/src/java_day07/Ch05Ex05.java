package java_day07;

import java.util.Scanner;

public class Ch05Ex05 {

	// 월의 날짜수를 저장하는 배열

	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 월 입력 : 4
		// 일 입력 : 29
		// 몇일 후 날짜를 알고 싶으세요? 200
		// 4월 29일 200일 후 날짜는 ?월 ?일 입니다.

		int total1 = 0;
		int total2 = 0;
		int day1 = 0;
		int month1 = 0;
		int tar = 0;

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		System.out.print("몇일 후 날짜를 알고 싶으세요? ");
		tar = scan.nextInt();

		for (int j = 0; j < (month - 1)%12; j++) {
			total1 += days[j];
		}
		total1 += day; // 원하는 날짜까지의 일수 총합
		total1 += (tar%365); // ?일 후 까지의 일수 총합 + 입력값이 365를 넘어가면 1일부터 다시
		if (total1 > 365) {
			total1 -= 365; // 만약 ?일 후가 365를 넘어가면 1월부터 시작되게
		}

		for (int i = 0; i < days.length; i++) {
			total += days[i];
			if (total >= total1) {
				month1 = i + 1;
				break; // 알고 싶은 날짜의 월
			}
		}

		for (int k = 0; k < month1 - 1; k++) {
			total2 += days[k]; // 알고 싶은 날짜의 전월까지의 일수 총합
		}

		day1 = total1 - total2; // ?일후 까지의 총 일수 - 알고싶은 날짜 전월까지의 총 일수 = 알고싶은 날짜의 일

		System.out.println(month + "월 " + day + "일에서 " + tar + "일 후의 날짜는 " + month1 + "월" + day1 + "일 입니다.");

	}

	public static void test05(String[] args) {
		// 월 입력 : 4
		// 일 입력 : 29
		// 4월 29일의 100일 후 날짜는 ?월 ?일 입니다.

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
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
		total1 += day; // 원하는 날짜까지의 일수 총합
		total1 += 100; // 100일 후 까지의 일수 총합
		if (total1 > 365) {
			total1 -= 365; // 만약 100일 후가 365를 넘어가면 1월부터 시작되게
		}

		for (int i = 0; i < days.length; i++) {
			total += days[i]; 
			if (total >= total1) {
				month1 = i + 1;
				break;              // 알고 싶은 날짜의 월
			}
		}

		for (int k = 0; k < month1 - 1; k++) {
			total2 += days[k]; // 알고 싶은 날짜의 전월까지의 일수 총합
		}

		day1 = total1 - total2; // 100일후 까지의 총 일수 - 알고싶은 날짜 전월까지의 총 일수 = 알고싶은 날짜의 일

		System.out.println(month + "월 " + day + "일 에서 100일 후의 날짜는 " + month1 + "월" + day1 + "일 입니다.");
	}

	public static void test04(String[] args) {
		// 월 입력 : 4
		// 일 입력 : 29
		// 4월 29일 이후 1년은 ?일 남았습니다.

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();

		for (int i = month - 1; i < 12; i++) {
			total += days[i];
		}
		total = total - day;
		System.out.println(month + "월" + day + "일 이후 1년은" + total + "일 남았습니다.");
	}

	public static void test03(String[] args) {
		// 월 입력 : 5
		// 1월에서 5월까지는 총 ?일 입니다.

		System.out.print("월 입력 : ");
		month = scan.nextInt();

		for (int i = 0; i < month; i++) {
			total += days[i];
		}
		System.out.print("1월 ~ " + month + "월 까지는 " + total + "일 입니다.");
	}

	public static void test02(String[] args) {
		// days 배열의 모든 요소 값을 total에 누적한다.
		// 1년은 365일 입니다.

		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		System.out.println("1년은 " + total + "일 입니다.");

	}

	public static void test01(String[] args) {
		// 월 입력: 2
		// 2월은 28일 까지 있습니다.

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print(month + "월은 " + days[month - 1] + "일까지 있습니다.");

	}

}
