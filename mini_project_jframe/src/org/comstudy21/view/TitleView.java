package org.comstudy21.view;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class TitleView extends View {
	public TitleView() {
		setLayout(new GridBagLayout());
		
		JLabel appTitle = new JLabel("::::: 고객관리시스템 :::::"); 
		appTitle.setFont(new Font("바탕체", Font.BOLD, 35));
		add(appTitle);
	}
}
