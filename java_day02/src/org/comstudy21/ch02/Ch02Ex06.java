package org.comstudy21.ch02;

public class Ch02Ex06 {
	
	public static void main(String[] args) {
		//Math.random() - ���� �߻���
		//1���� ���� �Ҽ����� ������ �߻���Ų��.
		double number = Math.random();
		System.out.println((int)(number*100)+1); //1~100���� ��������
		
		System.out.println(5 + (int)(Math.random()*5));
		
		//70~100 ������ ������ ����� ����
		System.out.println(70 + (int)(Math.random()*31));

		
		// ĳ���� - ��������ȯ
		//   ������ �����ʹ� Ÿ���� ��ġ�ؾ� �Ѵ�.
		
		// ����ȭ(������ ����ȯ) : �����Ϸ��� ���� �ڵ����� ����ȯ - ���θ��
		//   ūŸ���� ������ ���� Ÿ���� �����͸� ������ �� �Ͼ��.
		
		// ����ȭ(����� ����ȯ) : ĳ��Ʈ �����ڸ� �̿��ؼ� �� ��ȯ - ĳ����
		//   ���� Ÿ���� ������ ū Ÿ���� �����͸� ������ �� �Ͼ��.
		int a = (int)100L;
		int b = (int)3.14;
		float c = (float)3.14;
		double d = 10 * 3.14;
		double e = (double)10/3; //3.333333
		double f = (double)(10/3); //3.0
		System.out.println(e);
		System.out.println(f);
		
		// ���ڿ��� ���� null�� ǥ�õȴ�.
		// "A" --- ������ �α��� [A][\0]
		// ���ڿ� ������ Null�̳� ""�� �ʱ�ȭ
		// null�� ""�� �ǹ̰� �ٸ���.
		String aStr = null; // ����ִ�.
		String bStr = ""; // ��ü�� �ִµ� ���ڰ� ����.
		
		System.out.println(aStr);
		System.out.println(bStr);
		
	}
	
	public static void test02(String[] args) {
		//test(null);
		int myAge = 1_234_567;
		long yourAge = 12L;
		
		double myHeight = 123.456789;
		float myWeight = 85.12345678f;
		
		double result = myAge + myHeight;
		
		char myBlood = 'A';
		myBlood += 1; // myBlood = myBlood +1;
		
		boolean isTrue = true;
		isTrue = false;
		//isTrue = 100; x
		
		System.out.println("isTrue => " + isTrue);
	}
	
	public static void test(String[] args) {
		int a= 100_000_000;
		System.out.println(a);
		
		
		
	}
}
