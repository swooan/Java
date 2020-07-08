package org.comstudy21.view;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class InputView extends View {
	JPanel pane = new JPanel(new GridLayout(4,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	public InputView() {
		p1.add(new JLabel("��         ȣ : "));
		p1.add(noLabel);
		p2.add(new JLabel("��         �� : "));
		p2.add(nameField);
		p3.add(new JLabel("��   ��   �� : "));
		p3.add(emailField);
		p4.add(new JLabel("�� ȭ �� ȣ : "));
		p4.add(phoneField);
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		
		add(pane);
	}
}
