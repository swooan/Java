package view;

import resource.Res;
import static util.MyUtil.*;

public class Type implements Res {
	
	static void timeTi() {
		System.out.println("�¼� ������ ����ּ���.");
		System.out.println("1.���� 1�缮 2.���� 3�缮 3.�ܾ߼�");
		System.out.print(">>> ");
		int type1 = scan.nextInt();
		
		request.put("type1",type1);
	
	}
	
	static void timeLo() {
		System.out.println("�ð��� ����ּ���.");
		System.out.println("1.4�� �Ϲݼ� 2.�߾� ���̺� 3.�ܾ߼�");
		System.out.print(">>> ");
		int type2 = scan.nextInt();
		
		request.put("type2",type2);
	}
	
	static void timeTa() {
		System.out.println("�ð��� ����ּ���.");
		System.out.println("1.���ǵ� 2.��ũ���ǵ� 3.�ξ���̾Ƽ�");
		System.out.print(">>> ");
		int type3 = scan.nextInt();
		
		request.put("type3",type3);
	}

}
