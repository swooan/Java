package org.comstudy21.ch03;

public class Ch03Ex03_2 {

	public Ch03Ex03_2() {
		doWhileTest();
	}
	public void doWhileTest() {
		
		char ch = 'A';
		
		do {
			System.out.print(ch);
			//ch = (char)(ch+1);
			ch++;
		}
		while(ch<='Z');
		
		
	} 
	public static void main(String[] args) {
		
		new Ch03Ex03_2();
	}
	
}
