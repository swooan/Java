package org.comstudy21.day14_2;

class �Һ� {
	void ����() {
		System.out.println("�Һ��� ���� ��~~~");
	}
}

class �ƺ� extends �Һ�{
	void ����() {
		System.out.println("�ƺ��� ���� �ͻͻ�~");
	}
}

class ���� extends �ƺ� {
	void ����( ) {
		System.out.println("������ ���� �߸���~");
	}
	void ��Ÿ() {
		System.out.println("������ ��Ÿ �򰡶�~");
	}
}

public class Day14Ex04 {

	public static void main(String[] args) {
		�Һ� h = new �Һ�();
		h.����();
		
		// h = �� �Һ��� h�� �ƺ��� ���ڸ� �ҷ��� �� ����. 
		
		�Һ� h1 = new �ƺ�(); // ���� ��ü�� �ƺ��̹Ƿ� �ƺ��� ����
		h1.����();
		
		�ƺ� a = (�ƺ�)h1;
		
		// ���� h2 = new �ƺ�(); => �ڽ��� �θ��� ��ü�� �ҷ��� �� ����.
		
		�Һ� h2 = new ����();
		h2.����();
		//h2.��Ÿ(); => �ҹ迡 ��Ÿ�� ��� �ҷ��� �� ����. => �ٿ�ĳ���� �ʿ�
		// �ٿ�ĳ���� - �θ� ���� �ڽĿ��� �ִ� ��� ����
		((����)h2).��Ÿ();
		

	}

}
