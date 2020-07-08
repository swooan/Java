package org.comstudy21.day17;

class People1 {
	String name;
	String phone;
	
	public People1() {
		this("","");
	}
	
	public People1(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}

public class Day17Ex03_2 {
	
	People1[] pArr;
	int top =0;
	
	public Day17Ex03_2() {
		pArr = new People1[5];
	}
	
	void push(People1 people) {
		
		
		if(top >= pArr.length) {
			System.out.println("�� �̻� �߰��Ͻ� �� �����ϴ�.");
			return;
		}
		else {
			pArr[top] = people;
			top ++;			
		}
		
	}
	
	People1 pop() {
		
		if (top -1 < 0) {
			System.out.println("���̻� �����Ͱ� �����ϴ�.");
		}
		
		return pArr[--top];
		
	}
	
	
	public static void main(String[] args) {
		
	
	Day17Ex03_2 myFriends = new Day17Ex03_2();
	
	
	myFriends.push(new People1("ȫ�浿","010-1111"));
	myFriends.push(new People1("��浿","010-1111"));
	myFriends.push(new People1("�̱浿","010-1111"));
	myFriends.push(new People1("�ڱ浿","010-1111"));
	myFriends.push(new People1("�ֱ浿","010-1111"));

	myFriends.push(new People1("�ȱ浿","010-1111")); // ���̻� �Է� �Ұ�
	
	System.out.println(myFriends.pop()); //"�ֱ浿"
	System.out.println(myFriends.pop()); //��
	System.out.println(myFriends.pop()); //��
	System.out.println(myFriends.pop()); //��
	System.out.println(myFriends.pop()); //ȫ
	
	System.out.println(myFriends.pop()); // ���̻� �����Ͱ� �����ϴ�.
	}	

}
