//package OpenChallenge05;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class CompactDisc extends Product { // ����, ���� �̸�
//	static Scanner scan5 = new Scanner(System.in);
//
//	static String album;
//	static String singer;
//
//	public CompactDisc(String intro, String producer, String price, String album, String singer) {
//		super(intro, producer, price);
//		this.album = album;
//		this.singer = singer;
//	}
//
//	static void run() {
//		basicInfo();
//		System.out.println("�뷡 ���� >>> ");
//		album = scan5.next();
//		System.out.println("���� >>> ");
//		singer = scan5.next();
//		top++;
//	}
//
//	static void play() {
//		System.out.println("�Ұ� : " + intro + "\n������ : " + producer + "\n���� : "+price+"\n�뷡 ���� : "+album+"\n���� : "+singer); 
//	}
//	
//}
//
//class ConversationBook extends Book { // ���
//
//	static Scanner scan4 = new Scanner(System.in);
//
//	static String language;
//
//	public ConversationBook(String intro, String producer, String price, String ISBN, String author, String title,
//			String language) {
//		super(intro, producer, price, ISBN, author, title);
//		this.language = language;
//	}
//
//	static void run2() {
//		run();
//		top--;
//		System.out.print("��� >>> ");
//		language = scan4.next();
//		top++;
//	}
//	
//	static void play() {
//		System.out.println("�Ұ� : " + intro + "\n������ : " + producer + "\n���� : "+price+"\nISBN : "+ISBN+"\n�۰� : "+author+"\n���� : " + title +"\n��� : "+ language); 
//	}
//
//}
//
//class Book extends Product { // ISBN , ���� , å ����
//	static Scanner scan3 = new Scanner(System.in);
//
//	static String ISBN;
//	static String author;
//	static String title;
//
//	public Book(String intro, String producer, String price, String ISBN, String author, String title) {
//		super(intro, producer, price);
//		this.ISBN = ISBN;
//		this.author = author;
//		this.title = title;
//	}
//
//	static void run() {
//		basicInfo();
//		System.out.print("ISBN >>> ");
//		ISBN = scan3.next();
//		System.out.print("���� >>> ");
//		title = scan3.next();
//		System.out.print("�۰� >>> ");
//		author = scan3.next();
//
//		top++;
//	}
//	
//	
//	static void play() {
//		System.out.println("�Ұ� : " + intro + "\n������ : " + producer + "\n���� : "+price+"\nISBN : "+ISBN+"\n�۰� : "+author+"\n���� : " + title);
//	}
//
//}
//
//class Product { // �� ��ǰ�� ���� �ĺ���, ��ǰ����, ������, ����
//	static Scanner scan2 = new Scanner(System.in);
//	static ArrayList<Book> arr = new ArrayList<Book>();
//	static ArrayList<ConversationBook> arr2 = new ArrayList<ConversationBook>();
//	static ArrayList<CompactDisc> arr3 = new ArrayList<CompactDisc>();
//
//	static String intro;
//	static String producer;
//	static String price;
//
//	static int top = 0;
//
//	public Product() {
//
//	}
//
//	public Product(String intro, String producer, String price) {
//		this.intro = intro;
//		this.producer = producer;
//		this.price = price;
//
//	}
//
//	static void basicInfo() {
//		System.out.print("��ǰ ���� >>> ");
//		intro = scan2.next();
//		System.out.print("������ >>> ");
//		producer = scan2.next();
//		System.out.print("���� >>> ");
//		price = scan2.next();
//	}
//
//	void add(Book book) {
//		arr.add(book);
//	}
//
//	void add(ConversationBook con) {
//		arr2.add(con);
//	}
//
//	void add(CompactDisc cd) {
//		arr3.add(cd);
//	}
//
//	static void outputData() {
//		for(Book book:arr) Book.play();
//		for(ConversationBook con:arr2) ConversationBook.play();
//		for(CompactDisc cd:arr3) CompactDisc.play();
//							
//
//
//	}
//
//}
//
//public class ProductInfo_2 {
//	static Scanner scan = new Scanner(System.in);
//
//	static void output() {
//		Product.outputData();
//	}
//
//	static void input() {
//		System.out.println("��ǰ ����");
//		System.out.print("å<1>, ����CD<2>, ȸȭå<3> >>> ");
//		int num2 = scan.nextInt();
//
//		switch (num2) {
//
//		case 1:
//			Book.run();
//			break;
//
//		case 2:
//			CompactDisc.run();
//			break;
//
//		case 3:
//			ConversationBook.run2();
//			break;
//
//		default:
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			return;
//		}
//	}
//
//	static void mainMenu() {
//		while (true) {
//			System.out.print("��ǰ �߰�<1>, ��� ��ǰ ��ȸ<2>, ������<3> >>> ");
//			int num1 = scan.nextInt();
//			switch (num1) {
//			case 1:
//				input();
//				break;
//			case 2:
//				output();
//				break;
//			case 3:
//				System.out.print("���α׷��� �����մϴ�.");
//				System.exit(0);
//				break;
//			default:
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		mainMenu();
//	}
//}
