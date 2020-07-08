package view;

import java.util.Scanner;

import Resource.R;
import util.MyUtil.*;
import controller.YagooController;

public abstract class YagooView implements R {
	
	protected abstract void display();
	
	public void show() {
		System.out.println("===========================");
		display();
	}
	
}
