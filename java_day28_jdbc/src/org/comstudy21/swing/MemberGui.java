package org.comstudy21.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.comstudy21.MainCls;
import org.comstudy21.model.Dao;
import org.comstudy21.model.Dto;

public class MemberGui extends JFrame {
	
	JPanel content = (JPanel)getContentPane();
	
	JPanel p1 = new JPanel(new GridLayout(5,1));
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel(new FlowLayout());
	
	JPanel p4 = new JPanel(new FlowLayout());
	JPanel p5 = new JPanel(new FlowLayout());
	JPanel p6 = new JPanel(new FlowLayout());
	JPanel p7 = new JPanel(new FlowLayout());
	JPanel p8 = new JPanel(new FlowLayout());
	
	JLabel l1 = new JLabel("번호");
	JLabel l2 = new JLabel("이름");
	JLabel l3 = new JLabel("아뒤");
	JLabel l4 = new JLabel("비번");
	
	JList list = new JList();
	
	JTextField txt1 = new JTextField(15);
	JTextField txt2 = new JTextField(15);
	JTextField txt3 = new JTextField(15);
	JTextField txt4 = new JTextField(15);
	
	JButton btn1 = new JButton("전체보기");
	JButton btn2 = new JButton("추   가");
	JButton btn3 = new JButton("삭   제");
	JButton btn4 = new JButton("검   색");
	JButton btn5 = new JButton("취   소");
	
	JTable table;

	Vector<Vector<String>> data = new Vector<Vector<String>>();
	
	Dao dao = new Dao();
	
	public MemberGui() {
		
		p4.add(l1);
		p4.add(txt1);
		p5.add(l2);
		p5.add(txt2);
		p6.add(l3);
		p6.add(txt3);
		p7.add(l4);
		p7.add(txt4);
		
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		p1.add(p7);
		
		content.add(new BorderLayout().WEST, p1);
		
		p3.add(btn1);
		p3.add(btn2);
		p3.add(btn3);
		p3.add(btn4);
		p3.add(btn5);
		
		content.add(new BorderLayout().SOUTH,p3);
		
		ArrayList<Dto> list = dao.selectAll();
		Vector<String> v1 = new Vector<String>();
		for(int i = 0; i < list.size(); i++) {
			v1.add(list.get(i).getCode());
			v1.add(list.get(i).getName());
			v1.add(list.get(i).getId());
			v1.add(list.get(i).getPwd());
		}
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("번호");
		columnNames.add("이름");
		columnNames.add("ID");
		columnNames.add("PWD");
		
		TableModel tm = new DefaultTableModel(data,columnNames);
		table = new JTable(tm);
		JScrollPane spane = new JScrollPane(table);
		
		p2.add(spane);
		
		content.add(p2);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MemberGui();
	}
}
