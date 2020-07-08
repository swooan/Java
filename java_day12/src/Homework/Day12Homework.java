package Homework;

import java.util.Scanner;

class Info {
	
	private String name;
	private String phone;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}

public class Day12Homework {
	static final int MAX = 100;
	static int top = 0;

	static String[][] inputInfo = new String[MAX][3];

	static Scanner scan = new Scanner(System.in);

	static void delete() {
		System.out.println("--------------------------------");
		System.out.println("삭제 기능을 선택하셨습니다.");
		if (top == 0) {
			System.out.println("삭제할 내용이 없습니다.");
			return;
		}
		System.out.print("삭제할 이름 입력 : ");
		String inputName3 = scan.next();

		for (int i = 0; i < top; i++) {
			if (inputName3.equals(inputInfo[i][0])) {
				inputInfo[i][0] = inputInfo[i + 1][0];
				inputInfo[i][1] = inputInfo[i + 1][1];
				inputInfo[i][2] = inputInfo[i + 1][2];

				top--;
			}
		}
	}

	static void modify() {

		System.out.println("--------------------------------");
		System.out.println("수정 기능을 선택하셨습니다.");
		System.out.println();
		System.out.println("수정할 이름을 입력하세요.");
		System.out.print("이름 : ");
		String inputName2 = scan.next();

		for (int i = 0; i < top; i++) {
			if (inputName2.equals(inputInfo[i][0])) {
				System.out.println("바꿀 항목을 선택해주세요");
				System.out.println("1. 이름 변경");
				System.out.println("2. 번호 변경");
				System.out.println("3. 도시 변경");
				System.out.print("번호 : ");
				int inputNum3 = scan.nextInt();

				switch (inputNum3) {

				case 1:
					System.out.println("바꿀 이름을 입력해주세요");
					System.out.println("새 이름 : ");
					inputInfo[i][0] = scan.next();

					break;

				case 2:
					System.out.println("바꿀 번호를 입력해주세요");
					System.out.println("새 번호 : ");
					inputInfo[i][1] = scan.next();

					break;

				case 3:
					System.out.println("바꿀 도시 입력해주세요");
					System.out.println("새 도시 : ");
					inputInfo[i][2] = scan.next();

					break;

				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}

		}

	}

	static void search() {

		System.out.println("--------------------------------");
		System.out.println("검색 기능을 선택하셨습니다.");
		System.out.println();
		System.out.println("검색할 방식을 선택하세요.");
		System.out.println("1. 이름으로 검색");
		System.out.println("2. 번호로 검색");
		System.out.println("3. 도시로 검색");
		System.out.print("번호 : ");
		int inputNum2 = scan.nextInt();

		switch (inputNum2) {

		case 1:

			System.out.println("이름으로 검색을 선택하셨습니다.");
			System.out.println("검색하실 이름을 입력해주세요.");
			System.out.print("이름 : ");
			String inputName = scan.next();

			if (top == 0) {
				System.out.println("저장된 데이터 내용이 없습니다.");
				return;
			}

			System.out.println("이름\t 전화번호\t 지역");
			System.out.println("==================================");
			boolean flag = false;
			for (int i = 0; i < top; i++) {
				if (inputName.equals(inputInfo[i][0])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("검색하신 내용을 찾지 못하였습니다.");
			}
			break;
		case 2:

			System.out.println("번호로 검색을 선택하셨습니다.");
			System.out.println("검색하실 번호를 입력해주세요.");
			System.out.print("번호 : ");
			String inputPhone = scan.next();

			if (top == 0) {
				System.out.println("저장된 데이터 내용이 없습니다.");
				return;
			}

			System.out.println("이름\t 전화번호\t 지역");
			System.out.println("==================================");
			boolean flag1 = false;
			for (int i = 0; i < top; i++) {
				if (inputPhone.equals(inputInfo[i][1])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag1 = true;
				}
			}
			if (!flag1) {
				System.out.println("검색하신 내용을 찾지 못하였습니다.");
			}
			break;

		case 3:

			System.out.println("도시로 검색을 선택하셨습니다.");
			System.out.println("검색하실 도시를 입력해주세요.");
			System.out.print("도시 : ");
			String inputCity = scan.next();

			if (top == 0) {
				System.out.println("저장된 데이터 내용이 없습니다.");
				return;
			}

			System.out.println("이름\t 전화번호\t 지역");
			System.out.println("==================================");
			boolean flag2 = false;
			for (int i = 0; i < top; i++) {
				if (inputCity.equals(inputInfo[i][2])) {
					System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
					System.out.println();
					flag2 = true;
				}
			}
			if (!flag2) {
				System.out.println("검색하신 내용을 찾지 못하였습니다.");
			}
			break;

		default:
			System.out.println("번호를 다시 입력해주세요");

		}

	}

	static void output() {

		System.out.println("--------------------------------");
		System.out.println("출력 기능을 선택하셨습니다.");
		System.out.println("이름\t 전화번호\t 지역");
		System.out.println("==================================");
		for (int i = 0; i < top; i++) {
			System.out.print(inputInfo[i][0] + "\t" + inputInfo[i][1] + "\t" + inputInfo[i][2]);
			System.out.println();
		}
		System.out.println();

	}

	static void input() {

		System.out.println("--------------------------------");
		System.out.println("입력기능을 선택하셨습니다.");
		System.out.print("이름을 입력해주세요 : ");
		inputInfo[top][0] = scan.next();
		System.out.print("전화번호를 입력해주세요 : ");
		inputInfo[top][1] = scan.next();
		System.out.print("지역을 입력해주세요 : ");
		inputInfo[top][2] = scan.next();

		top++;

		System.out.println();
	}

	public static void main(String[] args) {

		while (true) {

			Scanner scan = new Scanner(System.in);

			System.out.println("==== 전화번호부 ==== \n");
			System.out.println("1.새로운 항목 추가\t 2.전화번호부 전체 보기");
			System.out.println("3.검색하기\t 4.수정하기");
			System.out.println("5.삭제하기\t 6.종료");
			System.out.println("원하시는 기능을 선택해주세요 : ");
			int inputNum1 = scan.nextInt();

			switch (inputNum1) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 6:
				System.out.println();
				System.out.println("--------------------------");
				System.out.println("전화번호부를 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요 : ");

			}
			System.out.println();
		}

	}

}