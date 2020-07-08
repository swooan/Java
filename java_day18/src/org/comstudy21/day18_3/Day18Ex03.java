package org.comstudy21.day18_3;

import java.util.Scanner;

// ������
class Player {
	String name;
	
	Scanner scan = new Scanner(System.in);
	
	public Player() {
		System.out.print("�̸��� �Է��ϼ��� >>> ");
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
			System.out.println(name + "�� �����ϴ�.");
			return null;
		}
	}
}

class WordGame {
	Player[] pArr; // ������ ��
	int size;
	
	Scanner scan = new Scanner(System.in);
	
	public WordGame() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�? >>> ");
		size = scan.nextInt();
		pArr = new Player[size];
		
		for(int i =0; i< size; i++) {
			pArr[i] = new Player();
		}
		
		play();
	}
	
	public void play() {
		String word = "�ƹ���";
		
		System.out.printf("���۴ܾ�� %s �Դϴ�. \n", word);
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
