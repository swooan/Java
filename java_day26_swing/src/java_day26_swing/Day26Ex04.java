package java_day26_swing;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Day26Ex04 extends JFrame {

	JRadioButton rb1 = new JRadioButton("남성", true);
	JRadioButton rb2 = new JRadioButton("남성", false);
	JRadioButton rb3 = new JRadioButton("우수회원", true);
	JRadioButton rb4 = new JRadioButton("일반회원", false);
	
	JPanel contentPane;
	
	public Day26Ex04() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ButtonGroup gr01 = new ButtonGroup();
		gr01.add(rb1);
		gr01.add(rb2);
		ButtonGroup gr02 = new ButtonGroup();
		gr01.add(rb3);
		gr01.add(rb4);
		
		contentPane.add(rb1);
		contentPane.add(rb2);
		contentPane.add(rb3);
		contentPane.add(rb4);
		
		setSize(1028, 720);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Day26Ex04();
	}

}
