package org.comstudy21.ch02;

public class Ch02Ex08 {

	public static void main(String[] args) {
		// ���ڿ� ���� �޼ҵ�
		// ���ڿ� ���� : + ������ �̿�
		
		String str1 = "Hello " + "world";
		System.out.println("str1 => " + str1);
		
		str1 = str1 + " Python!";
		str1.concat(" Java!");
		
		System.out.println("str1 => " + str1);
		//Hello world Python!
		
		int index1 = str1.indexOf("world");
		int index2 = str1.indexOf("Python");
		//System.out.println("index1 => " + index1);
		//str1 = str1.substring(0, index1);
		//str1 = str1.substring(index2);
		str1 = str1.substring(0, index1) + str1.substring(index2);		
		System.out.println(str1);
		
		}
}
