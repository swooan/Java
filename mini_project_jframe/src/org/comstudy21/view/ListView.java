package org.comstudy21.view;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.handler.MouseEventHandler;

public class ListView extends View {
	public static JTable table;
	public JScrollPane scrollPane;

	
	public ListView() {
		// 1.Vector�� DataModel�� ���� 
		// 2.DataModel�� JTable�� ����
		// 3.JTable�� ScrollPane���� ����.
		
		
		// 1. 
		columnNames.add("��         ȣ");
		columnNames.add("��         ��");
		columnNames.add("��   ��   ��");
		columnNames.add("�� ȭ �� ȣ");
		dm.setColumnIdentifiers(columnNames);
		
		
		// 2.
		table = new JTable(dm);
		
		MouseEventHandler l = new MouseEventHandler(this);
		table.addMouseListener(l);
		// 3.
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		listController.service();
	}
}
