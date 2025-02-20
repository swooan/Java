package app.main;

import java.util.Scanner;

import app.controller.FrontController;


public class AppMain {
	static Scanner scan = new Scanner(System.in);
	public static String menu(String ... menuList) {
		for(int i = 0; i< menuList.length; i++) {
			System.out.print((i+1) + "." + menuList[i] + " ");
		}
		System.out.println();
		System.out.print("선택 : ");
		int no = scan.nextInt();
		
		String path = null;
		
		try {
			path = menuList[no-1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 사항 없습니다.");
		}
		
		return path;
	}
	
	public static void main(String[] args) {
		
		String path = menu("shop","board", "end");
		
		if(path != null) {
			
			if("end".equals(path)) {
				System.out.println("프로그램 종료!");
				System.exit(0);;
			}
			
			FrontController frontCtrl = new FrontController();
			frontCtrl.service(path);			
		}		
		
		System.out.println();
		main(null);
	}

}
