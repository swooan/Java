package java_day26_swing;

import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

interface R {
	String TXT1 = "등산";
	String TXT2 = "윈드서핑";
	String TXT3 = "독서";
	String TXT4 = "낚시";
	String TXT5 = "코딩";
}

interface Resource extends R {
	JCheckBox ch01 = new JCheckBox(TXT1, true);
	JCheckBox ch02 = new JCheckBox(TXT2, false);
	JCheckBox ch03 = new JCheckBox(TXT3, true);
	JCheckBox ch04 = new JCheckBox(TXT4, false);
	JCheckBox ch05 = new JCheckBox(TXT5, false);
}

class CheckEvtHandler implements ItemListener, Resource {

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() instanceof JCheckBox) {
			JCheckBox chkBox = (JCheckBox)e.getSource();
			if(chkBox == ch01) {
				if(e.getStateChange() == ItemEvent.SELECTED) {					
					System.out.println("등산이 취미입니다.");
				}
				else {
					System.out.println("등산이 취미가 아닙니다.");
				}
			}
		}
	}
}

public class Day26Ex05 extends JFrame implements Resource {

	JPanel cp = null;
	JPanel checkPane = new JPanel();
	
	public Day26Ex05() {
		cp = (JPanel)getContentPane();
		cp.setLayout(new GridBagLayout());
		
		checkPane.add(ch01);
		checkPane.add(ch02);
		checkPane.add(ch03);
		checkPane.add(ch04);
		checkPane.add(ch05);
		cp.add(checkPane);
		
		CheckEvtHandler l = new CheckEvtHandler();
		ch01.addItemListener(l);
		ch02.addItemListener(l);
		ch03.addItemListener(l);
		ch04.addItemListener(l);
		ch05.addItemListener(l);
		
		setSize(1028, 720);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day26Ex05();

	}

}
