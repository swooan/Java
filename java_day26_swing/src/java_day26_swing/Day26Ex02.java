package java_day26_swing;

import javax.swing.JOptionPane;

public class Day26Ex02 {

	public static void main(String[] args) {
		
		String message = "���� ���α׷��Ӵ�";
		
		if(args.length > 0) {
			message = args[0];
		}
		
		JOptionPane.showMessageDialog(null, message);

	}

}
