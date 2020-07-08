package OpenChallenge05;

import java.util.Scanner;

class ConversationBook extends Book {
	static Scanner scan5 = new Scanner(System.in);
	static String[] language = new String[MAX];

	public ConversationBook(String[] intro, String[] producer, String[] price, String[] ISBN, String[] author,
			String[] title, String[] language) {
		super(intro, producer, price, ISBN, author, title);
		this.language = language;
	}

	static void run2() {
		run();
		ID--;
		System.out.print("언어 >>> ");
		language[ID] = scan5.next();
		ID++;
	}

	static void show2() {
		for (int i = 0; i < ID; i++) {
			if (language[i] != null) {
				show();
				System.out.println("언어 >>> " + language[i]);
			}

		}

	}

}

class CompactDisc extends Product {
	static Scanner scan5 = new Scanner(System.in);
	static String[] album = new String[MAX];
	static String[] singer = new String[MAX];

	public CompactDisc(String[] intro, String[] producer, String[] price, String[] album, String[] singer) {
		super(intro, producer, price);
		this.album = album;
		this.singer = singer;
	}

	static void run() {
		basicInfo();
		System.out.print("노래 제목 >>> ");
		album[ID] = scan5.next();
		System.out.print("가수 >>> ");
		singer[ID] = scan5.next();
		ID++;
	}

	static void show() {

		for (int i = 0; i < ID; i++) {
			if (album[i] != null) {
				show0(i);
				System.out.println("제목 >>> " + album[i]);
				System.out.println("가수 >>> " + singer[i]);
			}

		}

	}

}

class Book extends Product {
	static Scanner scan3 = new Scanner(System.in);
	static String[] ISBN = new String[MAX];
	static String[] title = new String[MAX];
	static String[] author = new String[MAX];

	public Book(String[] intro, String[] producer, String[] price, String[] ISBN, String[] author, String[] title) {
		super(intro, producer, price);
		this.ISBN = ISBN;
		this.author = author;
		this.title = title;
	}

	static void run() {
		basicInfo();
		System.out.print("ISBN >>> ");
		ISBN[ID] = scan3.next();
		System.out.print("제목 >>> ");
		title[ID] = scan3.next();
		System.out.print("작가 >>> ");
		author[ID] = scan3.next();

		ID++;
	}

	static void show() {

		for (int i = 0; i < ID; i++) {
			if (ISBN[i] != null) {
				show0(i);
				System.out.println("ISBN >>> " + ISBN[i]);
				System.out.println("제목 >>> " + title[i]);
				System.out.println("작가 >>> " + author[i]);
			}

		}

	}

}

class Product {
	static Scanner scan2 = new Scanner(System.in);

	static int MAX = 10;
	static int ID = 0;
	static String[] intro = new String[MAX];
	static String[] producer = new String[MAX];
	static String[] price = new String[MAX];
	static int i = 0;

	public Product() {

	}

	public Product(String[] intro, String[] producer, String[] price) {
		this.intro = intro;
		this.producer = producer;
		this.price = price;

	}

	static void basicInfo() {
		System.out.print("상품 설명 >>> ");
		intro[ID] = scan2.next();
		System.out.print("생산자 >>> ");
		producer[ID] = scan2.next();
		System.out.print("가격 >>> ");
		price[ID] = scan2.next();
	}

	static void show0(int i) {

			System.out.println("ID >>> " + i);
			System.out.println("상품 설명 >>> " + intro[i]);
			System.out.println("생산자 >>> " + producer[i]);
			System.out.println("가격 >>> " + price[i]);

	}

	static void outputInfo() {
		Book.show();
		CompactDisc.show();
		ConversationBook.show2();
	}

}

public class ProductInfo {

	static Scanner scan = new Scanner(System.in);

	Product pro = new Product();

	static void end() {
		System.out.println("장비를 정지합니다.");
		System.exit(0);
	}

	static void output() {
		Product.outputInfo();
	}

	static void Input() {
		System.out.print("상품 종류");
		System.out.print("책<1>, 음악CD<2>, 회화책<3> >>> ");
		int num2 = scan.nextInt();

		switch (num2) {

		case 1:
			Book.run();
			break;

		case 2:
			CompactDisc.run();
			break;

		case 3:
			ConversationBook.run2();
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	static void mainMenu() {

		while (true) {
			System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >>> ");
			int num1 = scan.nextInt();

			switch (num1) {
			case 1:
				Input();
				break;

			case 2:
				output();
				break;

			case 3:
				end();
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		}

	}

	public static void main(String[] args) {

		mainMenu();

	}

}