package org.comstudy21.method;

import java.util.Arrays;

public class Day09Ex07 {

	static void reverse(int[]arr) {
		
		int end = arr.length - 1;
		for(int i = 0; i<arr.length/2; i++) {
			int temp = 0;
			
			temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;	
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(arr));
		
		reverse(arr); // 요소의 위치를 뒤바꿔준다.
		
		//{7,6,5,4,3,2,1} 로 보이게 출력
		System.out.println(Arrays.toString(arr));

	}

}
