package View;

import Model.Dto;

public class Create extends Myview{
	@Override
	public void run() {
		System.out.print("��¥?: ");
		int date=scan.nextInt();
		System.out.print("Ÿ��?: ");
		int type=scan.nextInt();
		System.out.print("��?: ");
		int row=scan.nextInt();
		System.out.print("��?: ");
		int col=scan.nextInt();
		System.out.println("�̸�?: ");
		String name=scan.next();
		
		request.put("dto",new Dto(date,type,row,col,name));
	}
	
}
