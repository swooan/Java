package java_day25_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

class People {
	private String name;
	private String phone;
	public People() {}
	People(String name, String phone) {
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
		return "People [name=" + name + ", phone=" + phone + "]";
	}
	
}

public class Day25Ex09 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<People> list = new ArrayList<People>();
		list.add(new People("kim", "010-1111-1111"));
		list.add(new People("lee", "010-2222-2222"));
		list.add(new People("park", "010-3333-3333"));
		list.add(new People("kang", "010-4444-4444"));
		
		File file = new File("people_list.data");
		
		FileOutputStream out = new FileOutputStream(file);
		
		int data = 0;
		for (int i=0; i<list.size(); i++) {
			for(int j = 0; j < list.get(i).toString().length(); j++) {
				out.write(list.get(i).toString().charAt(j));
			}
			out.write('\n');
		}
		out.close();
	}

}
