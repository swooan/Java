package controller;

import model.Dto;

public class DeleteController implements Controller {

	@Override
	public void service() {
		String name = name1Field.getText();
		String date = date2Field.getText();
		String type = type2Field.getText();
		int num = Integer.parseInt(num1Field.getText());
		
		Dto dto = new Dto(name, date, type, num, null);
		
		dao.delete(dto);

	}

}
