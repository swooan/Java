package org.comstudy21.phonebook.util;

import java.io.IOException;
import java.util.Scanner;

public class MyUtil {
	public static final Scanner scan = new Scanner(System.in);
	
	public static int getNum() {
		int num = 0;
		int ch = 0;
		
		try {
			while((ch = System.in.read()) != '\n') {
				if(ch >= '0' && ch <= '9') {					
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return num;
	}
	
	public static void puts(String s) {
		System.out.print(s);
		// 줄 안바뀌는거
	}
	
	public static void putsln(String str) {
		System.out.println(str);
		// 줄 바뀌는거
	}
}
