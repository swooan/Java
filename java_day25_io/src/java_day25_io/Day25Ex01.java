package java_day25_io;

import java.io.IOException;
import java.util.Scanner;


public class Day25Ex01 {
	
	static Scanner scan = new Scanner(System.in);
	
	static String getS() {
		String s = null;
		byte[] by = new byte[255];
		
		try {
			System.in.read(by);
		} catch (IOException e) {
			e.printStackTrace();
		}
		s = new String(by).trim();
		
		return s;
	}
	
	public static void main(String[] args) {
		String name = null;
		String address = null;
		String phone = null;
		
		System.out.print("�̸� �Է� >>> ");
		name = getS();
		System.out.print("�ּ� �Է� >>> ");
		address = getS();		
		System.out.print("��ȣ �Է� >>> ");
		phone = getS();
		
		System.out.printf("%s,%s,%s\n" , name, address, phone);
	
	}
	
	public static void test03(String[] args) {
		String name = null;
		String address = null;
		String phone = null;
		
		System.out.print("�̸� �Է� >>> ");
		name = scan.next();
		System.out.print("�ּ� �Է� >>> ");
		if(scan.hasNextLine())
		scan.nextLine(); // ���۸� ����.
		address = scan.nextLine();		
		System.out.print("��ȣ �Է� >>> ");
		phone = scan.next();
		
		System.out.printf("%s,%s,%s\n" , name, address, phone);
	}
	
	public static void test02(String[] args) throws IOException {
		byte[] by = new byte[255];
		
		System.out.print("Ű���� �Է� >>> ");
		
		System.in.read(by);
		
//		System.out.write(by,0,10);
		
		String str = new String(by).trim();
		System.out.println(str.length());
		System.out.println(str);
	}
	// byte stream
	public static void test(String[] args) throws IOException {
		int ch = 0;
		
		System.out.print("Ű���� �Է� >>> ");
		while((ch=System.in.read()) != -1) {
			System.out.print((char)ch);
		}
	}
	
}
