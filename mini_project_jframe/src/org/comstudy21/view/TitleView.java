package org.comstudy21.view;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class TitleView extends View {
	public TitleView() {
		setLayout(new GridBagLayout());
		
		JLabel appTitle = new JLabel("::::: �������ý��� :::::"); 
		appTitle.setFont(new Font("����ü", Font.BOLD, 35));
		add(appTitle);
	}
}
