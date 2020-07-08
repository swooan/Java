package day14_Homework;

import java.util.Scanner;

class End {

}

class Delete {

}

class Modify {

}

class Search {

}
class Phonebook {

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
