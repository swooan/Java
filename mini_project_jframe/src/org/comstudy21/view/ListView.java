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
		// 1.Vector가 DataModel로 들어가고 
		// 2.DataModel이 JTable로 들어가고
		// 3.JTable은 ScrollPane으로 들어간다.
		
		
		// 1. 
		columnNames.add("번         호");
		columnNames.add("이         름");
		columnNames.add("이   메   일");
		columnNames.add("전 화 번 호");
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
