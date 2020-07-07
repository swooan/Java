package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit.BoldAction;

import handler.ButtonEventHandler;

public class AppMain extends JFrame {
	public AppMain() {
	}

	JPanel content = (JPanel) getContentPane();

	ImageIcon image = new ImageIcon("image/고척돔.PNG");

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	public JButton btn1 = new JButton("예약");
	public JButton btn2 = new JButton("전체 좌석");
	public JButton btn3 = new JButton("내 예약 정보 확인");
	public JButton btn4 = new JButton("예약 정보 수정");
	public JButton btn5 = new JButton("예약 취소");
	public JButton btn6 = new JButton("종료");

	JLabel l1 = new JLabel("<<< 고척 스카이돔 예매 사이트  >>>");
	JLabel l2 = new JLabel();

	private Font f1;

	public void display() {

		l2.setIcon(image);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		p2.setLayout(new GridLayout(2, 1));
		p2.add(l2);
		f1 = new Font("궁서", Font.BOLD, 32);
		l1.setFont(f1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		p2.add(l1);
		content.add(new BorderLayout().CENTER, p2);

		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		
		content.add(new BorderLayout().SOUTH, p1);
		
		setSize(1028, 720);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		ButtonEventHandler btnEvtHandler = new ButtonEventHandler(this);
		btn1.addActionListener(btnEvtHandler);
		btn2.addActionListener(btnEvtHandler);
		btn3.addActionListener(btnEvtHandler);
		btn4.addActionListener(btnEvtHandler);
		btn5.addActionListener(btnEvtHandler);
		btn6.addActionListener(btnEvtHandler);


	}
}
