package note;

import java.util.Arrays;

//class Person {
//	private String name;
//	private int age;
//}
//
//public class note5 {
//	public static void main(String[] args) {
//		Person aPerson = new Person();
//		aPerson.name = "홍길동";
//		aPerson.age = 17;
//	}
//}

//class SampleClass {
//	public void addAndStore(int i, int j) {
//		
//		i+=j;
//	}
//}
//public class note5 {
//	public static void main(String[] args) {
//		SampleClass aClass = new SampleClass();
//		int num = 15;
//				aClass.addAndStore(num, 10);
//				System.out.println(num);
//	}
//}

//class MyClass {
//	int i;
//}
//
//public class note5 {
//	public static void main(String[] args) {
//		MyClass a[] = new MyClass[10];
//		for(int j =0; j<a.length;j++) {
//			a[j].i = j;
//			System.out.println(j);
//		}
//	}
//}

//public class note5 {
//	int num;
//	String name;
//	
//	public note5(int i, String s) {
//		num = i;
//		name = s;
//	}
//	
//	public note5(int i) {
//		this(i,null);
//	}
//	public note5() {
//		System.out.println("생성자가 호출되었음");
//		this(0,null);
//	}
//}

class SampleClass {
	private static int id;
	public static int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}

public class note5 {
	public static void main() {
		SampleClass obj = new SampleClass();
		obj.setId(10);
		System.out.println(obj.getId());
	}
}