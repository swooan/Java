package java_day25_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Day25Ex04 {

	public static void main(String[] args) throws IOException {

		// ��ĳ���� ��Ų��.
		InputStream in = System.in;
		
		// FileOutputStream �� �θ� OutputStream�̱⵵ �ϴ�.
//		OutputStream out = System.out;
		OutputStream out = new FileOutputStream("test_io.txt");

		// FileInputStream �� �θ� InputStream�̴�.
		// Ű���� �Է� ==> ȭ�� ���
		System.out.print("������ �Է� >>> ");
		int data = 0;
		while ((data = in.read()) != -1) {
			out.write(data);
		}
		 // ���� ������� ������ ������ �ݾ�����Ѵ�. �׷��� ���� �ۼ��� �Ϸ�ȴ�.
		out.close();
	}

}
