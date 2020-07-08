package org.comstudy21.day23_2;

import java.awt.Button;
import java.awt.FlowLayout;

public class Day23Ex04 extends MyFrame {
	// ������ ������ - �ι��۾����� �ʴ´� ( ��ӵ� �̿�)
	// Is A �����̱� ������ �� Ŭ������ MyFrame Ŭ�����̴�
	public Day23Ex04() {
		this("default window", 100, 200);

	}
	
	
	
	public Day23Ex04(String title, int w, int h) {
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
		this.setLayout(new FlowLayout());
		this.add(new Button("BTN1"));
		this.add(new Button("BTN2"));
		this.add(new Button("BTN3"));
		this.add(new Button("BTN4"));
		this.add(new Button("BTN5"));
		this.add(new Button("BTN6"));
		}

	public static void main(String[] args) {
		//��ü�����ϸ� Frame�� �����ȴ�.
		new Day23Ex04("���̾ƿ� �Ŵ��� ����", 1920, 1080);
		
	}
	
}
