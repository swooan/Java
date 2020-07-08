package view;

import java.util.ArrayList;
import static util.MyUtil.*;
import model.Dto;
import controller.YagooController;

public class Record extends YagooView {

	@Override
	protected void display() {
		System.out.println(":::: ±â·Ï ::::");
		ArrayList<Dto> list = (ArrayList<Dto>) request.get("nums");
		ArrayList<Dto> list2 = (ArrayList<Dto>) request.get("sbs");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).printNums();
			list2.get(i).printSbs();
		}	
	}
}
