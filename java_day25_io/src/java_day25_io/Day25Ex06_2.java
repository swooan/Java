package java_day25_io;

import java.io.File;
import java.io.IOException;

public class Day25Ex06_2 {

	public static void main(String[] args) throws IOException{
		int i = 2;
		String pathname = "test_io" + i + ".txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			if(file.createNewFile()) {
				System.out.println("파일을 복사했습니다.");
				i++;
			}
		}

	}

}
