package java_day26_swing;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Day26Ex06 extends JFrame implements ListSelectionListener{
	JList list;
	JTextField tf;
	
	public Day26Ex06() {
		String[] str = {"���", "���弭��", "����", "����", "����", "��ȭ"};
		list = new JList(str);
		
		add(new Label("��̸� �����Ͻÿ�"),BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		
		tf = new JTextField();
		add(tf,BorderLayout.SOUTH);
		
		list.addListSelectionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// ���õ� �׸���� ������ �迭 ����
		Object[] item;
		// ���õ� �׸���� �����Ͽ� ������ String ��ü ����
		String total="";
		
		JList li = (JList)e.getSource();
		// ���� ���õ� �׸��� �迭 ���·� ��� ��
		item = li.getSelectedValues();
		for(int i=0; i < item.length; i++) {
			total = total + item[i] + " ";
			// ���õ� �׸���� ����
			
			//���õ� �׸��� �ؽ�Ʈ �ʵ忡 ����ϱ�
			tf.setText(total + "(��)�� ���õǾ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new Day26Ex06();
	}

	
}
