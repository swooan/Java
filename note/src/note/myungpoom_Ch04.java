package note;

import java.util.Scanner;

// 1. ��ü�� Ŭ������ ������ 
//		- Ŭ������ �� ������ (��ü�� �𿩼� Ŭ������ ��)
//		- ��ü���� �ൿ(�Լ�) ���� ����.
//
// 2. �ڵ��� ������ �����ϰ� �ϴ� ��ü���� Ư��
//		- ������
//
// 3. String Ÿ���� manufacturer, name, country, region, kind ��
//    int Ÿ���� year, grade �ʵ带 ���� wine Ŭ������ �����϶�. ��� �ʵ�� private�� �Ѵ�.

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

// 4. 3���� wine Ŭ�������� ��� ������ ����� �ʱ�ȭ �ϴ� �����ڿ� manufacturer,name
//    �� ������ ����� �ʱ�ȭ �ϴ� �����ڸ� �߰��϶�	

// 5. ���� Ŭ������ ���� � ��ü ���� Ư���� ���� �Ǿ����� �����϶�
//      - ĸ��ȭ�� ������ȣ

// 6. ���� �ҽ����� �߸��� �κ��� �����ϰ� �ùٸ��� ���Ķ�
// 		- MyClass a;
// 		- a = new MyClass();

// 7. ���� �ҽ����� �߸��� �κ��� �����ϰ� ������ ������ �� �ִ� ����� ��� �����϶�.
//	  ���� � ����� ��ü ���� ���α׷��ֿ� ���� �������� �����϶�.
//		- private�� ����
// 		- getter, setter �� �����.

// 8. ���� ���α׷��� ���� �����?
//		- 15

// 9. ���� �ҽ��ڵ忡�� ������ �����ϰ� ������ �����϶�
//		- �ΰ��� �żҵ��� �̸��� �Ű������� ���� ����. => �����ε尡 �ȵȴ�.

// 10. ���� �ҽ����� ������ �����ϰ� �ùٸ��� �����϶�.
//		- ���۷����� 10�� ����� �ʱ�ȭ�� ������� �ʾҴ�. ��� new�� �ϳ� �� ������Ѵ�.

// 11. ���� �ҽ��� ������ �߻���Ű�� ������ ��ȣ���� �����ϰ� �ִ�. 
//	       �̸� ã�Ƴ��� �ùٸ��� �����϶�.
// 		- public void setNum(int num) {
//			this.num = num }

// 12. ���� �ҽ��� ������ ã�Ƴ��� ������ �߻��ϴ� ������ �����϶�.
// 		- �ٸ� �����ڸ� ȣ���ϱ� ������ �ٸ� ������ �־�� �ȵȴ�.
// 		- this(0,null);
//		  system.out.println("�����ڰ� ȣ��Ǿ���");

// 13. ���� �ҽ����� �������� �߻��ϴ� �κ���?
// 		- MyClass a = new MyClass();

// 14. 	4���� ���� �����ڷ� ����Ǿ��� �� ���� ��Ű���� Ŭ������ �ٸ� ��Ű���� Ŭ�������� ���� ����
// 		- ����Ʈ : ���� ��Ű�� O / �ٸ� ��Ű�� X
// 		- ������Ƽ�� : ������Ű�� O / �ٸ���Ű�� O
// 		- �����̺� : ���� ��Ű�� X / �ٸ� ��Ű�� X

// 15. ���� �ҽ����� ������ ã�Ƴ��� ������ �����϶�
// 		- static �ʵ� �������� this.�� ����� �� ����.

// 16. ������ �÷����� �ʿ��� ����
// 		- �������� ���� �޸� �뷮�� �پ��� ������ ������ �÷����� ���� �޸𸮸� �÷��ش�.

// 17. �������� �߻��ϸ� ������ΰ�?
// 		- �������� �߻����� �ʴ´�.

// 18. �������� �߻����� �ʴ´�.

// �ǽ� 1��	
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

// �ǽ� 2��

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
//		System.out.println("�簢���� ��ǥ��" + "(" + x1 + "," + y1+ "), " 
//				+ "(" + x1 + "," + y2 + "), (" + x2 + "," + y1 + "), (" + x2 + "," + y2 + ") �Դϴ�.");
//		System.out.println("�簢���� ���δ� " + length + "���δ� " + height + "�Դϴ�");
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
//			System.out.println("�� �簢���� �����ϴ�.");
//		}
//		
//	}
//}

// �ǽ� 3��

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

// �ǽ� 4��

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

// �ǽ� 5��

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
//		System.out.print("�� ������ �����ڸ� �Է��ϼ��� : ");
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

//�ǽ� 6��

//public class myungpoom_Ch04 {
//	static final int MAX = 10;
//
//	static String[][] inputInfo = new String[3][10];
//
//	static Scanner scan = new Scanner(System.in);
//
//	static void delete() {
//		System.out.println("�¼� ���� S<1>, A<2>, B<3> >> ");
//		int inputNum3 = scan.nextInt();
//		switch (inputNum3) {
//
//		case 1:
//			System.out.print("����� �̸� �Է� : ");
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
//			System.out.print("����� �̸� �Է� : ");
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
//			System.out.print("����� �̸� �Է� : ");
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
//			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
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
//		System.out.print("�¼� ���� : S<1>, A<2>, B<3> >> ");
//		int inputNum2 = scan.nextInt();
//		switch (inputNum2) {
//
//		case 1:
//			System.out.print("S >> ");
//			for (int i = 0; i < 10; i++) {
//				System.out.print(inputInfo[0][i] == null ? "--- " : inputInfo[0][i] + " ");
//			}
//			System.out.println();
//			System.out.print("��ȣ >> ");
//			int num = scan.nextInt();
//			System.out.print("�̸� >> ");
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
//			System.out.print("��ȣ >> ");
//			int num1 = scan.nextInt();
//			System.out.print("�̸� >> ");
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
//			System.out.print("��ȣ >> ");
//			int num2 = scan.nextInt();
//			System.out.print("�̸� >> ");
//			inputInfo[2][num2 - 1] = scan.next();
//			break;
//
//		default:
//			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
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
//			System.out.print("����<1>, ��ȸ<2>, ���<3>, ������<4> >> ");
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
//				System.out.println("�����մϴ�.");
//				System.exit(0);
//				break;
//			default:
//				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� : ");
//
//			}
//			System.out.println();
//		}
//
//	}
//
//}

//����

class sayWord {
	
	int num;
	static String[] player;
	String word = "�ƹ���";
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
		
		
		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		boolean flag = true;
			
		while(true) {
			for(int i = 0; i < num; i++) {
				System.out.println(player[i] + " >>> ");
				word = scan.next();
				
				if(lastChar != firstChar) {
					flag = false;
				}
				if(flag = false) {
					System.out.println("Ʋ�Ƚ��ϴ�. ����� �й��Դϴ�.");
					break;
			}
			
			}
		}
		
	}
	
}

public class myungpoom_Ch04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�? >> ");
		int num = scan.nextInt();
		
		String[] player = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("�������� �̸��� �Է��ϼ��� : ");
			player[i] = scan.next();
		}
		sayWord a1 = new sayWord();
		
		a1.num = num;
		a1.player = player;
		
		
	}
	
}