package Homework;

import java.util.Scanner;

// 전화번호부 입출력 프로그램
class End {

}

class Delete {

}

class Modify {

}

class Search {

}

class Output {
	final int MAX = 100;
	int top = 0;
	String[][] inputData;
	
	public Output() {
		
	}
	
	public Output(String inputData) {
		this.inputData[top][3] = inputData;
		
		top++;
	}
	
	public void outputData() {
		
		System.out.println("--------------------------------");
		System.out.println("출력 기능을 선택하셨습니다.");
		System.out.println("이름\t 전화번호\t 지역");
		System.out.println("==================================");
		for (int i=0; i<top; i++) {
			System.out.print(inputData[top][0] + "\t" + inputData[top][1] + "\t" + inputData[top][2]);
			
		}
		
	}

}

class Input {
	final int MAX = 100;
	int top = 0;
	
	String[][] inputData = new String[MAX][3];
	
	Scanner scan = new Scanner(System.in);

	public Input() {


	}
	
	public void inputData() {
		
		System.out.println("--------------------------------");
		System.out.println("입력기능을 선택하셨습니다.");
		System.out.print("이름을 입력해주세요 : ");
		inputData[top][0] = scan.next();
		System.out.print("전화번호를 입력해주세요 : ");
		inputData[top][1] = scan.next();
		System.out.print("지역을 입력해주세요 : ");
		inputData[top][2] = scan.next();
		

		top++;
	}

}

class Menu {
	int inputNum1;

	public Menu() {
		
	}

	public Menu(int inputNum1) {
		
		this.inputNum1 = inputNum1;
		
		Input i = new Input();
		Output o = new Output();
		
			switch (inputNum1) {
			case 1:
				i.inputData();
				break;
			case 2:
				o.outputData();
				break;
//		case 3:
//			Search();
//			break;
//		case 4:
//			Modify();
//			break;
//		case 5:
//			Delete();
//			break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요 : ");
				
		}
	}

}

public class Homework {

	public static void main(String[] args) {

		while(true) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("==== 전화번호부 ==== \n");
			System.out.println("1.새로운 항목 추가\t 2.전화번호부 전체 보기");
			System.out.println("3.검색하기\t 4.수정하기");
			System.out.println("5.삭제하기\t 6.종료");
			System.out.println("원하시는 기능을 선택해주세요 : ");
			int inputNum1 = scan.nextInt();
			
			Menu m1 = new Menu(inputNum1);
		}

	}

}
