package OpenChallenge04;

import java.util.Scanner;

class Player {

	static int num;
	static String[] player;
	static String lastWord = "toy";
	static String nextWord;

	WordGameApp a1 = new WordGameApp();
	static Scanner scan2 = new Scanner(System.in);

	public Player() {

		this(0, null);

	}

	public Player(int num, String[] player) {

		this.num = num;
		this.player = player;

		for (int i = 0; i < num; i++) {

			this.player[i] = player[i];
		}
	}

	static void sayWord() {
		System.out.println("시작하는 단어는 " + lastWord + " 입니다.");
		while (true) {
			for (int i = 0; i <= num; i++) {
				if(i == num) {
					i = i % num;
				}
				System.out.println(player[i] + " >>> ");
				nextWord = scan2.next();
				succeed();
				
			}
		}

	}

	static void succeed() {
		int lastIndex = lastWord.length() - 1;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = nextWord.charAt(0);
		boolean flag = true;
		
		if (lastChar == firstChar) {
			flag = true;
			lastWord = nextWord;
		} else {
			flag = false;
		}
		if(flag == false) {
			System.out.println(player + "님이 졌습니다.");
			System.out.println(":::: 패배 ::::");
			System.exit(0);
		}
	}

}

public class WordGameApp {

	String[] player;
	static final Scanner scan1 = new Scanner(System.in);

	public static void login() {
		System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
		int num = scan1.nextInt();

		String[] player = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.println("참가자의 이름을 입력하세요 : ");
			String name = scan1.next();
			player[i] = new String(name);
		}
		Player a1 = new Player();
		a1.num = num;
		a1.player = player;
	}

	public static void main(String[] args) {

		login();
		Player.sayWord();

	}

}
