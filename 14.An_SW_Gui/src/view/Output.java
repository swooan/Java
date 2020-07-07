package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import resource.Res;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import handler.MouseEventHandler;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;


public class Output extends JFrame implements Res {
	JPanel content = (JPanel) getContentPane();

	JPanel p1 = new JPanel();

	JPanel p2 = new JPanel(new GridLayout(2, 1));
	JPanel p3 = new JPanel(new GridLayout(2, 1));

	public JPanel p4 = new JPanel(new GridLayout(3, 3));

	public static JLabel l1 = new JLabel("1");
	public static JLabel l2 = new JLabel("2");
	public static JLabel l3 = new JLabel("3");
	public static JLabel l4 = new JLabel("4");
	public static JLabel l5 = new JLabel("5");
	public static JLabel l6 = new JLabel("6");
	public static JLabel l7 = new JLabel("7");
	public static JLabel l8 = new JLabel("8");
	public static JLabel l9 = new JLabel("9");
	public static JLabel white = new JLabel();
	public static JLabel black = new JLabel();

	public ImageIcon wchair1 = new ImageIcon("image/whitechair.png");
	public Image imageWC1 = wchair1.getImage();
	public Image wchair = imageWC1.getScaledInstance(50, 50, imageWC1.SCALE_SMOOTH);

	public ImageIcon bchair1 = new ImageIcon("image/blackchair.png");
	public Image imageBC1 = bchair1.getImage();
	public Image bchair = imageBC1.getScaledInstance(50, 50, imageBC1.SCALE_SMOOTH);

	public final JTable t1;
	public final JTable t2;

	JScrollPane s1;
	JScrollPane s2;

	
	public Output() {
		

		p1.setLayout(new GridLayout(1, 2, 80, 80));
		dateNames.clear();
		dateNames.add("날짜를 선택하세요.");
		dm1.setColumnIdentifiers(dateNames);

		t1 = new JTable(dm1);

		MouseEventHandler dl = new MouseEventHandler(this);
		t1.addMouseListener(dl);

		s1 = new JScrollPane(t1);
		s1.setPreferredSize(new Dimension(100, 100));
		p3.add(s1);
		p1.add(p3);

		dateController.service();

		typeNames.clear();
		typeNames.add("타입을 선택하세요.");
		dm2.setColumnIdentifiers(typeNames);
		dm2.setDataVector(null, typeNames);

		t2 = new JTable(dm2);
		MouseEventHandler tl = new MouseEventHandler(this);
		t2.addMouseListener(tl);

		s2 = new JScrollPane(t2);
		s2.setPreferredSize(new Dimension(100, 100));
		p2.add(s2);
		p1.add(p2);

		white.setIcon(new ImageIcon(wchair));
		black.setIcon(new ImageIcon(bchair));

		l1.setIcon(white.getIcon());
		l2.setIcon(white.getIcon());
		l3.setIcon(white.getIcon());
		l4.setIcon(white.getIcon());
		l5.setIcon(white.getIcon());
		l6.setIcon(white.getIcon());
		l7.setIcon(white.getIcon());
		l8.setIcon(white.getIcon());
		l9.setIcon(white.getIcon());

		p4.add(l1);
		p4.add(l2);
		p4.add(l3);
		p4.add(l4);
		p4.add(l5);
		p4.add(l6);
		p4.add(l7);
		p4.add(l8);
		p4.add(l9);

		p4.setBorder(new TitledBorder("좌석도"));
		p4.setVisible(false);

		content.add(new BorderLayout().NORTH, p1);
		content.add(new BorderLayout().CENTER, p4);

		setSize(620, 480);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
}
