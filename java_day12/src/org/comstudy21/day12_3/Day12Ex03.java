package org.comstudy21.day12_3;
// 1. Ŭ���� ����

// ���� : ��ȭ��ȣ�� ����� ���α׷�
// �Է� ��� �˻� ���� ���� ����
// ��ȣ �̸� ��ȭ��ȣ �ּ�
// �ִ� 100��
class People {

	private int no;
	private String name;
	private String phone;

	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
}

public class Day12Ex03 {

	public static void main(String[] args) {
		//people �迭Ÿ������ ����
		People[] pArr;
		pArr = new People[3];
		
		String[] names = {"������","�̼���","������"};
		String[] phones = {"010-1111-1111","010-2222-2222","010-3333-3333"};
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new People();
			pArr[i].setNo((i+1)*10);
			pArr[i].setName(names[i]);
			pArr[i].setPhone(phones[i]);
			
		}
		
		// �迭�� People ��ü ����
//		pArr[0] = new People();
//		pArr[0].setNo(10);
//		pArr[0].setName("�̼���");
//		pArr[0].setPhone("010-1111-1111");
//
//		pArr[1] = new People();
//		pArr[1].setNo(20);
//		pArr[1].setName("������");
//		pArr[1].setPhone("010-2222-2222");
//		
//		pArr[2] = new People();
//		pArr[2].setNo(30);
//		pArr[2].setName("��������");
//		pArr[2].setPhone("010-3333-3333");
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getNo());
			System.out.println(pArr[i].getName());
			System.out.println(pArr[i].getPhone());
			System.out.println();
		}
	}
	
	public static void test(String[] args) {
		// 2. �������� ����
		People person;
		// 3. ��ü ����
		person = new People();

		// 4. ��� �ʵ忡 �� �ֱ�
		person.setNo(100);
		person.setName("ȫ�浿");
		person.setPhone("010-1121-1111");
		// 5. ��� �ʵ忡 ����
		System.out.println(person.getNo() + " / " + person.getName() + " / " + person.getPhone());
	}

}
