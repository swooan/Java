package controller;

import java.util.ArrayList;

import Resource.Res;
import model.Baseball2Dto;
import view.Baseball2View;

public class Baseball2Controller implements Res {
	
	public void service() {
			
		while (true) {
			views[0].show();
			int no = (int) request.get("no");
			switch (no) {
			case 1:
				ArrayList<Baseball2Dto> listi11 = dao.selectAll11();
				request.put("listi11", listi11);
				ArrayList<Baseball2Dto> listi12 = dao.selectAll12();
				request.put("listi12", listi12);
				ArrayList<Baseball2Dto> listi13 = dao.selectAll13();
				request.put("listi13", listi13);
				ArrayList<Baseball2Dto> listi21 = dao.selectAll21();
				request.put("listi21", listi21);
				ArrayList<Baseball2Dto> listi22 = dao.selectAll22();
				request.put("listi22", listi22);
				ArrayList<Baseball2Dto> listi23 = dao.selectAll23();
				request.put("listi23", listi23);
				ArrayList<Baseball2Dto> listi31 = dao.selectAll31();
				request.put("listi31", listi31);
				ArrayList<Baseball2Dto> listi32 = dao.selectAll32();
				request.put("listi32", listi32);
				ArrayList<Baseball2Dto> listi33 = dao.selectAll33();
				request.put("listi33", listi33);
				
				views[1].show();
				
				if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 1) {
					Baseball2Dto dto11 = (Baseball2Dto)request.get("dtoi11");					
					dao.insert11(dto11);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 2) {
					Baseball2Dto dto12 = (Baseball2Dto)request.get("dtoi12");
					dao.insert12(dto12);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 3) {
					Baseball2Dto dto13 = (Baseball2Dto)request.get("dtoi13");
					dao.insert13(dto13);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 1) {
					Baseball2Dto dto21 = (Baseball2Dto)request.get("dtoi21");
					dao.insert21(dto21);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 2) {
					Baseball2Dto dto22 = (Baseball2Dto)request.get("dtoi22");
					dao.insert22(dto22);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 3) {
					Baseball2Dto dto23 = (Baseball2Dto)request.get("dtoi23");
					dao.insert23(dto23);					
				}
				if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 1) {
					Baseball2Dto dto31 = (Baseball2Dto)request.get("dtoi31");
					dao.insert31(dto31);
					
				}
				if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 2) {
					Baseball2Dto dto32 = (Baseball2Dto)request.get("dtoi32");
					dao.insert32(dto32);
					
				}
				if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 3) {
					Baseball2Dto dto33 = (Baseball2Dto)request.get("dtoi33");
					dao.insert33(dto33);
					
				}
				break;
				
			case 2:
				ArrayList<Baseball2Dto> list11 = dao.selectAll11();
				request.put("listd11", list11);
				ArrayList<Baseball2Dto> list12 = dao.selectAll12();
				request.put("listd12", list12);
				ArrayList<Baseball2Dto> list13 = dao.selectAll13();
				request.put("listd13", list13);
				ArrayList<Baseball2Dto> list21 = dao.selectAll21();
				request.put("listd21", list21);
				ArrayList<Baseball2Dto> list22 = dao.selectAll22();
				request.put("listd22", list22);
				ArrayList<Baseball2Dto> list23 = dao.selectAll23();
				request.put("listd23", list23);
				ArrayList<Baseball2Dto> list31 = dao.selectAll31();
				request.put("listd31", list31);
				ArrayList<Baseball2Dto> list32 = dao.selectAll32();
				request.put("listd32", list32);
				ArrayList<Baseball2Dto> list33 = dao.selectAll33();
				request.put("listd33", list33);
				
				views[2].show();
				break;
				
			case 3:
				ArrayList<Baseball2Dto> lists11 = dao.selectAll11();
				request.put("lists11", lists11);
				ArrayList<Baseball2Dto> lists12 = dao.selectAll12();
				request.put("lists12", lists12);
				ArrayList<Baseball2Dto> lists13 = dao.selectAll13();
				request.put("lists13", lists13);
				ArrayList<Baseball2Dto> lists21 = dao.selectAll21();
				request.put("lists21", lists21);
				ArrayList<Baseball2Dto> lists22 = dao.selectAll22();
				request.put("lists22", lists22);
				ArrayList<Baseball2Dto> lists23 = dao.selectAll23();
				request.put("lists23", lists23);
				ArrayList<Baseball2Dto> lists31 = dao.selectAll31();
				request.put("lists31", lists31);
				ArrayList<Baseball2Dto> lists32 = dao.selectAll32();
				request.put("lists32", lists32);
				ArrayList<Baseball2Dto> lists33 = dao.selectAll33();
				request.put("lists33", lists33);
				
				views[3].show();
				break;
				
			case 4:
				ArrayList<Baseball2Dto> listf11 = dao.selectAll11();
				request.put("listf11", listf11);
				ArrayList<Baseball2Dto> listf12 = dao.selectAll12();
				request.put("listf12", listf12);
				ArrayList<Baseball2Dto> listf13 = dao.selectAll13();
				request.put("listf13", listf13);
				ArrayList<Baseball2Dto> listf21 = dao.selectAll21();
				request.put("listf21", listf21);
				ArrayList<Baseball2Dto> listf22 = dao.selectAll22();
				request.put("listf22", listf22);
				ArrayList<Baseball2Dto> listf23 = dao.selectAll23();
				request.put("listf23", listf23);
				ArrayList<Baseball2Dto> listf31 = dao.selectAll31();
				request.put("listf31", listf31);
				ArrayList<Baseball2Dto> listf32 = dao.selectAll32();
				request.put("listf32", listf32);
				ArrayList<Baseball2Dto> listf33 = dao.selectAll33();
				request.put("listf33", listf33);
				
				views[4].show();
				
				if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 1) {
					Baseball2Dto dto11 = (Baseball2Dto)request.get("dtof11");					
					dao.change11(dto11);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 2) {
					Baseball2Dto dto12 = (Baseball2Dto)request.get("dtof12");
					dao.change12(dto12);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 3) {
					Baseball2Dto dto13 = (Baseball2Dto)request.get("dtof13");
					dao.change13(dto13);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 1) {
					Baseball2Dto dto21 = (Baseball2Dto)request.get("dtof21");
					dao.change21(dto21);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 2) {
					Baseball2Dto dto22 = (Baseball2Dto)request.get("dtof22");
					dao.change22(dto22);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 3) {
					Baseball2Dto dto23 = (Baseball2Dto)request.get("dtof23");
					dao.change23(dto23);					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 1) {
					Baseball2Dto dto31 = (Baseball2Dto)request.get("dtof31");
					dao.change31(dto31);
					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 2) {
					Baseball2Dto dto32 = (Baseball2Dto)request.get("dtof32");
					dao.change32(dto32);
					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 3) {
					Baseball2Dto dto33 = (Baseball2Dto)request.get("dtof33");
					dao.change33(dto33);
					
				}
				break;
				
			case 5:
				ArrayList<Baseball2Dto> listd11 = dao.selectAll11();
				request.put("listc11", listd11);
				ArrayList<Baseball2Dto> listd12 = dao.selectAll12();
				request.put("listc12", listd12);
				ArrayList<Baseball2Dto> listd13 = dao.selectAll13();
				request.put("listc13", listd13);
				ArrayList<Baseball2Dto> listd21 = dao.selectAll21();
				request.put("listc21", listd21);
				ArrayList<Baseball2Dto> listd22 = dao.selectAll22();
				request.put("listc22", listd22);
				ArrayList<Baseball2Dto> listd23 = dao.selectAll23();
				request.put("listc23", listd23);
				ArrayList<Baseball2Dto> listd31 = dao.selectAll31();
				request.put("listc31", listd31);
				ArrayList<Baseball2Dto> listd32 = dao.selectAll32();
				request.put("listc32", listd32);
				ArrayList<Baseball2Dto> listd33 = dao.selectAll33();
				request.put("listc33", listd33);
				
				views[5].show();
				
				if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 1) {
					Baseball2Dto ddto11 = (Baseball2Dto)request.get("dtoc11");					
					dao.delete11(ddto11);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 2) {
					Baseball2Dto ddto12 = (Baseball2Dto)request.get("dtoc12");
					dao.delete12(ddto12);					
				}
				else if((int)request.get("dateNo") == 1 && (int)request.get("type1") == 3) {
					Baseball2Dto ddto13 = (Baseball2Dto)request.get("dtoc13");
					dao.delete13(ddto13);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 1) {
					Baseball2Dto ddto21 = (Baseball2Dto)request.get("dtoc21");
					dao.delete21(ddto21);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 2) {
					Baseball2Dto ddto22 = (Baseball2Dto)request.get("dtoc22");
					dao.delete22(ddto22);					
				}
				else if((int)request.get("dateNo") == 2 && (int)request.get("type2") == 3) {
					Baseball2Dto ddto23 = (Baseball2Dto)request.get("dtoc23");
					dao.delete23(ddto23);					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 1) {
					Baseball2Dto ddto31 = (Baseball2Dto)request.get("dtoc31");
					dao.delete31(ddto31);
					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 2) {
					Baseball2Dto ddto32 = (Baseball2Dto)request.get("dtoc32");
					dao.delete32(ddto32);
					
				}
				else if((int)request.get("dateNo") == 3 && (int)request.get("type3") == 3) {
					Baseball2Dto ddto33 = (Baseball2Dto)request.get("dtoc33");
					dao.delete33(ddto33);
					
				}
				break;
			case 6:
				views[6].show();
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
