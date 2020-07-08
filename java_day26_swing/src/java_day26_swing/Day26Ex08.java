package java_day26_swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Day26Ex08 extends JFrame{
	
	JPanel content;
	
	JButton btn1 = new JButton("추가");
	JButton btn2 = new JButton("삭제");
	
	JPanel pan1 = new JPanel();
	
	JTextField txt1 = new JTextField(10);
	JTextField txt2 = new JTextField(10);
	JTextField txt3 = new JTextField(10);
	JTextField txt4 = new JTextField(10);
	
	Vector<Vector<String>> data = new Vector<Vector<String>>();
	
	JTable table;

	public Day26Ex08() {
		
		content = (JPanel)getContentPane();
		
		Vector<String> v1 = new Vector<String>();
		v1.add("박영수");
		v1.add("90");
		v1.add("87");
		v1.add("98");
		data.add(v1);
		
		Vector<String> v2 = new Vector<String>();
		v2.add("김영희");
		v2.add("100");
		v2.add("99");
		v2.add("100");
		data.add(v2);
		
		Vector<String> v3 = new Vector<String>();
		v3.add("김철수");
		v3.add("30");
		v3.add("25");
		v3.add("9");
		data.add(v3);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("학생 이름");
		columnNames.add("국어");
		columnNames.add("영어");
		columnNames.add("수학");
		
		TableModel tm = new DefaultTableModel(data,columnNames);
		table = new JTable(tm);
		JScrollPane spane = new JScrollPane(table);
		
		
		content.add(spane);
		
		pan1.setLayout(new GridBagLayout());
		pan1.add(txt1);
		pan1.add(txt2);
		pan1.add(txt3);
		pan1.add(txt4);
		pan1.add(btn1);
		pan1.add(btn2);
		
		content.add(new BorderLayout().SOUTH, pan1);
		
		
		setSize(1028,720);
		setVisible(true);	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Vector<String> v = new Vector<String>();
				v.add(txt1.getText());
				v.add(txt2.getText());
				v.add(txt3.getText());
				v.add(txt4.getText());
				
				data.add(v);
				
				table.updateUI();
				
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int click = table.getSelectedRow();
				data.remove(click);
				table.updateUI();
				
			}
			
			
		});
	}

		

	
	public static void main(String[] args) {
		new Day26Ex08();

	}

}
