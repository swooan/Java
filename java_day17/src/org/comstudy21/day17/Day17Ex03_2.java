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
			System.out.println("더 이상 추가하실 수 없습니다.");
			return;
		}
		else {
			pArr[top] = people;
			top ++;			
		}
		
	}
	
	People1 pop() {
		
		if (top -1 < 0) {
			System.out.println("더이상 데이터가 없습니다.");
		}
		
		return pArr[--top];
		
	}
	
	
	public static void main(String[] args) {
		
	
	Day17Ex03_2 myFriends = new Day17Ex03_2();
	
	
	myFriends.push(new People1("홍길동","010-1111"));
	myFriends.push(new People1("김길동","010-1111"));
	myFriends.push(new People1("이길동","010-1111"));
	myFriends.push(new People1("박길동","010-1111"));
	myFriends.push(new People1("최길동","010-1111"));

	myFriends.push(new People1("안길동","010-1111")); // 더이상 입력 불가
	
	System.out.println(myFriends.pop()); //"최길동"
	System.out.println(myFriends.pop()); //박
	System.out.println(myFriends.pop()); //이
	System.out.println(myFriends.pop()); //김
	System.out.println(myFriends.pop()); //홍
	
	System.out.println(myFriends.pop()); // 더이상 데이터가 없습니다.
	}	

}
