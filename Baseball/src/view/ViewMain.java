package view;

import resource.Res;

public abstract class ViewMain implements Res{
	
	protected abstract void display();
	
	public void show() {
		System.out.println("===============================");
		display();
	}
}
