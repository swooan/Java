package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Output extends MyView {

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>)request.get("list");
		for(People p : list) {
			System.out.println(p);
		}	
	}
}
