package View;

import Model.Dto;

public class Create extends Myview{
	@Override
	public void run() {
		System.out.print("날짜?: ");
		int date=scan.nextInt();
		System.out.print("타입?: ");
		int type=scan.nextInt();
		System.out.print("행?: ");
		int row=scan.nextInt();
		System.out.print("열?: ");
		int col=scan.nextInt();
		System.out.println("이름?: ");
		String name=scan.next();
		
		request.put("dto",new Dto(date,type,row,col,name));
	}
	
}
