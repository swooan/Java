package org.comstudy21.day20.exception_ex;

import static java.lang.System.*;

public class Day20Ex01 {
	public Day20Ex01() {
		// ������ (Constructor)
		except_test();
	}

	public void except_test() {
		out.println("����ó�� ����");

		try {
			String str1 = null;
			System.out.println(str1.toString());
		
		}
		catch (NullPointerException e) {
			out.println("Null Pointer Exception �߻�!");
			out.println(e.getMessage());
			out.println(e.toString());
			e.printStackTrace(); // ���� �߻� ������ ����
		} catch (Exception e) {
			// �θ� ���� ��ü�� �Ʒ��ʿ� catch ���� �����.
			out.println("Exception �߻�.");
		}
		finally {
			out.println("���� �߻� ������ ������� ����Ǵ� finally ��");
			out.println("finally ���� ������ ���");
		}
		out.println("���α׷� ����");
	}

	public static void main(String[] args) {
		new Day20Ex01();
	}
}
