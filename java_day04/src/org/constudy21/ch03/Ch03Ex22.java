package org.constudy21.ch03;

public class Ch03Ex22 {

	public static void main(String[] args) {
		
		int total = 0;
		//1~10까지의 누적값을 total에 누적하는 프로그램을 만든다.
		// 결과 : 1~10까지의 합은 55 입니다.
		for(int n = 1; n <= 10; n++) {
			//반복 할 때마다 반복문 내부에서 증가한다.
			//total += n;
			total = total + n;
			
		}
		System.out.println("1~10까지의 합은 " + total + "입니다.");
		
	}
}
