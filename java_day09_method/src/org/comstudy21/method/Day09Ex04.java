package org.comstudy21.method;

public class Day09Ex04 {
	
	// 전달되는 인수의 타입과 매개변수의 타입은 일치해야 한다.
	static void add(int[] ar) {
//		ar[0] += 5;
//		ar[1] += 5;
		// ar[0]의 값과 ar[1] 값을 swap한다.
		
		int temp = 0;
		temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
		
		System.out.println(ar[0] + ", " + ar[1]);
	}

	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println(arr[0] + ", " + arr[1]);
		// 참조에 의한 호출 (call by reference)
		add(arr);
		
		System.out.println(arr[0] + ", " + arr[1]); // call by reference의 경우 아래의 값도 +5된 값이 나온다. -> 배열 안의 숫자가 add 함수에 의해서 바뀌고 바뀐 숫자가 다시 배열안에 저장 그 후에 그 배열 안의 수를 출력하기 때문에
	}

}
