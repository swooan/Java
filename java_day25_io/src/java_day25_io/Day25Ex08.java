package java_day25_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day25Ex08 {
	public static void main(String[] args) throws FileNotFoundException {
		//delimiter : 구분자 : 해당 글자를 전부 출력하지 않는다.
		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("세");
		
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
