package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex06 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("���ڿ� �Է�: ");
		
		// ���ڿ��� byte �迭�� �Է�
		byte[] b = new byte[100];
		System.in.read(b);
		
		//byte �迭�� �ִ� ���ڿ��� ���
		//System.out.write(b);
		System.out.println(new String(b).trim());

	}

}
