package java_day25_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Day25Ex04 {

	public static void main(String[] args) throws IOException {

		// 업캐스팅 시킨다.
		InputStream in = System.in;
		
		// FileOutputStream 의 부모가 OutputStream이기도 하다.
//		OutputStream out = System.out;
		OutputStream out = new FileOutputStream("test_io.txt");

		// FileInputStream 의 부모가 InputStream이다.
		// 키보드 입력 ==> 화면 출력
		System.out.print("데이터 입력 >>> ");
		int data = 0;
		while ((data = in.read()) != -1) {
			out.write(data);
		}
		 // 파일 입출력이 끝나면 파일을 닫아줘야한다. 그래야 파일 작성이 완료된다.
		out.close();
	}

}
