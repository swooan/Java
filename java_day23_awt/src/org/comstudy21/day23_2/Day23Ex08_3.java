package org.comstudy21.day23_2;

import java.awt.*;

public class Day23Ex08_3 extends MyFrame {

	Label label = new Label("Press the leftside buttons");
	
	Button[] button = new Button[5];
	
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel1 = new Panel(new GridLayout(3, 1 , 3 , 3 ));
	Panel bottomPanel2 = new Panel(new GridLayout(1, 2, 3, 3));
	Panel bottomPanel3 = new Panel(new GridLayout(1, 2, 3, 3));
	
	public Day23Ex08_3() {
		
		button[0] = new Button("1");
		button[1] = new Button("2");
		button[2] = new Button("3");
		button[3] = new Button("4");
		button[4] = new Button("5");
		
		bottomPanel2.add(button[0]);
		bottomPanel2.add(button[1]);
		bottomPanel3.add(button[2]);
		bottomPanel3.add(button[3]);
		
		centerPanel.add(label);
		
		bottomPanel1.add(bottomPanel2);
		bottomPanel1.add(bottomPanel3);
		bottomPanel1.add(button[4]);
		
		add(centerPanel);
		add(BorderLayout.WEST,bottomPanel1);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Day23Ex08_3();

	}

}
