package java_day07;

import java.util.Arrays;

public class Ch05Ex02 {

	public static void main(String[] args) {
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] score = {85,90,75,100,95};
		
		// Arrays �� �̿��ؼ� �迭 ��� �Ѳ����� ����ϱ�
		// System.out.println(Arrays.toString(score));
		
		int total = 0;
		
		// score.length : score(�迭) �� ������ �ִ� �ִ� ���̸� ������ �Ӽ�
		// system.out.print : out => �Ӽ� , print ~ => �޼ҵ�, system => �迭
		for(int index=0; index<score.length; index++) {
			// System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (double)total / score.length);
	}
}
