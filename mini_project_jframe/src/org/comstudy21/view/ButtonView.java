package org.comstudy21.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import org.comstudy21.handler.ButtonEventHandler;

public class ButtonView extends View {
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추   가");
	public JButton deleteBtn = new JButton("삭   제");
	public JButton searchBtn = new JButton("검   색");
	public JButton cancelBtn = new JButton("취   소");
	
	public ButtonView() {
		add(listBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
		
		ButtonEventHandler btnEvtHandler = new ButtonEventHandler(this);
		listBtn.addActionListener(btnEvtHandler);
		inputBtn.addActionListener(btnEvtHandler);
		deleteBtn.addActionListener(btnEvtHandler);
		searchBtn.addActionListener(btnEvtHandler);
		cancelBtn.addActionListener(btnEvtHandler);
	}
}
