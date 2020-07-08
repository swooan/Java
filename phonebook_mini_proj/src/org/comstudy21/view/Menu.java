package org.comstudy21.view;

import static org.comstudy21.util.MyUtil.*;
import static java.lang.System.*;

public class Menu extends MyView {

	@Override
	public void display() {
		for(int i = 1; i <= END; i++) {
			out.print(i + "." + items[i] + " ");
		}
		
		int no = 0;
		do {
			out.print("\n Choice >>> ");
			no = getNum();			
		}
		while(no < INPUT || no > END);
		
		// Res의 request에 no를 저장하고 다시 controller로 돌아간다.
		request.put("no", no);
	}
	
}
