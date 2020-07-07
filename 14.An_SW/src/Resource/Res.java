package Resource;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.Baseball2Controller;
import model.Baseball2Dao;
import model.Baseball2Dto;
import view.*;

public interface Res {
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	Baseball2View[] views = {new Baseball2Menu(), new Baseball2Reservation(), new Baseball2ShowAll(), new Baseball2MyInfo(), new Baseball2Change(), new Baseball2Cancel(), new Baseball2Exit()};
	
	ArrayList<Baseball2Dto> dtoList11 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList12 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList13 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList21 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList22 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList23 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList31 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList32 = new ArrayList<Baseball2Dto>();
	ArrayList<Baseball2Dto> dtoList33 = new ArrayList<Baseball2Dto>();
	
	Baseball2Controller controller = new Baseball2Controller();

	Baseball2Dao dao = new Baseball2Dao();
}
