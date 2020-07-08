package org.comstudy21.ch03;

public class Ch03Ex04 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			if(i%2 == 1) {
				continue;
			}
			for(int j = 1; j<10; j++) {
				System.out.printf("%d*%d=%d\t" , i , j, i*j);
				
			}
			System.out.println();
		}
		
	}

}
