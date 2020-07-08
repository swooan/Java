package note;

import java.util.Scanner;

public class note3 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 0     *
		// 1    ***
		// 2   *****
		// 3  *******
		// 4 *********
		// 5  *******
		// 6   *****
		// 7    ***
		// 8     *
		
		int cnt = 4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<cnt; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(5-cnt)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<4) cnt--;
			else cnt++;
		}
		
		
		
		
		
	}
	
	public static void note01(String[] args) {
//     *
//    ***
//   *****
//    ***
//     *
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				for (int j = 0; j < 5; j++) {
					System.out.print((j == 2) ? "*" : " ");
				}
			}
			else if(i == 1 || i==3) {
				for(int j = 0; j<5; j++) {
					System.out.print((j>=1 && j<=3) ? "*" : " ");
				}
			}
			else {
				for(int j=0; j<5; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void test(String[] args) {

		int ranking = 1;
		String medalColor = "a";

		System.out.println("랭킹: ");
		ranking = scan.nextInt();

		switch (ranking) {
		case 1:
			medalColor = "금메달";
			break;
		case 2:
			medalColor = "은메달";
			break;
		case 3:
			medalColor = "동메달";
			break;
		case 4:
			medalColor = "쟌넨";
			break;
		}
		System.out.println(ranking + "등은 " + medalColor + "입니다.");
	}
}
