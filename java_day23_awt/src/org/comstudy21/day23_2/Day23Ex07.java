package org.comstudy21.day23_2;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;

public class Day23Ex07 extends MyFrame {
	// �ʵ�� ���۳�Ʈ�� �����ؾ� ��� ������� ���� ����
	Label label = new Label("GridBagLayout");
	
	public Day23Ex07() {
		//GridBagLayout �ǽ� - ȭ���� �� ����뿡 ��ġ�ȴ�.
		setLayout(new GridBagLayout());
		
		add(label);
		add(new Button("OK"));
		add(new Button("Hello"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Ex07();
	}

}
