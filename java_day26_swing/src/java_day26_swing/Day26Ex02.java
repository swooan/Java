package java_day26_swing;

import javax.swing.JOptionPane;

public class Day26Ex02 {

	public static void main(String[] args) {
		
		String message = "나는 프로그래머다";
		
		if(args.length > 0) {
			message = args[0];
		}
		
		JOptionPane.showMessageDialog(null, message);

	}

}
