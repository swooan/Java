package org.comstudy21.day10;

import java.io.IOException;

public class MyUtil {

	public static int getNum() {
		
		int num = 0;
		
//		System.out.print( "���� �Է� : ");		
		//num = System.in.read() - '0'; => 1~9������
//		num = num * 10 + System.in.read() - '0';
//		num = num * 10 + System.in.read() - '0'; => 10���ڸ�
		
		int ch = 0;
		try {
			while((ch=System.in.read())!='\n') {// ���͵� �ƽ�Ű ���� ������ ������ ���ʹ� �����ϴ� ��
				if(ch>='0' && ch<='9') {     
					num = num * 10 + ch - '0';	// read�� ���ڸ� �ϳ��� �ۿ� �ν� ���� 
												// ex) 15�� ��� 1�� ���� �ν��ϰ� �� �Ŀ� 5�� �ν��Ѵ�.
												// �׷��Ƿ� 1�� ���� �ڸ��� ������ �Ŀ� 5�� �Է¹޴� ��
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
			str = new String(by).trim(); // trim = ���ڿ��� ������ ������
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	
	
}
