package app.shop.controller;

import app.controller.Controller;
import app.main.AppMain;

public class ShopController implements Controller {

	@Override
	public void service(String path) {
		System.out.println("---- ShopController ----");
		String path2 = AppMain.menu("��ǰ���","��ǰ ����", "���Ȯ��", "���");
		
		System.out.println("��� : " + path2);
	}
	
}
