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

import handler.MouseEventHandler;
import resource.Res;

public class Delete extends JFrame implements Res {
	
	JPanel content = (JPanel)getContentPane();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JLabel l1 = new JLabel("이름을 입력하세요 : ");
	public static JButton b1 = new JButton("검색");
	public JButton b2 = new JButton("예약 취소");
	public JButton b3 = new JButton("예약을 취소하는걸 취소");
	JScrollPane s1;
	
	public static JTable t1;

	public static JTextField tf1 = new JTextField(15);
	
	public Delete() {
		
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
		
		typeNames4.clear();
		typeNames4.add("이름");
		typeNames4.add("날짜");
		typeNames4.add("좌석");
		typeNames4.add("좌석 번호");
		dm5.setColumnIdentifiers(typeNames4);
		dm5.setDataVector(null, typeNames4);
		
		t1 = new JTable(dm5);
		
		s1 = new JScrollPane(t1);
		
		
		p2.add(b2);
		p2.add(b3);
		
		content.add(new BorderLayout().NORTH, p1);
		content.add(new BorderLayout().CENTER, s1);
		content.add(new BorderLayout().SOUTH, p2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				search3Controller.service();
				
			}
		});
		
		MouseEventHandler u1 = new MouseEventHandler(this);
		t1.addMouseListener(u1);
		
		tf1.setText("");
		
		setSize(620, 480);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
}
