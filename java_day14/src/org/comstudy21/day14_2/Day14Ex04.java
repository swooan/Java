package org.comstudy21.day14_2;

class 할베 {
	void 나팔() {
		System.out.println("할베의 나팔 뿡~~~");
	}
}

class 아베 extends 할베{
	void 나팔() {
		System.out.println("아베의 나팔 뽕뽕뽕~");
	}
}

class 손자 extends 아베 {
	void 나팔( ) {
		System.out.println("손자의 나팔 삐리리~");
	}
	void 기타() {
		System.out.println("손자의 기타 띵가띵가~");
	}
}

public class Day14Ex04 {

	public static void main(String[] args) {
		할베 h = new 할베();
		h.나팔();
		
		// h = 가 할베면 h로 아베나 손자를 불러올 수 없다. 
		
		할베 h1 = new 아베(); // 실제 객체가 아베이므로 아베의 나팔
		h1.나팔();
		
		아베 a = (아베)h1;
		
		// 손자 h2 = new 아베(); => 자식은 부모의 객체를 불러올 수 없다.
		
		할베 h2 = new 손자();
		h2.나팔();
		//h2.기타(); => 할배에 기타가 없어서 불러올 수 없다. => 다운캐스팅 필요
		// 다운캐스팅 - 부모에 없고 자식에만 있는 멤버 접근
		((손자)h2).기타();
		

	}

}
