package AppMain;

import Controller.MyController;

public class AppMain {
	public static void main(String[] args) {
		//for(int i=0;i<3;i++)System.out.println("abc"+i);
		
		MyController c=new MyController();
		c.service();
	}

}
