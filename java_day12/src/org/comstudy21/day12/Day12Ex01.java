package org.comstudy21.day12;

import java.util.Arrays;
import java.util.Random;

public class Day12Ex01 {
	public static final int MAX = 45;
	public static final int SIZE = 6;
	public Day12Ex01() {
		lotto03();
	}
	
	void lotto03() {
		//로또번호 공 준비
		int[] balls = new int[MAX];
		for(int i = 0; i < MAX; i++) {
			balls[i] = i+1;
		}
		
		int[] lotto = new int[SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		while(cnt<SIZE) {
			int idx = rand.nextInt(MAX);
			
			if(balls[idx] != 0) {
				lotto[cnt] = balls[idx];
				balls[idx] = 0;
				cnt++;				
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	void lotto02() {
		int[] lotto = new int[SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		System.out.println("로또 번호 생성기 2");
		
		while(cnt < SIZE) {
			int num = 1 + rand.nextInt(MAX);
			//비교 후 추가
			boolean flag = true;
			for(int i = 0; i < cnt; i++) {
				if(lotto[i] == num) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[cnt] = num;			
				cnt++;	
			}
			
		}
		Arrays.sort(lotto); // 정렬하는 식 (정렬의 종류 : 선택, 삽입, 버블)
		System.out.println(Arrays.toString(lotto));
		
	}
	
	void lotto01() {
		int[] lotto = new int[SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		System.out.println("로또 번호 생성기");
		
		while(cnt<6) {
			
			lotto[cnt] = 1+ rand.nextInt(MAX);
			
			for(int i=0; i<cnt; i++) {
				if(lotto[i] == lotto[cnt]) {
					lotto[cnt] = 1+ rand.nextInt(MAX);
					i = -1;
				}
			}
			
			cnt++;
		}
		Arrays.sort(lotto); // 정렬하는 식 (정렬의 종류 : 선택, 삽입, 버블)
		System.out.println(Arrays.toString(lotto));
		
	}
	
	public static void main(String[] args) {
		new Day12Ex01();

	}

}
