package java_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 5명의 이름을 키보드로 입력 받아서 배열에 저장한다.
		// 저장된 이름 중에 제일 긴 이름을 출력한다.
	
		String[] names = new String[5];
		String maxName = null;
		
		
		for(int i=0; i<5; i++) {			
			System.out.println("이름을 입력하세요 : ");
			names[i] = scan.next();
		}
		//System.out.println(Arrays.toString(names));
		int idx = 0;
		maxName = "";
		for(int i=0; i<names.length; i++) {
			if(maxName.length() < names[i].length()) {
				
				maxName = names[i];
			}
			if(names[idx].length() < names[i].length()) {
				idx = i;
			}
		}
		System.out.println("이름이 가장 긴 사람은 " + maxName + " 입니다.");
		System.out.println("이름이 가장 긴 사람은 " + names[idx] + " 입니다.");
	}
	
}
