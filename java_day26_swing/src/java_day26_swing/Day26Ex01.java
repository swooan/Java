package java_day26_swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Day26Ex01 extends JFrame {

	JPanel contentPanel;
	JPanel p1 = new JPanel(new GridLayout(5,1));
	JLabel lbl1 = new JLabel("이        름 : ");
	JLabel lbl2 = new JLabel("아  이  디 : ");
	JLabel lbl3 = new JLabel("패스워드 : ");
	JLabel lbl4 = new JLabel("나         이 : ");
	JTextField txt1 = new JTextField(18);
	JTextField txt2 = new JTextField(18);
	JTextField txt3 = new JTextField(18);
	JTextField txt4 = new JTextField(18);
	
	JButton btn1 = new JButton("가입하기");
	JButton btn2 = new JButton("다시쓰기");
	
	public Day26Ex01() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		contentPanel = (JPanel)getContentPane();
		contentPanel.setLayout(new GridBagLayout());
		
		JPanel row1 = new JPanel();
		row1.add(lbl1);
		row1.add(txt1);
		
		JPanel row2 = new JPanel();
		row2.add(lbl2);
		row2.add(txt2);
		
		JPanel row3 = new JPanel();
		row3.add(lbl3);
		row3.add(txt3);
		
		JPanel row4 = new JPanel();
		row4.add(lbl4);
		row4.add(txt4);
		
		p1.add(row1);
		p1.add(row2);
		p1.add(row3);
		p1.add(row4);
		JPanel btnPane = new JPanel(new GridBagLayout());
		btnPane.add(btn1);
		btnPane.add(btn2);
		p1.add(btnPane);
		contentPanel.add(p1);
		
		setSize(1028, 720);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day26Ex01();

	}

}
