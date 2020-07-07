package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import resource.Res;

public class Search extends JFrame implements Res {
	
JPanel content = (JPanel)getContentPane();
	
	JPanel p1 = new JPanel();
	
	JLabel l1 = new JLabel("이름을 입력하세요 : ");
	public static JButton b1 = new JButton("검색");
	JScrollPane s1;
	
	public static JTable t1;

	public static JTextField tf1 = new JTextField(15);
	
	public Search() {
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(b1);
		
		tf1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					b1.doClick();
				}
			}
			
		});
		
		typeNames2.clear();
		typeNames2.add("이름");
		typeNames2.add("날짜");
		typeNames2.add("좌석");
		typeNames2.add("좌석 번호");
		dm3.setColumnIdentifiers(typeNames2);
		dm3.setDataVector(null, typeNames2);
		
		t1 = new JTable(dm3);
		
		s1 = new JScrollPane(t1);
		
		content.add(new BorderLayout().NORTH, p1);
		content.add(new BorderLayout().CENTER, s1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				searchController.service();
				
			}
		});
		
		tf1.setText("");
		
		setSize(620, 480);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

}
