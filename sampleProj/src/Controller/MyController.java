package Controller;

import Model.Dto;
import Resource.Res;

public class MyController implements Res{
	public void service() {
		for(int i=0;i<menu.length;i++) {
			System.out.printf("(%d) %s",i+1,menu[i]);
		}
		System.out.println();
		System.out.print("예약할래 : ");
		int m=scan.nextInt();
		
		if(m==1) {
			views[m-1].run();
			Dto dto=(Dto)request.get("dto");
			dao.insert(dto);
			System.out.println("입력완료");
		}
		System.out.println();
		System.out.print("볼래 : ");
		m=scan.nextInt();
		if(m==2) {
			int date=1;
			int type=1;
			for(int i=0;i<dao.total[date][type].length;i++) {
				for(int j=0;j<dao.total[date][type][i].length;j++) {
					String name=dao.view(date,type,i,j);
					if (name==null) name="-----";
					request.put("name",name);
					views[1].run();
				}
				System.out.println();
			}
			
		}
	}
	
	

}
