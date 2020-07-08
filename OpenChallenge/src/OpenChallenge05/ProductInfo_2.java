//package OpenChallenge05;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class CompactDisc extends Product { // 제목, 가수 이름
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
//		System.out.println("노래 제목 >>> ");
//		album = scan5.next();
//		System.out.println("가수 >>> ");
//		singer = scan5.next();
//		top++;
//	}
//
//	static void play() {
//		System.out.println("소개 : " + intro + "\n제작자 : " + producer + "\n가격 : "+price+"\n노래 제목 : "+album+"\n가수 : "+singer); 
//	}
//	
//}
//
//class ConversationBook extends Book { // 언어
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
//		System.out.print("언어 >>> ");
//		language = scan4.next();
//		top++;
//	}
//	
//	static void play() {
//		System.out.println("소개 : " + intro + "\n제작자 : " + producer + "\n가격 : "+price+"\nISBN : "+ISBN+"\n작가 : "+author+"\n제목 : " + title +"\n언어 : "+ language); 
//	}
//
//}
//
//class Book extends Product { // ISBN , 저자 , 책 제목
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
//		System.out.print("제목 >>> ");
//		title = scan3.next();
//		System.out.print("작가 >>> ");
//		author = scan3.next();
//
//		top++;
//	}
//	
//	
//	static void play() {
//		System.out.println("소개 : " + intro + "\n제작자 : " + producer + "\n가격 : "+price+"\nISBN : "+ISBN+"\n작가 : "+author+"\n제목 : " + title);
//	}
//
//}
//
//class Product { // 각 상품의 고유 식별자, 상품설명, 생산자, 가격
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
//		System.out.print("상품 설명 >>> ");
//		intro = scan2.next();
//		System.out.print("생산자 >>> ");
//		producer = scan2.next();
//		System.out.print("가격 >>> ");
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
//		System.out.println("상품 종류");
//		System.out.print("책<1>, 음악CD<2>, 회화책<3> >>> ");
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
//			System.out.println("잘못 입력하셨습니다.");
//			return;
//		}
//	}
//
//	static void mainMenu() {
//		while (true) {
//			System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >>> ");
//			int num1 = scan.nextInt();
//			switch (num1) {
//			case 1:
//				input();
//				break;
//			case 2:
//				output();
//				break;
//			case 3:
//				System.out.print("프로그램을 종료합니다.");
//				System.exit(0);
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		mainMenu();
//	}
//}
