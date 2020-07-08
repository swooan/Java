package org.comstudy21.day14_1;

import org.comstudy21.day14_1_student.Student;

//학생 클래스를 확장한 근로학생(급여, 소속) 클래스를 선언한다.

public class StudentSub extends Student {
	protected int pay;
	
	public StudentSub() {
		this(0,"",0);
	}
	
	public StudentSub(int no, String name, int pay) {
		super(no,name);
		this.pay = pay;
		
	}
	
	public String toString() {
		return "번호 : " + no + ", 이름 : " + name + ", 급여 : " + pay;
	}
	
}
