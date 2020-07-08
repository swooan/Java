package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20 {

	public static void main(String[] args) {

		// ���� �߻���
		// -> Math.randam()
		// -> Random Ŭ������ �̿��� ���� �߻���
		// �����̸� ����! �ϰ� ������
		// �����̸� ū������ ���������� ǥ���ϰ� ������ �ٿ��ش�.
		// 6�� ���� �����߸� �ǰ�
		// ��õ��Ͻðڽ��ϱ�?(Y/N)

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int min = 1, max = 100;
		int number = min + rand.nextInt(max);
		int userNum = 0;
		int cnt = 6;
		char YN = 'Y';

		System.out.print("�ý����� ���ڸ� ��������ϴ�.");
		System.out.println("(hint : " + number + ")");
		System.out.println("��ȸ��" + cnt + "�� �ֽ��ϴ�!");

		System.out.printf("���纸����(%d~%d) : ", min, max);
		userNum = scan.nextInt();
		for (; cnt > 0; cnt--) {
			while (userNum > max || userNum < min) {
				System.out.printf("�ٽ� �Է��ϼ���(%d~%d) : ", min, max);
				userNum = scan.nextInt();
			}

			if (userNum > number) {
				System.out.println("DOWN!");
				max = userNum - 1;
				System.out.println("���� : " + min + "~" + max);
				System.out.print("���� �Է� : ");
				userNum = scan.nextInt();

			} else if (userNum < number) {
				System.out.println("UP!");
				min = userNum + 1;
				System.out.println("���� : " + min + "~" + max);
				System.out.print("���� �Է� : ");
				userNum = scan.nextInt();

			} else {
				System.out.println("\n����!!");
				break;
			}

			if (cnt == 2) {
				System.out.println("Fail!");
				System.out.println("������ : " + number + "�Դϴ�!");
				break;
			}
		}
		System.out.print("�ٽ� �����Ͻðڽ��ϱ�? (Y/N) : ");
		YN = scan2.next().charAt(0);
		while (!(YN == 'Y' || YN == 'N' || YN == 'y' || YN == 'n')) {
			System.out.print("y �Ǵ� n �� �Է��ϼ��� (Y/N) : ");
			YN = scan2.next().charAt(0);
		}
		if (YN == 'Y' || YN == 'y') {
			System.out.println("������ ���� �����մϴ�.");
			System.out.println();
			main(null);
		} else if (YN == 'N' || YN == 'n') {
			System.out.println("�����ϼ̽��ϴ�.");
			System.exit(0);
		}
	}

	public static void test05(String[] args) {
		// ����
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
//	  //while���� �̿��ؼ� �Ǻ���ġ ���� ����
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

//	 int total = 0; // 1. ó�� ������ -1+2-3+4 �� ���� �Ǵ� total�� 2�� �ٲ��ش�.
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
		// 30 + 40 + 50 + 60 + 70 = 250�� ��µǵ���
		// while ���� �̿��ؼ� �����Ͻÿ�

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
		// 1~10������ ���� total�� �����ϴ� ���α׷�
		// while ���� ���� ������ ���ȴ�.

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
