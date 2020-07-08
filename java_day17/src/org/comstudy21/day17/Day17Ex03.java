package org.comstudy21.day17;

class People {
	String name;
	String phone;
	
	public People() {
		this("","");
	}
	
	public People(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "(" + name + "," + phone + ")";
	}

}

public class Day17Ex03 {
	People[] pArr;
	int top =0;
	People plate;
	
	public Day17Ex03(int size) {
		pArr = new People[size];
	}
	
	int size() {
		return top;
	}
	
	int capacity() {
		return pArr.length;
	}
	
	void push(People people) {
		if(top >= pArr.length) {
			System.out.println("���̻� �Է��Ͻ� �� �����ϴ�.");
			return;
		}
		else {
		pArr[top] = people;
		top ++;	 
		}
	}

	void showList() {
		
		if(pArr[0] == null) {
			System.out.println("������ �����ϴ�.");
		}
		
		for(int i = 0; i < top; i++) {
			System.out.println(pArr[i]);
		}
	}
	

	People pop() {
		
		if(top-1 < 0) {
			System.out.println("���̻� ���� �����ϴ�.");
			return null;
		}
		
		return pArr[--top];
	}
		

	
	public static void main(String[] args) {
		Day17Ex03 myFriends = new Day17Ex03(5);
		
		
		myFriends.showList(); // 0 -> ������ �����ϴ�.
		
		
		myFriends.push(new People("ȫ�浿","010-1111"));
		myFriends.push(new People("��浿","010-1111"));
		myFriends.push(new People("�̱浿","010-1111"));
		myFriends.push(new People("�ڱ浿","010-1111"));
		myFriends.push(new People("�ֱ浿","010-1111"));

		myFriends.push(new People("�ȱ浿","010-1111")); // ���̻� �Է� �Ұ�
		
		System.out.println(myFriends.pop()); //"�ֱ浿"
		System.out.println(myFriends.pop()); //��
		System.out.println(myFriends.pop()); //��
		System.out.println(myFriends.pop()); //��
		System.out.println(myFriends.pop()); //ȫ
		
		System.out.println(myFriends.pop()); // ���̻� �����Ͱ� �����ϴ�.
		
	}




}
