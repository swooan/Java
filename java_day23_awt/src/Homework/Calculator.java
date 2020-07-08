package Homework;

import java.awt.*;

public class Calculator extends MyFrame1 {
	
	Label label = new Label("Calculator");
	
	Button[] btn = new Button[28];
	
	Panel pan0 = new Panel(new GridLayout(1,1));
	Panel pan1 = new Panel(new GridLayout(3,1));
	Panel pan2 = new Panel(new GridLayout(1,3));
	Panel pan3 = new Panel(new GridLayout(1,3));
	Panel pan4 = new Panel(new GridLayout(2,2));
	Panel pan5 = new Panel(new GridLayout(2,2));
	Panel pan11 = new Panel(new GridLayout(2,2));
	Panel pan12 = new Panel(new GridLayout(2,2));
	Panel pan13 = new Panel(new GridLayout(2,1));
	Panel pan14 = new Panel(new GridLayout(2,1));
	
	
	Panel pan6 = new Panel(new GridLayout(1,3));
	
	Panel pan7 = new Panel(new GridLayout(2,2));
	Panel pan8 = new Panel(new GridLayout(1,2));
	Panel pan9 = new Panel(new GridLayout(1,1));
	
	Panel pan10 = new Panel(new GridLayout(2,1));

	
	
	public Calculator() {
		btn[0] = new Button("MC");
		btn[1] = new Button("MR");
		btn[2] = new Button("MS");
		btn[3] = new Button("M+");
		btn[4] = new Button("M-");
		btn[5] = new Button("<-");
		btn[6] = new Button("CE");
		btn[7] = new Button("C");
		btn[8] = new Button("+-");
		btn[9] = new Button("ROOT");
		btn[10] = new Button("7");
		btn[11] = new Button("8");
		btn[12] = new Button("9");
		btn[13] = new Button("/");
		btn[14] = new Button("%");
		btn[15] = new Button("4");
		btn[16] = new Button("5");
		btn[17] = new Button("6");
		btn[18] = new Button("*");
		btn[19] = new Button("1/x");
		btn[20] = new Button("1");
		btn[21] = new Button("2");
		btn[22] = new Button("3");
		btn[23] = new Button("-");
		btn[24] = new Button("0");
		btn[25] = new Button(".");
		btn[26] = new Button("+");
		btn[27] = new Button("=");
		
		pan0.add(label);
		
		pan4.add(btn[0]);
		pan4.add(btn[1]);
		pan4.add(btn[5]);
		pan4.add(btn[6]);
		pan5.add(btn[2]);
		pan5.add(btn[3]);
		pan5.add(btn[7]);
		pan5.add(btn[8]);
		pan13.add(btn[4]);
		pan13.add(btn[9]);
		
		pan2.add(pan4);
		pan2.add(pan5);
		pan2.add(pan13);
		
		pan11.add(btn[10]);
		pan11.add(btn[11]);
		pan11.add(btn[15]);
		pan11.add(btn[16]);
		pan12.add(btn[12]);
		pan12.add(btn[13]);
		pan12.add(btn[17]);
		pan12.add(btn[18]);
		pan14.add(btn[14]);
		pan14.add(btn[19]);
		
		pan3.add(pan11);
		pan3.add(pan12);
		pan3.add(pan14);
		
		pan9.add(btn[24]);
		pan8.add(btn[20]);
		pan8.add(btn[21]);
		
		pan10.add(pan8);
		pan10.add(pan9);
		
		pan7.add(btn[22]);
		pan7.add(btn[23]);
		pan7.add(btn[25]);
		pan7.add(btn[26]);
		
		pan6.add(pan10);
		pan6.add(pan7);
		pan6.add(btn[27]);
		
		pan1.add(pan2);
		pan1.add(pan3);
		pan1.add(pan6);
		
		add(BorderLayout.NORTH, pan0);
		add(BorderLayout.SOUTH, pan1);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

}
