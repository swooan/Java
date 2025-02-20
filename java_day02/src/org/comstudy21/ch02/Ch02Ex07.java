package org.comstudy21.ch02;

public class Ch02Ex07 {
	public static void test05(String[] args) {
		// 문자열 비교는 == 연산자 사용하면 안됨!
		// 문자열 비교는 .equals() 연산자 사용!
		// 줄만춤 단축키 : Ctrl + Shift + F
		
		String a1 = "korea";
		String a2 = "korea";
		
		System.out.println(a1 == a2); // true - 의미가 다르다.
		
		String b1 = new String ("korea");
		String b2 = new String ("korea");
		System.out.println(b1);
		System.out.println(a1 == b2); 
		System.out.println(b1.equals(b2)); // true
		System.out.println(a1.equals(b2));
		
		
		
	}
	
	public static void test04(String[] args) {
		// 문자열 객체(String)
		// - 문자열은 불변객체이다.
		// - 문자열 결합은 +연산자로 가능하다.
		// replace() : 문자열을 수정해서 반환한다.
		
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
		// index 카운트는 0부터
		
		// lastIndexof(); : 뒤에 단어 몇번째인지 카운팅
		String str3 = "apple tomato banana tomato apple";
		System.out.println(str3.indexOf("tomato"));
		System.out.println(str3.lastIndexOf("tomato"));
		
}
	
	public static void test03(String[] args) {
		// 최대값 구하기 : Math.max(num1, num2);
		// 최소값 구하기 : Math.min(num1, num2);
		
		System.out.println(Math.max(10,100));
		System.out.println(Math.max(100,10));
		System.out.println(Math.min(10,100));
		System.out.println(Math.min(100,10));
	}
	
	public static void test02(String[] args) {
		// [단항 연산]
		// 항이 하나뿐인 연산
		// ++, --
		// 단항연산의 우선쉰위는 사칙연산보다 높다.
		// ++x => +x    --x => -x
		
		int a=10, b=10;
		
		// 후위연산: 연산 후에 x값이 증가
		System.out.println("a++ => " + a++); //10 -> a 값이 먼저 있어서 10으로 출력 되지만 출력 후에 ++1이 계산됨
		System.out.println("a => " + a); //11 -> 출력 후에 연산이 되었단 증거
		
		// 전위연산: 연산 전에 x값이 증가
		System.out.println("++b => " + ++b); //11 -> 출력 전에 연산이 먼저 된 후 b 값을 출력 고로 1++b가 됨
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
// 식별자는 원하는데로 뭐든 사용 가능하다.(단 몇가지 규칙이 있다.)
// 낙타봉 표기법
// 변수명, 함수명은 소문자로 시작하고 다음 단어의 첫글자는 대문자.
// 클래스 명은 대문자로 시작하고 다음단어의 첫 글자는 대문자.
// ex) myName, yourName, myStudentNumber
// HelloWorld
// 함수는 기능이다.
// 함수명은 일반적으로 동사 + 명사 형식으로 만든다.
// 변수나 클래스는 명사로 만든다.

// 산술 연산자의 우선순위가 높은편이고 사용빈도가 높다.
// 더하기(+) : res = a + b;
// 빼기(-) : res = a - b;
// 곱하기(*) : res = a * b;
// 나누기(/) : res = a / b;
// 나머지(%) : res = a % b;

// 연산자에는 우선순위가 있다.
// 덧셈,뺄셈보다 곱셈, 나눗셈, 나머지의 우선순위가 높다.
// 우선순위와 결합 방식이 중요!!

