package org.comstudy21.method;

public class Day09Ex04 {
	
	// ���޵Ǵ� �μ��� Ÿ�԰� �Ű������� Ÿ���� ��ġ�ؾ� �Ѵ�.
	static void add(int[] ar) {
//		ar[0] += 5;
//		ar[1] += 5;
		// ar[0]�� ���� ar[1] ���� swap�Ѵ�.
		
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
		// ������ ���� ȣ�� (call by reference)
		add(arr);
		
		System.out.println(arr[0] + ", " + arr[1]); // call by reference�� ��� �Ʒ��� ���� +5�� ���� ���´�. -> �迭 ���� ���ڰ� add �Լ��� ���ؼ� �ٲ�� �ٲ� ���ڰ� �ٽ� �迭�ȿ� ���� �� �Ŀ� �� �迭 ���� ���� ����ϱ� ������
	}

}
