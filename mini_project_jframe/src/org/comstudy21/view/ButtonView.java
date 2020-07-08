package org.comstudy21.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import org.comstudy21.handler.ButtonEventHandler;

public class ButtonView extends View {
	public JButton listBtn = new JButton("��ü����");
	public JButton inputBtn = new JButton("��   ��");
	public JButton deleteBtn = new JButton("��   ��");
	public JButton searchBtn = new JButton("��   ��");
	public JButton cancelBtn = new JButton("��   ��");
	
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
