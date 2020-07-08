package org.comstudy21.day20.exception_ex;

public class Day20Ex03 {
	public static void exceptEx() throws Exception {
		System.out.println(">>> 예외 발생 함수");
		try {
			throw new Exception("강제로 예외 발생!");			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("예외처리 함수 호출 전");
		exceptEx();
		System.out.println("예외처리 함수 호출 후");
	}
}
