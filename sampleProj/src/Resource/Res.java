package Resource;
import java.util.Hashtable;
import java.util.Scanner;

import Model.*;
import View.*;

public interface Res {
	Scanner scan=new Scanner(System.in);
	String[] menu= {"����","����"};
	
	Dao dao=new Dao();
	Myview[] views= {new Create(), new View()};
	Hashtable<String, Object> request=new Hashtable<String, Object>();

}
