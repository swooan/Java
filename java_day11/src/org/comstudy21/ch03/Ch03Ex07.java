package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex07 {

	public Ch03Ex07() {
	
		test();
}
	public void test() {
		int[] arr = new int[5];
		int sum = 0;
		
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + rand.nextInt(10);
			sum += arr[i];
		}
		
		double avg = (double)sum/arr.length;
		System.out.println("�� �հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		new Ch03Ex07();

	}

}
