package java_day25_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day25Ex02 {
	public static void main(String[] args) throws IOException {
		// ���۵帮���� �̿��� �Է�
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		System.out.print("�����Է� >>> ");
		String name = in.readLine();
		System.out.print("�ּ��Է� >>> ");
		String address =in.readLine();
		System.out.print("���� �Է� >>>");
		int age = Integer.parseInt(in.readLine());
		
		System.out.printf("%s, %s\n",name,address);
		System.out.println("10���� ���� : " + (age+10));
	}
}
