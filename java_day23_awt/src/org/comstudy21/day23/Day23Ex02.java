package org.comstudy21.day23;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Day23Ex02 extends Frame implements WindowListener{
	
	public Day23Ex02() {
		// this. ����
		setSize(640, 480);
		setBackground(Color.MAGENTA);
		setVisible(true);
		
		this.addWindowListener(this); // ������ â�� ���õ� �̺�Ʈ�� �����ϴ� ����
	}

	// �ݱ� ��ư�� �̺�Ʈ ����
	// �̺�Ʈ �������̽��� ��ӹޱ� -> �߻� �޼ҵ� ����
	
	
	public static void main(String[] args) {
		Frame window = new Day23Ex02();
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �ݱ� ��ư�� ����");
		dispose();
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
