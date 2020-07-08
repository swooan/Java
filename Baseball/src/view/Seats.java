package view;

import static util.MyUtil.*;

import java.util.ArrayList;

import model.BaseballDto;
import resource.Res;
import appMain.AppMain;


public class Seats extends ViewMain implements Res{
	static String[][] seat11 = new String[4][4];
	static String[][] seat12 = new String[4][4];
	static String[][] seat13 = new String[4][4];
	static String[][] seat21 = new String[4][4];
	static String[][] seat22 = new String[4][4];
	static String[][] seat23 = new String[4][4];
	static String[][] seat31 = new String[4][4];
	static String[][] seat32 = new String[4][4];
	static String[][] seat33 = new String[4][4];
	
	public static void seatsReset() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				seat11[i][j] = null;
				seat12[i][j] = null;
				seat13[i][j] = null;
				seat21[i][j] = null;
				seat22[i][j] = null;
				seat23[i][j] = null;
				seat31[i][j] = null;
				seat32[i][j] = null;
				seat33[i][j] = null;
			}
		}
	}


	
	static void seat11() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi11");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat11[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat11[0][0] = "�࡬��   ";
				seat11[1][0] = "1��      ";
				seat11[2][0] = "2��      ";
				seat11[3][0] = "3��      ";
				seat11[0][1] = "1��       ";
				seat11[0][2] = "2��       ";
				seat11[0][3] = "3��";
				System.out.print(seat11[i][j] == null ? "---   " : seat11[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat11[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat11();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat11[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi11", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat11();
		}

	}

	static void seat12() {
		seatsReset();
		ArrayList<BaseballDto> b12 = (ArrayList<BaseballDto>) request.get("listi12");
		
		for (BaseballDto bDto : b12) {
			for (int k = 0; k < b12.size(); k++) {
				int a = b12.get(k).getArr();
				int b = b12.get(k).getCol();
				seat12[a][b] = b12.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat12[0][0] = "�࡬��   ";
				seat12[1][0] = "1��      ";
				seat12[2][0] = "2��      ";
				seat12[3][0] = "3��      ";
				seat12[0][1] = "1��       ";
				seat12[0][2] = "2��       ";
				seat12[0][3] = "3��";
				System.out.print(seat12[i][j] == null ? "---   " : seat12[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat12[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat12();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat12[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi12", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat12();
		}
	}

	static void seat13() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi13");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat13[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat13[0][0] = "�࡬��   ";
				seat13[1][0] = "1��      ";
				seat13[2][0] = "2��      ";
				seat13[3][0] = "3��      ";
				seat13[0][1] = "1��       ";
				seat13[0][2] = "2��       ";
				seat13[0][3] = "3��";
				System.out.print(seat13[i][j] == null ? "---   " : seat13[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat13[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat13();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat13[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi13", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat13();
		}

	}

	static void seat21() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi21");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat21[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat21[0][0] = "�࡬��   ";
				seat21[1][0] = "1��      ";
				seat21[2][0] = "2��      ";
				seat21[3][0] = "3��      ";
				seat21[0][1] = "1��       ";
				seat21[0][2] = "2��       ";
				seat21[0][3] = "3��";
				System.out.print(seat21[i][j] == null ? "---   " : seat21[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat21[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat21();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat21[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi21", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat21();
		}

	}

	static void seat22() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi22");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat22[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat22[0][0] = "�࡬��   ";
				seat22[1][0] = "1��      ";
				seat22[2][0] = "2��      ";
				seat22[3][0] = "3��      ";
				seat22[0][1] = "1��       ";
				seat22[0][2] = "2��       ";
				seat22[0][3] = "3��";
				System.out.print(seat22[i][j] == null ? "---   " : seat22[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat22[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat22();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat22[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi22", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat22();
		}

	}

	static void seat23() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi23");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat23[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat23[0][0] = "�࡬��   ";
				seat23[1][0] = "1��      ";
				seat23[2][0] = "2��      ";
				seat23[3][0] = "3��      ";
				seat23[0][1] = "1��       ";
				seat23[0][2] = "2��       ";
				seat23[0][3] = "3��";
				System.out.print(seat23[i][j] == null ? "---   " : seat23[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat23[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat23();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat23[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
			request.put("dtoi23", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat23();
		}

	}

	static void seat31() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi31");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat31[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat31[0][0] = "�࡬��   ";
				seat31[1][0] = "1��      ";
				seat31[2][0] = "2��      ";
				seat31[3][0] = "3��      ";
				seat31[0][1] = "1��       ";
				seat31[0][2] = "2��       ";
				seat31[0][3] = "3��";
				System.out.print(seat31[i][j] == null ? "---   " : seat31[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat31[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat31();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat31[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi31", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat31();
		}

	}

	static void seat32() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi32");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat32[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat32[0][0] = "�࡬��   ";
				seat32[1][0] = "1��      ";
				seat32[2][0] = "2��      ";
				seat32[3][0] = "3��      ";
				seat32[0][1] = "1��       ";
				seat32[0][2] = "2��       ";
				seat32[0][3] = "3��";
				System.out.print(seat32[i][j] == null ? "---   " : seat32[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat32[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat32();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat32[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi32", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat32();
		}

	}

	static void seat33() {
		seatsReset();
		ArrayList<BaseballDto> b11 = (ArrayList<BaseballDto>) request.get("listi33");
		
		for (BaseballDto bDto : b11) {
			for (int k = 0; k < b11.size(); k++) {
				int a = b11.get(k).getArr();
				int b = b11.get(k).getCol();
				seat33[a][b] = b11.get(k).getName();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				seat33[0][0] = "�࡬��   ";
				seat33[1][0] = "1��      ";
				seat33[2][0] = "2��      ";
				seat33[3][0] = "3��      ";
				seat33[0][1] = "1��       ";
				seat33[0][2] = "2��       ";
				seat33[0][3] = "3��";
				System.out.print(seat33[i][j] == null ? "---   " : seat33[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================================");
		System.out.println("\n���Ͻô� �¼��� ��� ���� �Է����ּ���.");
		
		int arr = 0;
		do {
			System.out.print("�� : ");
			arr = scan.nextInt();
		} while (arr < 1 || arr > 3);
		
		int col = 0;
		do {
			System.out.print("�� : ");
			col = scan.nextInt();
		} while (col < 1 || col > 3);
		
		if(seat33[arr][col] != null) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			seat33();
		}
		
		int tf = 0;
		do {
			System.out.print(arr + "�� " + col + "�� �¼��� �½��ϱ�? \n ��<1> �ƴϿ�<2> \n >>> ");
			tf = scan.nextInt();
		} while (tf < 1 || tf > 2);
		
		if (tf == 1) {
			System.out.print("������ �Է����ּ���. \n >>> ");
			String name = scan.next();
			seat33[arr][col] = name;
			System.out.println("--------------------------");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			request.put("dtoi33", new BaseballDto(name, arr, col));
		} else if (tf == 2) {
			seat33();
		}

	}

	@Override
	protected void display() {
		
		
	}

}
