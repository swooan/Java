package view;

import static util.MyUtil.*;

public class Main extends ViewMain {
	
	@Override
	protected void display() {
		System.out.println("<<<< ��ô ��ī�̵� ���� ����Ʈ >>>>");
		System.out.println("==========================");
		System.out.println("\n���Ͻô� �޴��� �����ϼ���");
		System.out.println("1.���� 2.�¼� Ȯ�� 3.�� ���� ���� 4.���� ���� ���� 5.���� ��� 6.����");
		System.out.print(">>> ");
		int no = scan.nextInt();
		
		request.put("no",no);
	}
	
}
