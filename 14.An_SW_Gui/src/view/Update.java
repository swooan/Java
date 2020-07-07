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

import controller.SearchController;
import handler.MouseEventHandler;
import resource.Res;

public class Update extends JFrame implements Res {
	
	JPanel content = (JPanel)getContentPane();
	
	JPanel p1 = new JPanel();
	
	JLabel l1 = new JLabel("이름을 입력하세요 : ");
	public static JButton b1 = new JButton("검색");
	JScrollPane s1;
	
	public JTable t1;

	public static JTextField tf1 = new JTextField(15);
	
	public Update() {
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
		
		typeNames3.clear();
		typeNames3.add("이름");
		typeNames3.add("날짜");
		typeNames3.add("좌석");
		typeNames3.add("좌석 번호");
		dm4.setColumnIdentifiers(typeNames3);
		dm4.setDataVector(null, typeNames3);
		
		t1 = new JTable(dm4);
		
		s1 = new JScrollPane(t1);
		
		content.add(new BorderLayout().NORTH, p1);
		content.add(new BorderLayout().CENTER, s1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				search2Controller.service();
				
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
