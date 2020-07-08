package org.comstudy21.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	ContentPane contentPane = new ContentPane();
	
	public MainFrame() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(contentPane);
		setSize(750, 550);
	}
}
