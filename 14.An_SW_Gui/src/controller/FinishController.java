package controller;

import model.Dao;

public class FinishController implements Controller {

	@Override
	public void service() {
		Dao dao = new Dao();
		
		dao.finish();
		
	}
	
}
