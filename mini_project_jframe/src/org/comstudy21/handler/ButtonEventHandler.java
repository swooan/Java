package org.comstudy21.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.comstudy21.resource.R;
import org.comstudy21.view.ButtonView;

public class ButtonEventHandler implements ActionListener, R {
	ButtonView view;
	public ButtonEventHandler(ButtonView view) {
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == view.listBtn) {
//				System.out.println("INFO : listBtn Ŭ��!");
				listController.service();
			}
			if(btn == view.inputBtn) {
//				System.out.println("INFO : inputBtn Ŭ��!");
				inputController.service();
				listController.service();
			}
			if(btn == view.deleteBtn) {
//				System.out.println("INFO : deleteBtn Ŭ��!");
				deleteController.service();
			}
			if(btn == view.searchBtn) {
//				System.out.println("INFO : searchBtn Ŭ��!");
				searchController.service();
			}
			if(btn == view.cancelBtn) {
//				System.out.println("INFO : cancelBtn Ŭ��!");
				System.exit(0);
			}
			
			if(btn != view.searchBtn) {
				listController.service();
			}
		}
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 