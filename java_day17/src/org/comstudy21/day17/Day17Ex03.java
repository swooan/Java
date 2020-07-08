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
			System.out.println("더이상 입력하실 수 없습니다.");
			return;
		}
		else {
		pArr[top] = people;
		top ++;	 
		}
	}

	void showList() {
		
		if(pArr[0] == null) {
			System.out.println("내용이 없습니다.");
		}
		
		for(int i = 0; i < top; i++) {
			System.out.println(pArr[i]);
		}
	}
	

	People pop() {
		
		if(top-1 < 0) {
			System.out.println("더이상 값이 없습니다.");
			return null;
		}
		
		return pArr[--top];
	}
		

	
	public static void main(String[] args) {
		Day17Ex03 myFriends = new Day17Ex03(5);
		
		
		myFriends.showList(); // 0 -> 내용이 없습니다.
		
		
		myFriends.push(new People("홍길동","010-1111"));
		myFriends.push(new People("김길동","010-1111"));
		myFriends.push(new People("이길동","010-1111"));
		myFriends.push(new People("박길동","010-1111"));
		myFriends.push(new People("최길동","010-1111"));

		myFriends.push(new People("안길동","010-1111")); // 더이상 입력 불가
		
		System.out.println(myFriends.pop()); //"최길동"
		System.out.println(myFriends.pop()); //박
		System.out.println(myFriends.pop()); //이
		System.out.println(myFriends.pop()); //김
		System.out.println(myFriends.pop()); //홍
		
		System.out.println(myFriends.pop()); // 더이상 데이터가 없습니다.
		
	}




}
