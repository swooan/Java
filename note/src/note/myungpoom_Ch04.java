package note;

import java.util.Scanner;

// 1. 객체와 클래스의 차이점 
//		- 클래스가 더 포괄적 (객체가 모여서 클래스가 됨)
//		- 객체에는 행동(함수) 들이 들어간다.
//
// 2. 코드의 재사용을 가능하게 하는 객체지향 특성
//		- 다형성
//
// 3. String 타입의 manufacturer, name, country, region, kind 와
//    int 타입의 year, grade 필드를 갖은 wine 클래스를 선언하라. 모든 필드는 private로 한다.

class Wine {

	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	public Wine() {

	}

	public Wine(String manufacturer, String name) {

	}

}

// 4. 3번의 wine 클래스에서 모든 데이터 멤버를 초기화 하는 생성자와 manufacturer,name
//    의 데이터 멤버를 초기화 하는 생성자를 추가하라	

// 5. 다음 클래스를 보고 어떤 객체 지향 특성이 적용 되었는지 설명하라
//      - 캡슐화와 정보보호

// 6. 다음 소스에서 잘못된 부분을 지적하고 올바르게 고쳐라
// 		- MyClass a;
// 		- a = new MyClass();

// 7. 다음 소스에서 잘못된 부분을 지적하고 오류를 수정할 수 있는 방법을 모두 제출하라.
//	  또한 어떤 방법이 객체 지향 프로그래밍에 가장 적합한지 설명하라.
//		- private를 삭제
// 		- getter, setter 를 만든다.

// 8. 다음 프로그램의 실행 결과는?
//		- 15

// 9. 다음 소스코드에서 오류를 수정하고 이유를 설명하라
//		- 두개의 매소드의 이름과 매개변수의 수가 같다. => 오버로드가 안된다.

// 10. 다음 소스에서 오류를 지적하고 올바르게 수정하라.
//		- 레퍼런스만 10개 생겼고 초기화는 진행되지 않았다. 고로 new를 하나 더 써줘야한다.

// 11. 다음 소스는 오류를 발생시키지 않으나 모호성을 포함하고 있다. 
//	       이를 찾아내어 올바르게 수정하라.
// 		- public void setNum(int num) {
//			this.num = num }

// 12. 다음 소스의 오류를 찾아내고 오류가 발생하는 이유를 설명하라.
// 		- 다른 생성자를 호출하기 전에는 다른 문장이 있어서는 안된다.
// 		- this(0,null);
//		  system.out.println("생성자가 호출되었음");

// 13. 다음 소스에서 가비지가 발생하는 부분은?
// 		- MyClass a = new MyClass();

// 14. 	4가지 접근 지정자로 선언되었을 때 같은 패키지의 클래스와 다른 패키지의 클래스에서 접근 여부
// 		- 디폴트 : 같은 패키지 O / 다른 패키지 X
// 		- 프로텍티드 : 같은패키지 O / 다른패키지 O
// 		- 프라이빗 : 같은 패키지 X / 다른 패키지 X

// 15. 다음 소스에서 오류를 찾아내고 이유를 설명하라
// 		- static 필드 내에서는 this.를 사용할 수 없다.

// 16. 가비지 컬렉션이 필요한 이유
// 		- 가비지로 인해 메모리 용량이 줄어들기 때문에 가비지 컬렉션이 가용 메모리를 늘려준다.

// 17. 가비지가 발생하면 몇라인인가?
// 		- 가비지가 발생하지 않는다.

// 18. 가비지가 발생하지 않는다.

// 실습 1번	
//
//class Song {
//	String title;
//	String artist;
//	String album;
//	String composer;
//	int year;
//	int track;
//	
//	public Song() {
//		
//	}
//	
//	public void show() {
//		System.out.println("Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
//				+ year + ", track=" + track + "]");
//	}
//
//}
//
//public class myungpoom_Ch04 {
//	public static void main(String[] args) {
//		Song uta = new Song();
//		uta.title = "Dancing Queen";
//		uta.artist = "ABBA";
//		
//		uta.show();
//		
//	}
//}

// 실습 2번

//class Rectangle {
//	int x1;
//	int x2;
//	int y1;
//	int y2;
//	int length;
//	int height;
//	int square;
//	
//	public Rectangle() {
//		
//	}
//	public Rectangle(int x1, int y1, int x2, int y2) {
//		this.set(x1,y1,x2,y2);
//		
//	}
//	
//	public void set(int x1, int y1, int x2, int y2) {
//		
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//		
//		length = Math.abs(x2-x1);
//		height = Math.abs(y2-y1);
//		square = length * height;
//		
//	}
//	
//	public int square() {
//				
//		return square;
//		
//	}
//	public void show() {
//		System.out.println("사각형의 좌표는" + "(" + x1 + "," + y1+ "), " 
//				+ "(" + x1 + "," + y2 + "), (" + x2 + "," + y1 + "), (" + x2 + "," + y2 + ") 입니다.");
//		System.out.println("사각형의 가로는 " + length + "세로는 " + height + "입니다");
//	}
//	
//	boolean equals(Rectangle r) {
//		if(this.length == r.length && this.height == r.height)
//			return true;
//		else
//			return false;
//	}
//}
////
////	
////	
//public class myungpoom_Ch04 {
//	public static void main(String args[]) {
//		
//		Rectangle r= new Rectangle();
//		Rectangle s = new Rectangle(1,1,2,3);
//		
//		r.show();
//		s.show();
//		System.out.println(s.square());
//		r.set(-2,2,-1,4);
//		r.show();
//		System.out.println(r.square());
//		if(r.equals(s)) {
//			System.out.println("두 사각형은 같습니다.");
//		}
//		
//	}
//}

// 실습 3번

//class ArrayUtillity {
//
//	static double[] intToDouble(int[] source1) {
//		double[]arr = new double[source1.length];
//		for(int i = 0; i < source1.length; i++) {
//			 arr[i] = (double) arr[i];
//		}
//		
//		return arr;
//	}
//	
//	static int[] doubleToInt(double[] source2) {
//		int[] arr = new int[source2.length];
//		for(int i=0; i < source2.length; i++) {
//			arr[i] = (int)arr[i];
//		}
//		return arr;
//	}
//	
//}

// 실습 4번

//class ArrayUtillity2 {
//	
//	static int[] concat(int[] s1, int[] s2) {
//		
//		int[] arr1 = new int[s1.length];
//		int[] arr2 = new int[s2.length];
//		
//		int[] arr = new int[s1.length + s2.length];
//		
//		for(int i = 0; i < s1.length; i++) {
//			arr[i] = arr1[i];
//		}
//		for(int i = s1.length; i<s1.length+s2.length; i++) {
//			arr[i] = arr2[i-s1.length];
//		}
//		
//		return arr;
//	}
//	
//	static int[] remove(int[] s1, int[] s2) {
//		
//		int[] arr1 = new int[s1.length];
//		int[] arr2 = new int[s2.length];
//		
//		int[] arr = new int[s1.length - s2.length];
//		
//		for(int i = 0; i<s1.length; i++) {
//			for(int j=0; j<s2.length; j++) {
//				
//				if(arr1[i] == arr2[j]) {
//					
//					arr1[i] = arr1[i+1];
//					
//					i--;
//				}
//				
//			}
//		}
//		
//		return arr;
//	}
//	
//}

// 실습 5번

//class Add {
//	int a;
//	int b;
//	public Add(int input1, int input2) {
//		this.setValue(input1, input2);
//	}
//
//	void setValue(int a,int b) {
//		this.a = a;
//		this.b = b;
//	}
//	
//	int calculate() {
//		
//		return a+b;
//	}
//	
//	
//}
//
//class Sub {
//	int a;
//	int b;
//	public Sub(int input1, int input2) {
//		this.setValue(input1, input2);
//	}
//
//	void setValue(int a,int b) {
//		this.a = a;
//		this.b = b;
//	}
//	
//	int calculate() {
//		 
//		return a-b;		
//	}
//	
//}
//
//class Mul {
//	int a;
//	int b;
//	public Mul(int input1, int input2) {
//		this.setValue(input1, input2);
//	}
//
//	void setValue(int a,int b) {
//		this.a = a;
//		this.b = b;
//	}
//	
//	int calculate() {
//		
//		return a*b;
//	}
//	
//}
//
//class Div {
//	int a;
//	int b;
//	public Div(int input1, int input2) {
//		this.setValue(input1, input2);
//	}
//	void setValue(int a,int b) {
//		this.a = a;
//		this.b = b;
//	}
//	
//	int calculate() {
//		 
//		return a/b;
//	}
//	
//}
//
//public class myungpoom_Ch04 {
//	
//	public static Scanner scan = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		System.out.print("두 정수와 연산자를 입력하세요 : ");
//		int input1 = scan.nextInt();
//		int input2 = scan.nextInt();
//		char input3 = scan.next().charAt(0);
//		
//		if(input3 == '+') {
//			Add a1 = new Add(input1, input2);
//			System.out.println(a1.calculate());
//		}
//		else if(input3 == '-') {
//			Sub a2 = new Sub(input1, input2);
//			System.out.println(a2.calculate());
//		}
//		else if(input3 == '*') {
//			Mul a3 = new Mul(input1, input2);
//			System.out.println(a3.calculate());
//		}
//		else if(input3 == '/') {
//			Div a4 = new Div(input1, input2);
//			System.out.println(a4.calculate());
//		}
//	}
//	
//	
//}

//실습 6번

//public class myungpoom_Ch04 {
//	static final int MAX = 10;
//
//	static String[][] inputInfo = new String[3][10];
//
//	static Scanner scan = new Scanner(System.in);
//
//	static void delete() {
//		System.out.println("좌석 구분 S<1>, A<2>, B<3> >> ");
//		int inputNum3 = scan.nextInt();
//		switch (inputNum3) {
//
//		case 1:
//			System.out.print("취소할 이름 입력 : ");
//			String inputName0 = scan.next();
//
//			for (int i = 0; i < 10; i++) {
//				if (inputName0.equals(inputInfo[0][i])) {
//					inputInfo[0][i] = null;
//				}
//			}
//			break;
//
//		case 2:
//
//			System.out.print("취소할 이름 입력 : ");
//			String inputName1 = scan.next();
//
//			for (int i = 0; i < 10; i++) {
//				if (inputName1.equals(inputInfo[1][i])) {
//					inputInfo[1][i] = null;
//				}
//			}
//			break;
//
//		case 3:
//
//			System.out.print("취소할 이름 입력 : ");
//			String inputName2 = scan.next();
//
//			for (int i = 0; i < 10; i++) {
//				if (inputName2.equals(inputInfo[2][i])) {
//					inputInfo[2][i] = null;
//				}
//			}
//			break;
//
//		default:
//			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
//			return;
//
//		}
//
//	}
//
//	static void output() {
//
//		System.out.print("S >> ");
//		for (int i = 0; i < 10; i++) {
//			System.out.print(inputInfo[0][i] == null ? "--- " : inputInfo[0][i] + " ");
//		}
//		System.out.println();
//		System.out.print("A >> ");
//		for (int i = 0; i < 10; i++) {
//			System.out.print(inputInfo[1][i] == null ? "--- " : inputInfo[1][i] + " ");
//		}
//		System.out.println();
//		System.out.print("B >> ");
//		for (int i = 0; i < 10; i++) {
//			System.out.print(inputInfo[2][i] == null ? "--- " : inputInfo[2][i] + " ");
//		}
//		System.out.println();
//
//	}
//
//	static void input() {
//
//		System.out.println("--------------------------------");
//		System.out.print("좌석 구분 : S<1>, A<2>, B<3> >> ");
//		int inputNum2 = scan.nextInt();
//		switch (inputNum2) {
//
//		case 1:
//			System.out.print("S >> ");
//			for (int i = 0; i < 10; i++) {
//				System.out.print(inputInfo[0][i] == null ? "--- " : inputInfo[0][i] + " ");
//			}
//			System.out.println();
//			System.out.print("번호 >> ");
//			int num = scan.nextInt();
//			System.out.print("이름 >> ");
//			inputInfo[0][num - 1] = scan.next();
//			break;
//
//		case 2:
//
//			System.out.print("A >> ");
//			for (int i = 0; i < 10; i++) {
//				System.out.print(inputInfo[1][i] == null ? "--- " : inputInfo[1][i] + " ");
//			}
//			System.out.println();
//			System.out.print("번호 >> ");
//			int num1 = scan.nextInt();
//			System.out.print("이름 >> ");
//			inputInfo[1][num1 - 1] = scan.next();
//			break;
//
//		case 3:
//
//			System.out.print("B >> ");
//			for (int i = 0; i < 10; i++) {
//				System.out.print(inputInfo[2][i] == null ? "--- " : inputInfo[2][i] + " ");
//			}
//			System.out.println();
//			System.out.print("번호 >> ");
//			int num2 = scan.nextInt();
//			System.out.print("이름 >> ");
//			inputInfo[2][num2 - 1] = scan.next();
//			break;
//
//		default:
//			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
//			return;
//
//		}
//
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//
//		while (true) {
//
//			Scanner scan = new Scanner(System.in);
//			System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> >> ");
//			int inputNum1 = scan.nextInt();
//
//			switch (inputNum1) {
//			case 1:
//				input();
//				break;
//			case 2:
//				output();
//				break;
//
//			case 3:
//				delete();
//				break;
//			case 4:
//				System.out.println();
//				System.out.println("--------------------------");
//				System.out.println("종료합니다.");
//				System.exit(0);
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다. 다시입력해주세요 : ");
//
//			}
//			System.out.println();
//		}
//
//	}
//
//}

//예제

class sayWord {
	
	int num;
	static String[] player;
	String word = "아버지";
	int lastIndex = word.length()-1;
	char lastChar = word.charAt(lastIndex);
	char firstChar = word.charAt(0);
	myungpoom_Ch04 a1 = new myungpoom_Ch04();
	static Scanner scan = new Scanner(System.in);
	
	public sayWord() {
		
		this(0,null);
		
	}
	
	public sayWord(int num, String[] player) {
		
		for(int i = 0; i < num; i++) {
			
			this.player[i] = player[i];
		}
		
		
		System.out.println("시작하는 단어는 아버지 입니다.");
		boolean flag = true;
			
		while(true) {
			for(int i = 0; i < num; i++) {
				System.out.println(player[i] + " >>> ");
				word = scan.next();
				
				if(lastChar != firstChar) {
					flag = false;
				}
				if(flag = false) {
					System.out.println("틀렸습니다. 당신의 패배입니다.");
					break;
			}
			
			}
		}
		
	}
	
}

public class myungpoom_Ch04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
		int num = scan.nextInt();
		
		String[] player = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("참가자의 이름을 입력하세요 : ");
			player[i] = scan.next();
		}
		sayWord a1 = new sayWord();
		
		a1.num = num;
		a1.player = player;
		
		
	}
	
}