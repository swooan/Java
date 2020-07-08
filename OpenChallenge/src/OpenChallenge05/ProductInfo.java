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
		System.out.print("��� >>> ");
		language[ID] = scan5.next();
		ID++;
	}

	static void show2() {
		for (int i = 0; i < ID; i++) {
			if (language[i] != null) {
				show();
				System.out.println("��� >>> " + language[i]);
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
		System.out.print("�뷡 ���� >>> ");
		album[ID] = scan5.next();
		System.out.print("���� >>> ");
		singer[ID] = scan5.next();
		ID++;
	}

	static void show() {

		for (int i = 0; i < ID; i++) {
			if (album[i] != null) {
				show0(i);
				System.out.println("���� >>> " + album[i]);
				System.out.println("���� >>> " + singer[i]);
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
		System.out.print("���� >>> ");
		title[ID] = scan3.next();
		System.out.print("�۰� >>> ");
		author[ID] = scan3.next();

		ID++;
	}

	static void show() {

		for (int i = 0; i < ID; i++) {
			if (ISBN[i] != null) {
				show0(i);
				System.out.println("ISBN >>> " + ISBN[i]);
				System.out.println("���� >>> " + title[i]);
				System.out.println("�۰� >>> " + author[i]);
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
		System.out.print("��ǰ ���� >>> ");
		intro[ID] = scan2.next();
		System.out.print("������ >>> ");
		producer[ID] = scan2.next();
		System.out.print("���� >>> ");
		price[ID] = scan2.next();
	}

	static void show0(int i) {

			System.out.println("ID >>> " + i);
			System.out.println("��ǰ ���� >>> " + intro[i]);
			System.out.println("������ >>> " + producer[i]);
			System.out.println("���� >>> " + price[i]);

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
		System.out.println("��� �����մϴ�.");
		System.exit(0);
	}

	static void output() {
		Product.outputInfo();
	}

	static void Input() {
		System.out.print("��ǰ ����");
		System.out.print("å<1>, ����CD<2>, ȸȭå<3> >>> ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
	}

	static void mainMenu() {

		while (true) {
			System.out.print("��ǰ �߰�<1>, ��� ��ǰ ��ȸ<2>, ������<3> >>> ");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}

		}

	}

	public static void main(String[] args) {

		mainMenu();

	}

}