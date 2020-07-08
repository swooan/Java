package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex05 {

	// 로또 번호 중복 안되게 3가지 형태로 만들어보기

	public static void lotto3(String[] args) {
		int[] lotto = new int[6];
		Random rand = new Random();
		int cnt = 0;
		int i = 0;
		boolean flag = true;

		for (cnt = 0; cnt < 6; cnt++) {
			lotto[cnt] = 1 + rand.nextInt(45);
			while (i < cnt) {
				if(lotto[cnt] == lotto[i]) {					
					if (flag = false) {
						lotto[cnt] = 1 + rand.nextInt(45);
						i = 0;
					}
				}
				i++;
			}
		}

		System.out.println(Arrays.toString(lotto));
	}

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random rand = new Random();

		for (int cnt = 5; cnt >= 0; cnt--) {
			lotto[cnt] = 1 + rand.nextInt(6);
			outer: for (int i = 5; i > cnt; i--) {
				if (lotto[cnt] == lotto[i]) {
					lotto[cnt] = 1 + rand.nextInt(6);
					i=6;
					continue outer;
				}
			}

		}
		System.out.println(Arrays.toString(lotto));
	}

	public static void lotto1(String[] args) {
		int[] lotto = new int[6];
		Random rand = new Random();
		int cnt = 0;

		while (cnt < 6) {
			lotto[cnt] = 1 + rand.nextInt(45);
			for (int i = 0; i < cnt; i++) {
				if (lotto[cnt] == lotto[i]) {
					do {
						lotto[cnt] = 1 + rand.nextInt(45);
					} while (lotto[cnt] == lotto[i]);
				}
			}
			cnt++;
		}

		System.out.println(Arrays.toString(lotto));

	}

}
