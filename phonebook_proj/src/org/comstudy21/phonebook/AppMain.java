package org.comstudy21.phonebook;

import org.comstudy21.phonebook.controller.PhonebookController;
import org.comstudy21.phonebook.view.Menu;

// 응집력은 높이고 결합도는 낮춘다.
public class AppMain {
	public static void main(String[] args) {
		
		PhonebookController controller = new PhonebookController();
		controller.service();
		

		
	}
}
