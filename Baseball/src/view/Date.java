package view;

import static util.MyUtil.*;

import resource.Res;

public class Date implements Res {
	
	static void days() {
		
		System.out.println("���Ͻô� ��¥�� �������ּ���~");
		System.out.println("--------------------");
		System.out.println("1. 5�� 26��");
		System.out.println("2. 5�� 27��");
		System.out.println("3. 5�� 28��");
		System.out.print(">>> ");
		int dateNo = scan.nextInt();
		
		if(dateNo < 1 || dateNo >3) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			days();
		}
		else {
			
		request.put("dateNo", dateNo);
		
		}
	}
	
}
