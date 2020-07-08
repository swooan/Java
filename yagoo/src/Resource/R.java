package Resource;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.YagooController;
import model.Dao;
import model.Dto;
import view.*;

public interface R {
	Hashtable<String, Object> request = new Hashtable<String, Object>();

	YagooView[] views = {new Menu(), new Act(), new Record(), new Result(), new End(), new Opening()}; 
	
//	YagooView m0 = new Menu();
//	YagooView m1 = new Act();
//	YagooView m2 = new Record();
//	YagooView m3 = new Result();
//	YagooView m4 = new End();
	
	ArrayList<Dto> nums = new ArrayList<Dto>();
	ArrayList<Dto> sb = new ArrayList<Dto>();
	
	YagooController controller = new YagooController();
	
	Dao dao = new Dao();
}
