package org.comstudy21.day12_5;


	class People {
		
		private int no;
		private String name;
		private String address;

		public void setNo(int no) {
			this.no = no;
		}

		public int getNo() {
			return no;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAddress() {
			return address;
		}
		

		@Override
		public String toString() {
			return "People [no=" + no + ", name=" + name + ", address=" + address + "]";
		}
		

		public People() {
			this(0,"","");
		}

		public People(int no, String name, String address) {
			this.no = no;
			this.name = name;
			this.address = address;
		}

		public People(int no, String name) {
//			this.no = no;
//			this.name = name;
			this(no, name, "");// = ���� Ŭ������ �ִ� ������ ȣ��
		}

		public People(int no) {
			//this.no = no;
			this(no,"","");

		}

	
}
	
public class Day12Ex05 {
	public static void main(String[] args) {

		People p1 = new People(10, "ȫ�浿", "�����");
		
		People p2 = new People(20, "������");
		p2.setAddress("���ֽ�");
		
		People p3 = new People(30);
		p3.setName("������");
		p3.setAddress("������");
		
		People p4 = new People();
		p4.setNo(40);
		p4.setName("Ȳ����");
		p4.setAddress("����");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}
}
