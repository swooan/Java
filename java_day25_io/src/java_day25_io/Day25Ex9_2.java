package java_day25_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class People1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String phone;

	public People1() {
	}

	People1(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People1 [name=" + name + ", phone=" + phone + "]";
	}

}

public class Day25Ex9_2 {

	static ArrayList<People1> list1 = new ArrayList<People1>();
	static {
		list1.add(new People1("kim", "010-1111-1111"));
		list1.add(new People1("lee", "010-2222-2222"));
		list1.add(new People1("park", "010-3333-3333"));
		list1.add(new People1("kang", "010-4444-4444"));
	}
	static File file = new File("people_list.data");

	private void storeData() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		
		try {
			oos.writeObject(list1);
		} finally {
			oos.close();
		}
		System.out.println("��ü ����Ʈ ���� �Ϸ�");
	}

	private void readData() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		
		try {
			ArrayList<People1> newList = (ArrayList<People1>) ois.readObject();
			for(People1 p : newList) {
				System.out.println(p);
			}
		} finally {
			ois.close();
		}
		
		System.out.println("���Ͽ��� ��ü �ҷ����� ����.");
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Day25Ex9_2 ex = new Day25Ex9_2();

		ex.storeData();
		ex.readData();
	}
}
