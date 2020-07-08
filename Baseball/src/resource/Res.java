package resource;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.BaseballController;
import model.BaseballDao;
import model.BaseballDto;
import view.*;

public interface Res {
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	ViewMain[] views = {new Main(), new Reservation(), new Output(), new Search(), new Fix(), new Cancel(), new Finish()};
	
	ArrayList<BaseballDto> dtoList11 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList12 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList13 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList21 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList22 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList23 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList31 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList32 = new ArrayList<BaseballDto>();
	ArrayList<BaseballDto> dtoList33 = new ArrayList<BaseballDto>();
	
//	BaseballDao dao = new BaseballDao(dtoList11,dtoList12,dtoList13,dtoList21,dtoList22,dtoList23,dtoList31,dtoList32,dtoList33);

	BaseballController controller = new BaseballController();

	BaseballDao dao = new BaseballDao();

}
