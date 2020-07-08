package org.comstudy21.day23_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Day23Ex06 extends MyFrame {
	// ������ ������ - �ι��۾����� �ʴ´� ( ��ӵ� �̿�)
	// Is A �����̱� ������ �� Ŭ������ MyFrame Ŭ�����̴�
	public Day23Ex06() {
		this("default window", 100, 200);

	}
	
	
	
	public Day23Ex06(String title, int w, int h) {
		// �θ��� ������ ȣ��
		super(title, w, h);
		
		//���̾ƿ� ������ �̰�����
		initLayout();
		
		// MyFrame ���� setVisible() ������ ����.
		// setVisible() �� ��� ���� �Ŀ� �������� ȣ��
		setVisible(true);
	}
	
	private void initLayout() {
		// FlowLayout���� ���̾ƿ� ����
		//this.setLayout(new GridLayout(3,2));
		// Frame�� ����Ʈ ��ġ �����ڴ� BorderLayout()
		
//		this.add(new Button("BTN1"),"North");
//		this.add(new Button("BTN2"),"South");
//		this.add(new Button("BTN3"),"West");
//		this.add(new Button("BTN4"),"East");
//		this.add(new Button("BTN5"),"Center");
		
		this.add(new Button("BTN1"),BorderLayout.NORTH);
		this.add(new Button("BTN2"),BorderLayout.SOUTH);
		this.add(new Button("BTN3"),BorderLayout.WEST);
		this.add(new Button("BTN4"),BorderLayout.EAST);
		this.add(new Button("BTN5"),BorderLayout.CENTER);
		}

	public static void main(String[] args) {
		//��ü�����ϸ� Frame�� �����ȴ�.
		new Day23Ex06("���̾ƿ� �Ŵ��� ����", 1920, 1080);
		
	}
	
}
