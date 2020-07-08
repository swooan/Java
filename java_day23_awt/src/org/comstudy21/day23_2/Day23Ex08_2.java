package org.comstudy21.day23_2;

import java.awt.*;

public class Day23Ex08_2 extends MyFrame {

	Label centerLabel = new Label("Press the button bellow");
	
	Button[] bottomButton = new Button[4];
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel1 = new Panel(new GridLayout(1, 3));
	Panel bottomPanel2 = new Panel(new GridLayout(2, 1));
	
	public Day23Ex08_2() {
		
		bottomButton[0] = new Button("Play");
		bottomButton[1] = new Button("Stop");
		bottomButton[2] = new Button("Next");
		bottomButton[3] = new Button("Preview");
		
		bottomPanel2.add(bottomButton[2]);
		bottomPanel2.add(bottomButton[3]);
		
		centerPanel.add(centerLabel);
		bottomPanel1.add(bottomButton[0]);
		bottomPanel1.add(bottomButton[1]);
		bottomPanel1.add(bottomPanel2);
		
		add(centerPanel);
		add(BorderLayout.SOUTH, bottomPanel1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day23Ex08_2();

	}

}
