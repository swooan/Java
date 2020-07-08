package org.comstudy21.day14_1;
// 학생 클래스를 만든다 (학번, 이름, 전공)


public class Day14Ex02 {
	public static void main(String[] args) {
		// 근로학생 클래스를 이용한 객체 선언
		// 값을 넣고 출력한다.
		
		StudentSub s1 = new StudentSub(100, "홍길동", 300);
		
//		s1.no = 201054682;
//		s1.name = "park";
//		s1.pay = 2000000;
//				
//		s1.showStudent();
		
		System.out.println(s1);
		
		StudentSub s2 = new StudentSub(102, "김유신", 200);
		
		System.out.println(s2.toString());
	}
}
