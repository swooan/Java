package java_day25_io;

import java.io.File;
import java.io.IOException;

public class Day25Ex06 {

	public static void main(String[] args) throws IOException {
		String pathname = "data.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			System.out.println("������ �����մϴ�.");
			if(file.delete()) {
				System.out.println("������ �����Ǿ����ϴ�.");
			}
		}
		else {
			System.out.println("������ �����ϴ�.");
			// ���� ������ ���� �����
			if(file.createNewFile()) {
				System.out.println("������ �����Ǿ����ϴ�.");
			}
		}
	}

}
