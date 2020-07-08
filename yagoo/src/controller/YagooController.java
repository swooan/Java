package controller;

import static util.MyUtil.scan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Resource.R;
import model.Dto;
import view.Menu;
import view.*;

public class YagooController implements R {

	public void make() {
		int[] question = new int[4];
		Random rand = new Random();

		for (int i = 0; i < question.length; i++) {
			question[i] = rand.nextInt(9);
		}
		for (int i = 0; i < question.length; i++) {
			for (int j = 0; j < question.length; j++) {
				if (question[i] == question[j] && i != j) {
					do {
						question[j] = rand.nextInt(9);
					} while (question[i] == question[j]);
				}
			}
		}
		request.put("q1", question[0]);
		request.put("q2", question[1]);
		request.put("q3", question[2]);
		request.put("q4", question[3]);
	}

	public static void compare() {
		int s = 0;
		int b = 0;
		
		Dto dto = (Dto) request.get("num");
		if (dto.getNum1() == (int) request.get("q1")) {
			s++;
		} else if (dto.getNum1() == (int) request.get("q2") || dto.getNum1() == (int) request.get("q3")
				|| dto.getNum1() == (int) request.get("q4")) {
			b++;
		}
		if (dto.getNum2() == (int) request.get("q2")) {
			s++;
		} else if (dto.getNum2() == (int) request.get("q1") || dto.getNum2() == (int) request.get("q3")
				|| dto.getNum2() == (int) request.get("q4")) {
			b++;
		}
		if (dto.getNum3() == (int) request.get("q3")) {
			s++;
		} else if (dto.getNum3() == (int) request.get("q1") || dto.getNum3() == (int) request.get("q2")
				|| dto.getNum3() == (int) request.get("q4")) {
			b++;
		}
		if (dto.getNum4() == (int) request.get("q4")) {
			s++;
		} else if (dto.getNum4() == (int) request.get("q1") || dto.getNum4() == (int) request.get("q2")
				|| dto.getNum4() == (int) request.get("q3")) {
			b++;
		}
		if ((s > 0 && s < 4) || b != 0) {
			System.out.println(s + " Strike " + b + " ball");
		}
		else if (s == 0 && b == 0) {
			System.out.println("Out!");
		}
		else if (s ==4) {
			System.out.println("::::: 정답입니다 :::::");
			System.out.println("::::: You Win :::::");
			
			System.out.println("다시 도전하시겠습니까?");
			System.out.println("예<1> 아니오(종료)<2>");
			System.out.print(">>> ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				YagooController control = new YagooController();
				control.service();
			}
			else if(choice == 2) {
				System.out.println("수고하셨습니다.");
				System.exit(0);
			}
			
		}

		Dto dtosb = new Dto(s, b);

		request.put("sb", dtosb);
		
		s = 0;
		b = 0;
		
	}

	public void service() {
		int n = 8;
		views[5].show();
		
		make();
		
		while (true) {
			views[0].show();
			int no = (int) request.get("no");
			switch (no) {
			case 1:
				views[1].show();
				Dto num = (Dto) request.get("num");
				dao.insertNums(num);
				Dto sb = (Dto) request.get("sb");
				dao.insertSb(sb);
				break;

			case 2:
				ArrayList<Dto> nums = dao.selectNum();
				request.put("nums", nums);
				ArrayList<Dto> sbs = dao.selectSb();
				request.put("sbs", sbs);
				views[2].show();
				break;
			case 3:
				views[3].show();
				break;
			case 4:
				views[4].show();
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
