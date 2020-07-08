package org.comstudy21.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ContentPane extends JPanel {
	public ContentPane() {
		setLayout(new BorderLayout());
		
		add(BorderLayout.NORTH,new TitleView());
		add(new ListView());
		add(BorderLayout.WEST, new InputView());
		add(BorderLayout.SOUTH, new ButtonView());
	}
}
