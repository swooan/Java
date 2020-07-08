package org.comstudy21.ch02;

public class Ch02Ex05 {
	public static void main(String[] args) {
		//나는 "개발자" 입니다!
		System.out.println("나는 \"개발자\"입니다.");
		// \",\',\\=>기호 표시
		System.out.println("성명:홍길동\n나이:18");
		// \n=> 줄바꿈
		System.out.println("성명\t홍길동");
		System.out.println("나이\t19");
		// \t=> 탭으로 일정 간격을 띄운다
		// \b=> 백스페이스기능
		// \r=> 커서 맨 앞으로 옮김
		
		System.out.println(Math.E); // 지수값
		System.out.println(Math.PI); //파이값
		System.out.println(Math.abs(-45)); // 절대값
		System.out.println(Math.pow(100,2)); // 제곱
		System.out.println(5*5); //정수와 정수의 연산 결과는 정수
		System.out.println(Math.pow(5, 2));

		System.out.println(10/3); 
		System.out.println(10/(double)3);
	}
}
