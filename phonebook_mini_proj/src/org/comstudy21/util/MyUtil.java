package org.comstudy21.util;

import java.io.IOException;

public class MyUtil {
	public static int getNum() {
		int num = 0;
		
		try {
			int ch = 0;
			while((ch = System.in.read()) != '\n') {
				if(ch>='0' && ch <='9') {
					num = num * 10 + ch - '0';
				}				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return num;
	}
}
