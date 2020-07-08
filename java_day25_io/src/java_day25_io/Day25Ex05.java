package java_day25_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day25Ex05 {
	
	public static void main(String[] args) throws IOException {
		// ������ ������ �о�ͼ� ȭ�鿡 ��� �Ѵ�.
		FileInputStream input = new FileInputStream("test_io.txt");
		
		int data = 0;
		while((data = input.read()) != -1) {
			System.out.write(data);
		}
		
		//���� ����� ������
		input.close();
		
	}
	
}
