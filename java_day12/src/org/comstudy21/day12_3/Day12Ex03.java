package org.comstudy21.day12_3;
// 1. 클래스 선언

// 과제 : 전화번호부 입출력 프로그램
// 입력 출력 검색 수정 삭제 종료
// 번호 이름 전화번호 주소
// 최대 100개
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
		//people 배열타입으로 선언
		People[] pArr;
		pArr = new People[3];
		
		String[] names = {"김유신","이순신","강감찬"};
		String[] phones = {"010-1111-1111","010-2222-2222","010-3333-3333"};
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new People();
			pArr[i].setNo((i+1)*10);
			pArr[i].setName(names[i]);
			pArr[i].setPhone(phones[i]);
			
		}
		
		// 배열에 People 객체 생성
//		pArr[0] = new People();
//		pArr[0].setNo(10);
//		pArr[0].setName("이순신");
//		pArr[0].setPhone("010-1111-1111");
//
//		pArr[1] = new People();
//		pArr[1].setNo(20);
//		pArr[1].setName("강감찬");
//		pArr[1].setPhone("010-2222-2222");
//		
//		pArr[2] = new People();
//		pArr[2].setNo(30);
//		pArr[2].setName("을지문덕");
//		pArr[2].setPhone("010-3333-3333");
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getNo());
			System.out.println(pArr[i].getName());
			System.out.println(pArr[i].getPhone());
			System.out.println();
		}
	}
	
	public static void test(String[] args) {
		// 2. 참조변수 선언
		People person;
		// 3. 객체 생성
		person = new People();

		// 4. 멤버 필드에 값 넣기
		person.setNo(100);
		person.setName("홍길동");
		person.setPhone("010-1121-1111");
		// 5. 멤버 필드에 접근
		System.out.println(person.getNo() + " / " + person.getName() + " / " + person.getPhone());
	}

}
