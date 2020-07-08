package note;

public class note1 {

	public static void main(String[] args) {
		
		int num =10;
		int num2 = 20;
		
		int result = (num >= 10) ? num2 + 10 : num2 -10;
		System.out.println(result); // num>=10 이 참이므로 num2 +10 대입 = 30
		
	}
	
	public static void test3_6(String[] args) {
		
		int num = 8;
		
		System.out.println(num += 10); // num = 8+10 = 18
		System.out.println(num -= 10); // num = 18-10 = 8
		System.out.println(num >>= 2); // 8 = 1000 => 0010
		
	}
	
	public static void test3_5(String[] args) {
		
		int num1 = 2;
		int num2 = 10;
		
		System.out.println(num1 & num2); // 0010 & 1010 = 0010 => 2
		System.out.println(num1 | num2); // 0010 | 1010 = 1010 => 10
		System.out.println(num1 ^ num2); // 0010 ^ 1010 = 1000 => 8
		System.out.println(~num1); // ~0010 => 111111...1101
		
	}
	
	public static void test3_4(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result); // false
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result); // true
		System.out.println(!result); // false
		
	}
	
	public static void test3_3(String[] args) {
		
	int num = 10;
	System.out.println(num); //10
	System.out.println(num++); //10
	System.out.println(num); //11
	System.out.println(--num); //10
		
	}
	
	public static void test3_2(String[] args) {
	
	int num;
	num= -5 + 3 * 10 / 2;
	System.out.println(num); // 10
		
	}
	
	public static void test3_1(String[] args) {
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge>25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}
	
	public static void test2_5(String[] args) {
	
		char a = '\uAE00';
		System.out.println(a);
		
		
	}
	
	public static void test2_4(String[] args) {
		
	 double a = 2.0;
	 int b = 10;
	 
	 System.out.println((int)a + b);
	 System.out.println((int)a - b);
	 System.out.println((int)a * b);
	 System.out.println((int)a / b);
	
	}
}
