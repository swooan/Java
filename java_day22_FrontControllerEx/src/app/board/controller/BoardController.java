package app.board.controller;

import app.controller.Controller;
import app.main.AppMain;

public class BoardController implements Controller{
	
	@Override
	public void service(String path) {
		System.out.println("---- BoardController ----");
		String path2 = AppMain.menu("��Ϻ���","�� ���", "�󼼺���", "���");
		
		System.out.println("��� : " + path2);
	}

}
