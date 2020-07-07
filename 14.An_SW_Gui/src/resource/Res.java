package resource;

import java.util.Hashtable;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import controller.DateController;
import controller.DeleteController;
import controller.FinishController;
import controller.OutputController;
import controller.Search2Controller;
import controller.Search3Controller;
import controller.SearchController;
import controller.Seat11Controller;
import controller.Seat12Controller;
import controller.Seat13Controller;
import controller.Seat21Controller;
import controller.Seat22Controller;
import controller.Seat23Controller;
import controller.Seat31Controller;
import controller.Seat32Controller;
import controller.Seat33Controller;
import controller.ShowController;
import controller.TypeController;
import controller.UpdateController;
import model.Dao;
import view.Reservation;

public interface Res {
	
	public Vector<String> dateNames = new Vector<String>();
	public Vector<String> typeNames = new Vector<String>();
	public Vector<String> typeNames2 = new Vector<String>();
	public Vector<String> typeNames3 = new Vector<String>();
	public Vector<String> typeNames4 = new Vector<String>();
//	public DefaultListModel dm1 = new DefaultListModel();
//	public DefaultListModel dm2 = new DefaultListModel();
	public DefaultTableModel dm1 = new DefaultTableModel();
	public DefaultTableModel dm2 = new DefaultTableModel();
	
	public DefaultTableModel dm3 = new DefaultTableModel();
	public DefaultTableModel dm4 = new DefaultTableModel();
	public DefaultTableModel dm5 = new DefaultTableModel();
	
	public Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	JTextField dateField = new JTextField(15);
	JTextField typeField = new JTextField(15);
	
	JTextField nameField = new JTextField(15);
	JTextField date1Field = new JTextField(15);
	JTextField type1Field = new JTextField(15);
	JTextField numField = new JTextField(15);
	
	JTextField name1Field = new JTextField(15);
	JTextField date2Field = new JTextField(15);
	JTextField type2Field = new JTextField(15);
	JTextField num1Field = new JTextField(15);
	
	Controller dateController = new DateController();
	Controller typeController = new TypeController();
	Controller seat11Controller = new Seat11Controller();
	Controller seat12Controller = new Seat12Controller();
	Controller seat13Controller = new Seat13Controller();
	Controller seat21Controller = new Seat21Controller();
	Controller seat22Controller = new Seat22Controller();
	Controller seat23Controller = new Seat23Controller();
	Controller seat31Controller = new Seat31Controller();
	Controller seat32Controller = new Seat32Controller();
	Controller seat33Controller = new Seat33Controller();
	Controller showController = new ShowController();
	Controller outputController = new OutputController();
	Controller searchController = new SearchController();
	Controller updateController = new UpdateController();
	Controller search2Controller = new Search2Controller();
	Controller search3Controller = new Search3Controller();
	Controller deleteController = new DeleteController();
	Controller finishController = new FinishController();
	
	
	Dao dao = new Dao();
}
