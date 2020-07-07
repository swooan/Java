package view;

import Resource.Res;

public abstract class Baseball2View implements Res {
	
	public abstract void show();
	
	void display() {
		System.out.println("----------------");
		show();
	}

}
