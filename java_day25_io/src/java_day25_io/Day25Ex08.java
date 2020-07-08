package java_day25_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day25Ex08 {
	public static void main(String[] args) throws FileNotFoundException {
		//delimiter : ������ : �ش� ���ڸ� ���� ������� �ʴ´�.
		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("��");
		
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
