package java_day25_io;

import java.io.File;
import java.io.IOException;

public class Day25Ex06 {

	public static void main(String[] args) throws IOException {
		String pathname = "data.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			System.out.println("파일이 존재합니다.");
			if(file.delete()) {
				System.out.println("파일이 삭제되었습니다.");
			}
		}
		else {
			System.out.println("파일이 없습니다.");
			// 파일 없으면 파일 만들기
			if(file.createNewFile()) {
				System.out.println("파일이 생성되었습니다.");
			}
		}
	}

}
