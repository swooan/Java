package java_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 5���� �̸��� Ű����� �Է� �޾Ƽ� �迭�� �����Ѵ�.
		// ����� �̸� �߿� ���� �� �̸��� ����Ѵ�.
	
		String[] names = new String[5];
		String maxName = null;
		
		
		for(int i=0; i<5; i++) {			
			System.out.println("�̸��� �Է��ϼ��� : ");
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
		System.out.println("�̸��� ���� �� ����� " + maxName + " �Դϴ�.");
		System.out.println("�̸��� ���� �� ����� " + names[idx] + " �Դϴ�.");
	}
	
}
