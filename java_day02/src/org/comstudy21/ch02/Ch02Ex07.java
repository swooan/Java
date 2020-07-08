package org.comstudy21.ch02;

public class Ch02Ex07 {
	public static void test05(String[] args) {
		// ���ڿ� �񱳴� == ������ ����ϸ� �ȵ�!
		// ���ڿ� �񱳴� .equals() ������ ���!
		// �ٸ��� ����Ű : Ctrl + Shift + F
		
		String a1 = "korea";
		String a2 = "korea";
		
		System.out.println(a1 == a2); // true - �ǹ̰� �ٸ���.
		
		String b1 = new String ("korea");
		String b2 = new String ("korea");
		System.out.println(b1);
		System.out.println(a1 == b2); 
		System.out.println(b1.equals(b2)); // true
		System.out.println(a1.equals(b2));
		
		
		
	}
	
	public static void test04(String[] args) {
		// ���ڿ� ��ü(String)
		// - ���ڿ��� �Һ���ü�̴�.
		// - ���ڿ� ������ +�����ڷ� �����ϴ�.
		// replace() : ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		
		String str1 = "Hello java world";
		str1 = str1.replace("java", "python");
		System.out.println(str1);
		
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		str1 = str1.toLowerCase();
		System.out.println(str1);
		
		int idx1 = str1.indexOf("python");
		int idx2 = str1.indexOf("world");
		System.out.println(str1.indexOf("python"));
		String str2 = str1.substring(0, idx1) + str1.substring(idx2);
		System.out.println(str2);
		// index ī��Ʈ�� 0����
		
		// lastIndexof(); : �ڿ� �ܾ� ���°���� ī����
		String str3 = "apple tomato banana tomato apple";
		System.out.println(str3.indexOf("tomato"));
		System.out.println(str3.lastIndexOf("tomato"));
		
}
	
	public static void test03(String[] args) {
		// �ִ밪 ���ϱ� : Math.max(num1, num2);
		// �ּҰ� ���ϱ� : Math.min(num1, num2);
		
		System.out.println(Math.max(10,100));
		System.out.println(Math.max(100,10));
		System.out.println(Math.min(10,100));
		System.out.println(Math.min(100,10));
	}
	
	public static void test02(String[] args) {
		// [���� ����]
		// ���� �ϳ����� ����
		// ++, --
		// ���׿����� �켱������ ��Ģ���꺸�� ����.
		// ++x => +x    --x => -x
		
		int a=10, b=10;
		
		// ��������: ���� �Ŀ� x���� ����
		System.out.println("a++ => " + a++); //10 -> a ���� ���� �־ 10���� ��� ������ ��� �Ŀ� ++1�� ����
		System.out.println("a => " + a); //11 -> ��� �Ŀ� ������ �Ǿ��� ����
		
		// ��������: ���� ���� x���� ����
		System.out.println("++b => " + ++b); //11 -> ��� ���� ������ ���� �� �� b ���� ��� ��� 1++b�� ��
		System.out.println("b => " + b); //11
		
		System.out.println("a-- => " + a--); //11
		System.out.println("a => " + a); //10
		
		System.out.println("--b => " + --b); //10
		System.out.println("b => " + b); //10
		
		
	}
	
	public static void test01(String[] args) {
		System.out.println(10/3);
		System.out.println(10%3);
		
		
	}

	
}
// �ĺ��ڴ� ���ϴµ��� ���� ��� �����ϴ�.(�� ��� ��Ģ�� �ִ�.)
// ��Ÿ�� ǥ���
// ������, �Լ����� �ҹ��ڷ� �����ϰ� ���� �ܾ��� ù���ڴ� �빮��.
// Ŭ���� ���� �빮�ڷ� �����ϰ� �����ܾ��� ù ���ڴ� �빮��.
// ex) myName, yourName, myStudentNumber
// HelloWorld
// �Լ��� ����̴�.
// �Լ����� �Ϲ������� ���� + ��� �������� �����.
// ������ Ŭ������ ���� �����.

// ��� �������� �켱������ �������̰� ���󵵰� ����.
// ���ϱ�(+) : res = a + b;
// ����(-) : res = a - b;
// ���ϱ�(*) : res = a * b;
// ������(/) : res = a / b;
// ������(%) : res = a % b;

// �����ڿ��� �켱������ �ִ�.
// ����,�������� ����, ������, �������� �켱������ ����.
// �켱������ ���� ����� �߿�!!

