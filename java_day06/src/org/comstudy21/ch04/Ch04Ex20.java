package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20 {

	public static void main(String[] args) {

		// 난수 발생기
		// -> Math.randam()
		// -> Random 클래스를 이용한 난수 발생기
		// 정답이면 빙고! 하고 끝내기
		// 오답이면 큰수인지 작은수인지 표시하고 범위를 줄여준다.
		// 6번 동안 못맞추면 실격
		// 재시도하시겠습니까?(Y/N)

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int min = 1, max = 100;
		int number = min + rand.nextInt(max);
		int userNum = 0;
		int cnt = 6;
		char YN = 'Y';

		System.out.print("시스템이 숫자를 만들었습니다.");
		System.out.println("(hint : " + number + ")");
		System.out.println("기회는" + cnt + "번 있습니다!");

		System.out.printf("맞춰보세요(%d~%d) : ", min, max);
		userNum = scan.nextInt();
		for (; cnt > 0; cnt--) {
			while (userNum > max || userNum < min) {
				System.out.printf("다시 입력하세요(%d~%d) : ", min, max);
				userNum = scan.nextInt();
			}

			if (userNum > number) {
				System.out.println("DOWN!");
				max = userNum - 1;
				System.out.println("범위 : " + min + "~" + max);
				System.out.print("숫자 입력 : ");
				userNum = scan.nextInt();

			} else if (userNum < number) {
				System.out.println("UP!");
				min = userNum + 1;
				System.out.println("범위 : " + min + "~" + max);
				System.out.print("숫자 입력 : ");
				userNum = scan.nextInt();

			} else {
				System.out.println("\n정답!!");
				break;
			}

			if (cnt == 2) {
				System.out.println("Fail!");
				System.out.println("정답은 : " + number + "입니다!");
				break;
			}
		}
		System.out.print("다시 도전하시겠습니까? (Y/N) : ");
		YN = scan2.next().charAt(0);
		while (!(YN == 'Y' || YN == 'N' || YN == 'y' || YN == 'n')) {
			System.out.print("y 또는 n 만 입력하세요 (Y/N) : ");
			YN = scan2.next().charAt(0);
		}
		if (YN == 'Y' || YN == 'y') {
			System.out.println("게임을 새로 시작합니다.");
			System.out.println();
			main(null);
		} else if (YN == 'N' || YN == 'n') {
			System.out.println("수고하셨습니다.");
			System.exit(0);
		}
	}

	public static void test05(String[] args) {
		// 과제
		// 1+1-2+3-5+8-13+21=14
		// i j i j i j i j

//		int i = 1;
//		int j = 1;
//		int total = 0;
//		final int MAX = 21;
//		int m = 0;
//
//		while (m < 6) {
//			if (j != MAX && i != MAX) {
//				if (m == 0) {
//					System.out.print(i + " + " + j + " - ");
//					total = i + j;
//				}
//				if (m % 2 == 0) {
//					j = i + j;
//					System.out.print(j);
//					if (i != MAX) {
//						System.out.print(" + ");
//					}
//					total -= j;
//				} else if (m % 2 == 1) {
//					i = i + j;
//					System.out.print(i);
//					if (i != MAX) {
//						System.out.print(" - ");
//					}
//					total += i;
//				}
//			}
//			m++;
//		}
//		System.out.print(" = " + total);

//		int prev = 0;
//		int cur = 1;
//		int next = 0;
//		int total = 0;
//		
//		int i = 0;
//		while(cur <= 21) {
//			System.out.print(cur + " ");
//			
//			if (i%2 == 0) {
//				total = i == 0 ? cur : total - cur;
//				System.out.print(" + ");
//			}
//			else {
//				if(cur != 21) {
//					System.out.print(" - ");
//				}
//				total = total + cur;
//			}
//			
//			
//			next = prev + cur;
//			prev = cur;
//			cur = next;
//			
//			i++;
//		}
//		System.out.print(" = " + total);

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 2;

		boolean flag = true;
		while (cur <= 21) {
			System.out.print(cur + " ");

			if (flag) {
				total = total - cur;
				System.out.print(" + ");
				flag = false;
			} else {
				total = total + cur;
				if (cur != 21) {
					System.out.print(" - ");
				}
				flag = true;
			}

			next = prev + cur;
			prev = cur;
			cur = next;

		}
		System.out.print(" = " + total);

	}

	public static void test04_2(String[] args) {

		int total = 0;
		int MAX = 21;

		for (int prev = 0, cur = 1, next; cur <= 21; next = prev + cur, prev = cur, cur = next) {

			System.out.print(cur);

			total += cur;

			System.out.print((cur == MAX) ? " = " : " + ");
		}
		System.out.println(total);
	}

	public static void test04(String[] args) {
		// 1+1+2+3+5+8+13+21=54
		// i j i j i j i j

//		int i = 1;
//		int j = 1;
//		int total = 0;
//		final int MAX = 21;
//			
//		int m= 0;
//		while(m < 6) {
//			if(j != MAX && i != MAX) {			
//				if(m == 0) {					
//					System.out.print(i + " + " + j + " + ");
//					total = i + j;
//				}
//				if(m % 2 == 0) {
//					j = i+j;
//					System.out.print(j);
//					if(i != MAX) {					
//						System.out.print(" + ");
//					}
//					total += j;
//				}
//				else if(m % 2 == 1) {
//					i = i+j;
//					System.out.print(i);
//					if(i != MAX) {					
//						System.out.print(" + ");
//					}
//					total += i;
//				}
//			}			
//			m++;
//		}
//		System.out.print(" = " + total);
//	}	

//	  int prev = 1;
//	  int cur = 1;
//	  int next = 0;
//	  int total = 0;
//	  int MAX = 21;
//	  
//	  //while문을 이용해서 피보나치 수열 구현
//	  
//	  while(next <= MAX) {
//		if(cur == 1) {
//			System.out.print(prev + " + " + cur + " + ");
//			total = cur + prev;
//		}
//		if(next <= MAX && cur != 1) {		  		
//	  		System.out.print(next);
//	  		System.out.print((next == MAX) ? " = " : " + ");	  		
//	  		total += next;
//	  	}
//		next = cur + prev;
//		prev = cur;
//		cur = next;
//	  }
//	  System.out.print(total);
//	  

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 0;
		int MAX = 21;

		while (cur <= MAX) {

			System.out.print(cur);

			total += cur;

			System.out.print((cur == MAX) ? " = " : " + ");

			next = cur + prev;
			prev = cur;
			cur = next;

		}
		System.out.println(total);
	}

	public static void test03(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7

		final int MAX = 10;
		int total = 0;
		int i = 1;

		while (i <= MAX) {
			System.out.print(i);
			if (i == 1 || i == MAX) {
				total += i;
			}
			if (i != MAX) {
				if (i % 2 == 0) {
					System.out.print(" - ");
					total += i;
				}

				if (i % 2 == 1) {
					if (i != 1) {
						total -= i;
					}
					System.out.print(" + ");
				}
			}
			i++;
		}
		System.out.print(" = " + total);

//	 int total = 0; // 1. 처음 시작이 -1+2-3+4 로 시작 되니 total을 2로 바꿔준다.
//	 int num = 1;
//	 final int MAX = 10
//	  
//	 while(num<=MAX) {
//		 System.out.print(num);
//	 
//	 	if(num % 2 == 1) {
//	 		System.out.print(" + ");
//	 		total -= num; // 2. total = num ==1 ? num : total-num
//	 	}
//	 	else {
//	 		System.out.print(num == MAX ? " = " : " - ");
//	 		total += num;
//	 	}
//	 
//	 	num += 1;
//	 }
//	 System.out.println(total);
	}

	public static void test02(String[] args) {
		// 30 + 40 + 50 + 60 + 70 = 250이 출력되도록
		// while 문을 이용해서 구현하시오

		final int MAX = 70;
		int total = 0;
		int i = 30;

		while (i <= MAX) {
			total += i;
			System.out.print(i + " ");
			if (i < MAX) {
				System.out.print("+ ");
			}
			i += 10;
		}
		System.out.print("= " + total);
	}

	public static void test01(String[] args) {
		// 1~10까지의 합을 total에 누적하는 프로그램
		// while 문은 무한 루프에 사용된다.

//		int total = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			total += i;
//					
//		}
//		System.out.print("total => " + total);

		final int MAX = 10;
		int total = 0;
		int i = 1;
		while (i <= MAX) {
			total += i;
			System.out.print(i + " ");
			if (i != MAX) {
				System.out.print("+ ");
			}
			i++;
		}
		System.out.print("= " + total);
	}

}
