package org.comstudy21;

import java.util.HashSet;

public class TestEx01 {
	public static void main(String[] args) {
		HashSet<Member> memberSet = new HashSet<Member>();
		
		Member mem1 = new Member("KIM", 23, "010-1111-1111");
		Member mem2 = new Member("KIM", 23, "010-1111-1111");
		
		memberSet.add(mem1);
		memberSet.add(mem2);
		
		// 같은 데이터지만 중복처리가 될까?? => ㄴㄴ (다른 클래스를 경유해서 가져온 해쉬셋은 해쉬코드값을 비교하기 때문에 서로 다르다고 인식.) 해쉬코드와 equals를 재정의 해야한다.
		
		// 1. 경유해야될 클래스에서 해쉬코드와 .equals를 오버라이드
		
		// 해쉬코드 오버라이드 부분 : public int hashcode()
		//						return (a+b+...).hashCode();
		
		// .equals 오버라이드 부분 : public boolean equals(Object obj) {
		//						if(obj instanceof 클래스이름) {
		//						클래스이름 tmp = (클래스이름)obj;
		//						return a.equals(tmp.a) && b == tmp.b && ... }
		//						return false
		
		// - hashCode()를 호출해도 동일한 int 값을 반환해야한다.
		// - equals 메소드를 이용한 비교에 의해서 true를 얻은 객체들에 대해 각각 hashCode를 호출해서 얻은 결과가 같아야한다.
		// - equals 메소드를 호출했을 때 false를 반환하는 두 객체는 
		
		System.out.println("memberSet size => " + memberSet.size()); // => 1이 나오게
		
		System.out.println(mem1.equals(mem2)); // => true 가 되게
		
		System.out.println(mem1);
		System.out.println(mem2);
		System.out.println(memberSet);
	}
}
