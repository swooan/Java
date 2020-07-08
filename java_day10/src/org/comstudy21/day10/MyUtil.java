package org.comstudy21.day10;

import java.io.IOException;

public class MyUtil {

	public static int getNum() {
		
		int num = 0;
		
//		System.out.print( "정수 입력 : ");		
		//num = System.in.read() - '0'; => 1~9까지만
//		num = num * 10 + System.in.read() - '0';
//		num = num * 10 + System.in.read() - '0'; => 10의자리
		
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') {// 엔터도 아스키 값을 가지고 있으니 엔터는 배제하는 식
				if(ch>='0' && ch<='9') {     
					num = num * 10 + ch - '0';	// read는 문자를 하나씩 밖에 인식 못함 
												// ex) 15의 경우 1을 먼저 인식하고 그 후에 5를 인식한다.
												// 그러므로 1을 십의 자리로 보내고 후에 5를 입력받는 식
				}			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println("num => " + num*);
		return num;
	}

	public static String getStr() {
		byte[] by = new byte[255];
		String str = null;
		try {
			System.in.read(by);
			str = new String(by).trim(); // trim = 문자열의 공백을 지워줌
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	
	
}
