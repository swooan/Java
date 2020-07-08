package org.comstudy21.day23;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day23Ex03 extends Frame {

	public Day23Ex03() {
		init();
		
		//Window Adapter �� �̿��Ͽ� �͸� Ŭ���� Ȱ��
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			// WindowAdapter�� �߻� Ŭ���� => �޼ҵ� �������̵�(������) �Ѵ�.
			
		});
	}
	
	private void init() {
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day23Ex03();
	}
	
}
