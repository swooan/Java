package org.comstudy21.day14_1;

import org.comstudy21.day14_1_student.Student;

//�л� Ŭ������ Ȯ���� �ٷ��л�(�޿�, �Ҽ�) Ŭ������ �����Ѵ�.

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
		return "��ȣ : " + no + ", �̸� : " + name + ", �޿� : " + pay;
	}
	
}
