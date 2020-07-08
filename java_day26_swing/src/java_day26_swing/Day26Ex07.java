package java_day26_swing;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Day26Ex07 extends JFrame {
	
	JPanel content;
	
	public Day26Ex07() {
		content = (JPanel)getContentPane();
		
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		
		Vector<String> v1 = new Vector<String>();
		v1.add("ȫ�浿");
		v1.add("010-1111-1111");
		v1.add("����� ���� ���ϵ�");
		data.add(v1);
		
		Vector<String> v2 = new Vector<String>();
		v2.add("ȫ�浿");
		v2.add("010-1111-1111");
		v2.add("����� ���� ���ϵ�");
		data.add(v2);
		
		Vector<String> v3 = new Vector<String>();
		v3.add("ȫ�浿");
		v3.add("010-1111-1111");
		v3.add("����� ���� ���ϵ�");
		data.add(v3);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("����");
		columnNames.add("��ȭ��ȣ");
		columnNames.add("�ּ�");
		
		
		TableModel dm = new DefaultTableModel(data,columnNames);
		JTable table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		content.add(scrollPane);
		
		Vector<String> newData = new Vector<String>();
		newData.add("������");
		newData.add("010-2222-2222");
		newData.add("����� ���α� ��ö��");
		data.add(newData);
		
		setSize(1028,720);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day26Ex07();
	}

}
