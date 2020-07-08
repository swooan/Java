package org.comstudy21;

import java.util.HashSet;

public class TestEx01 {
	public static void main(String[] args) {
		HashSet<Member> memberSet = new HashSet<Member>();
		
		Member mem1 = new Member("KIM", 23, "010-1111-1111");
		Member mem2 = new Member("KIM", 23, "010-1111-1111");
		
		memberSet.add(mem1);
		memberSet.add(mem2);
		
		// ���� ���������� �ߺ�ó���� �ɱ�?? => ���� (�ٸ� Ŭ������ �����ؼ� ������ �ؽ����� �ؽ��ڵ尪�� ���ϱ� ������ ���� �ٸ��ٰ� �ν�.) �ؽ��ڵ�� equals�� ������ �ؾ��Ѵ�.
		
		// 1. �����ؾߵ� Ŭ�������� �ؽ��ڵ�� .equals�� �������̵�
		
		// �ؽ��ڵ� �������̵� �κ� : public int hashcode()
		//						return (a+b+...).hashCode();
		
		// .equals �������̵� �κ� : public boolean equals(Object obj) {
		//						if(obj instanceof Ŭ�����̸�) {
		//						Ŭ�����̸� tmp = (Ŭ�����̸�)obj;
		//						return a.equals(tmp.a) && b == tmp.b && ... }
		//						return false
		
		// - hashCode()�� ȣ���ص� ������ int ���� ��ȯ�ؾ��Ѵ�.
		// - equals �޼ҵ带 �̿��� �񱳿� ���ؼ� true�� ���� ��ü�鿡 ���� ���� hashCode�� ȣ���ؼ� ���� ����� ���ƾ��Ѵ�.
		// - equals �޼ҵ带 ȣ������ �� false�� ��ȯ�ϴ� �� ��ü�� 
		
		System.out.println("memberSet size => " + memberSet.size()); // => 1�� ������
		
		System.out.println(mem1.equals(mem2)); // => true �� �ǰ�
		
		System.out.println(mem1);
		System.out.println(mem2);
		System.out.println(memberSet);
	}
}
