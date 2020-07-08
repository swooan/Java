package view;

public class Opening extends YagooView{

	@Override
	protected void display() {
		System.out.println("야구 게임을 시작합니다.\n");
		System.out.println("네자리 숫자가 입력되었습니다.");
		System.out.println("------------------------------------");
		
		request.put("n", -1);
	}

}
