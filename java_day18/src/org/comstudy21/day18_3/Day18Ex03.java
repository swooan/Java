package org.comstudy21.day18_3;

import java.util.Scanner;

// 참가자
class Player {
	String name;
	
	Scanner scan = new Scanner(System.in);
	
	public Player() {
		System.out.print("이름을 입력하세요 >>> ");
		name = scan.next();
	}
	
	String wordCheck(String oldWord) {
		String newWord = null;
		System.out.print(name + " >> ");
		newWord = scan.next();
		char lastChar = oldWord.charAt(oldWord.length()-1);
		char firstChar = newWord.charAt(0);
		if(lastChar == firstChar) {
			return newWord;			
		}
		else {
			System.out.println(name + "이 졌습니다.");
			return null;
		}
	}
}

class WordGame {
	Player[] pArr; // 참가자 수
	int size;
	
	Scanner scan = new Scanner(System.in);
	
	public WordGame() {
		System.out.print("게임에 참가하는 인원은 몇명입니까? >>> ");
		size = scan.nextInt();
		pArr = new Player[size];
		
		for(int i =0; i< size; i++) {
			pArr[i] = new Player();
		}
		
		play();
	}
	
	public void play() {
		String word = "아버지";
		
		System.out.printf("시작단어는 %s 입니다. \n", word);
		for(int i = 0; ; i++) {
			if(word != null) {
				word = pArr[i%size].wordCheck(word);
			}
			else {
				break;
			}
		}
	}
}

public class Day18Ex03 {

	public static void main(String[] args) {
		new WordGame();
	}

}
