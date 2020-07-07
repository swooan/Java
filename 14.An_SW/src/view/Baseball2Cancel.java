package view;

import static Util.Util.scan;

import java.util.ArrayList;

import model.Baseball2Dto;

public class Baseball2Cancel extends Baseball2View {

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

	@Override
	public void show() {
		
		Baseball2Timetable.days();

		int dateNo = (int) request.get("dateNo");

		if (dateNo == 1) {
			Baseball2SeatType.timeTi();
			int type1 = (int) request.get("type1");
			if (type1 == 1) {
				seatsReset();
				ArrayList<Baseball2Dto> b11 = (ArrayList<Baseball2Dto>) request.get("listc11");

				seat11[0][0] = "행＼열";
				seat11[1][0] = "1행";
				seat11[2][0] = "2행";
				seat11[3][0] = "3행";
				seat11[0][1] = "1열";
				seat11[0][2] = "2열";
				seat11[0][3] = "3열";
				for (Baseball2Dto bDto : b11) {
					for (int k = 0; k < b11.size(); k++) {
						int a = b11.get(k).getArr();
						int b = b11.get(k).getCol();
						seat11[a][b] = b11.get(k).getName();
					}

				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat11[i][j] == null ? "---\t" : seat11[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b11) {
					for (int q = 0; q < b11.size(); q++) {
						if (b11.get(q).getName().equals(delName)) {
							int a = b11.get(q).getArr();
							int b = b11.get(q).getCol();
							request.put("dtoc11", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type1 == 2) {
				seatsReset();
				ArrayList<Baseball2Dto> b12 = (ArrayList<Baseball2Dto>) request.get("listc12");
				seat12[0][0] = "행＼열";
				seat12[1][0] = "1행";
				seat12[2][0] = "2행";
				seat12[3][0] = "3행";
				seat12[0][1] = "1열";
				seat12[0][2] = "2열";
				seat12[0][3] = "3열";
				for (Baseball2Dto bDto : b12) {
					for (int k = 0; k < b12.size(); k++) {
						int a = b12.get(k).getArr();
						int b = b12.get(k).getCol();
						seat12[a][b] = b12.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat12[i][j] == null ? "---\t" : seat12[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b12) {
					for (int q = 0; q < b12.size(); q++) {
						if (b12.get(q).getName().equals(delName)) {
							int a = b12.get(q).getArr();
							int b = b12.get(q).getCol();
							request.put("dtoc12", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type1 == 3) {
				seatsReset();
				ArrayList<Baseball2Dto> b13 = (ArrayList<Baseball2Dto>) request.get("listc13");
				seat13[0][0] = "행＼열";
				seat13[1][0] = "1행";
				seat13[2][0] = "2행";
				seat13[3][0] = "3행";
				seat13[0][1] = "1열";
				seat13[0][2] = "2열";
				seat13[0][3] = "3열";
				for (Baseball2Dto bDto : b13) {
					for (int k = 0; k < b13.size(); k++) {
						int a = b13.get(k).getArr();
						int b = b13.get(k).getCol();
						seat13[a][b] = b13.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat13[i][j] == null ? "---\t" : seat13[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b13) {
					for (int q = 0; q < b13.size(); q++) {
						if (b13.get(q).getName().equals(delName)) {
							int a = b13.get(q).getArr();
							int b = b13.get(q).getCol();
							request.put("dtoc13", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			}

		} else if (dateNo == 2) {
			Baseball2SeatType.timeLo();
			int type2 = (int) request.get("type2");
			if (type2 == 1) {
				seatsReset();
				ArrayList<Baseball2Dto> b21 = (ArrayList<Baseball2Dto>) request.get("listc21");
				seat21[0][0] = "행＼열";
				seat21[1][0] = "1행";
				seat21[2][0] = "2행";
				seat21[3][0] = "3행";
				seat21[0][1] = "1열";
				seat21[0][2] = "2열";
				seat21[0][3] = "3열";
				for (Baseball2Dto bDto : b21) {
					for (int k = 0; k < b21.size(); k++) {
						int a = b21.get(k).getArr();
						int b = b21.get(k).getCol();
						seat21[a][b] = b21.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat21[i][j] == null ? "---\t" : seat21[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b21) {
					for (int q = 0; q < b21.size(); q++) {
						if (b21.get(q).getName().equals(delName)) {
							int a = b21.get(q).getArr();
							int b = b21.get(q).getCol();
							request.put("dtoc21", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type2 == 2) {
				seatsReset();
				ArrayList<Baseball2Dto> b22 = (ArrayList<Baseball2Dto>) request.get("listc22");
				seat22[0][0] = "행＼열";
				seat22[1][0] = "1행";
				seat22[2][0] = "2행";
				seat22[3][0] = "3행";
				seat22[0][1] = "1열";
				seat22[0][2] = "2열";
				seat22[0][3] = "3열";
				for (Baseball2Dto bDto : b22) {
					for (int k = 0; k < b22.size(); k++) {
						int a = b22.get(k).getArr();
						int b = b22.get(k).getCol();
						seat22[a][b] = b22.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat22[i][j] == null ? "---\t" : seat22[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b22) {
					for (int q = 0; q < b22.size(); q++) {
						if (b22.get(q).getName().equals(delName)) {
							int a = b22.get(q).getArr();
							int b = b22.get(q).getCol();
							request.put("dtoc22", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type2 == 3) {
				seatsReset();
				ArrayList<Baseball2Dto> b23 = (ArrayList<Baseball2Dto>) request.get("listc23");
				seat23[0][0] = "행＼열";
				seat23[1][0] = "1행";
				seat23[2][0] = "2행";
				seat23[3][0] = "3행";
				seat23[0][1] = "1열";
				seat23[0][2] = "2열";
				seat23[0][3] = "3열";
				for (Baseball2Dto bDto : b23) {
					for (int k = 0; k < b23.size(); k++) {
						int a = b23.get(k).getArr();
						int b = b23.get(k).getCol();
						seat23[a][b] = b23.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat23[i][j] == null ? "---\t" : seat23[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b23) {
					for (int q = 0; q < b23.size(); q++) {
						if (b23.get(q).getName().equals(delName)) {
							int a = b23.get(q).getArr();
							int b = b23.get(q).getCol();
							request.put("dtoc23", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			}
		} else if (dateNo == 3) {
			Baseball2SeatType.timeTa();
			int type3 = (int) request.get("type3");
			if (type3 == 1) {
				seatsReset();
				ArrayList<Baseball2Dto> b31 = (ArrayList<Baseball2Dto>) request.get("listc31");
				seat31[0][0] = "행＼열";
				seat31[1][0] = "1행";
				seat31[2][0] = "2행";
				seat31[3][0] = "3행";
				seat31[0][1] = "1열";
				seat31[0][2] = "2열";
				seat31[0][3] = "3열";
				for (Baseball2Dto bDto : b31) {
					for (int k = 0; k < b31.size(); k++) {
						int a = b31.get(k).getArr();
						int b = b31.get(k).getCol();
						seat31[a][b] = b31.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat31[i][j] == null ? "---\t" : seat31[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b31) {
					for (int q = 0; q < b31.size(); q++) {
						if (b31.get(q).getName().equals(delName)) {
							int a = b31.get(q).getArr();
							int b = b31.get(q).getCol();
							request.put("dtoc31", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type3 == 2) {
				seatsReset();
				ArrayList<Baseball2Dto> b32 = (ArrayList<Baseball2Dto>) request.get("listc32");
				seat32[0][0] = "행＼열";
				seat32[1][0] = "1행";
				seat32[2][0] = "2행";
				seat32[3][0] = "3행";
				seat32[0][1] = "1열";
				seat32[0][2] = "2열";
				seat32[0][3] = "3열";
				for (Baseball2Dto bDto : b32) {
					for (int k = 0; k < b32.size(); k++) {
						int a = b32.get(k).getArr();
						int b = b32.get(k).getCol();
						seat32[a][b] = b32.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat32[i][j] == null ? "---\t" : seat32[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b32) {
					for (int q = 0; q < b32.size(); q++) {
						if (b32.get(q).getName().equals(delName)) {
							int a = b32.get(q).getArr();
							int b = b32.get(q).getCol();
							request.put("dtoc32", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			} else if (type3 == 3) {
				seatsReset();
				ArrayList<Baseball2Dto> b33 = (ArrayList<Baseball2Dto>) request.get("listc33");
				seat33[0][0] = "행＼열";
				seat33[1][0] = "1행";
				seat33[2][0] = "2행";
				seat33[3][0] = "3행";
				seat33[0][1] = "1열";
				seat33[0][2] = "2열";
				seat33[0][3] = "3열";
				for (Baseball2Dto bDto : b33) {
					for (int k = 0; k < b33.size(); k++) {
						int a = b33.get(k).getArr();
						int b = b33.get(k).getCol();
						seat33[a][b] = b33.get(k).getName();
					}
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(seat33[i][j] == null ? "---\t" : seat33[i][j] + "\t");
					}
					System.out.println();
				}

				System.out.println("예약 취소하실 분의 이름을 입력하세요.");
				System.out.print(">>> ");
				String delName = scan.next();

				boolean flag = false;
				for (Baseball2Dto dDto : b33) {
					for (int q = 0; q < b33.size(); q++) {
						if (b33.get(q).getName().equals(delName)) {
							int a = b33.get(q).getArr();
							int b = b33.get(q).getCol();
							request.put("dtoc33", new Baseball2Dto(delName, a, b));
							System.out.println("예약이 취소 되었습니다.");
							flag = true;
							break;
						}
					}
				}

				if (!flag) {
					System.out.println("잘못 입력하셨습니다.\n");
					display();
				}

			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			display();
		}

	}

}