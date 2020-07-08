package org.comstudy21.day29;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ImageIconEx extends JFrame {
	JRadioButton[] radio = new JRadioButton[3];
	String[] text = { "�����~", "�� ��?", "�쿡~~~~~~" };
	ImageIcon[] image = { new ImageIcon("images/����1.png"), new ImageIcon("images/����2.PNG"),
			new ImageIcon("images/����3.PNG") };
	JPanel content;
	JLabel imageLabel = new JLabel();
	JTextField txtField = new JTextField(12);
	JButton okBtn = new JButton("Ȯ��");

	public ImageIconEx() {
		setTitle("�̹��� �󺧰� ���� ��ư ����");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		content = (JPanel) getContentPane();
		content.setLayout(new BorderLayout());

		// ���� �г��� ���� ���� ��ư ���̱�
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.DARK_GRAY);

		// ���� ��ư�� ��ư �׷��� ���� ���δ�.
		ButtonGroup btnGroup = new ButtonGroup();
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			btnGroup.add(radio[i]);
			radioPanel.add(radio[i]);

			radio[i].addItemListener(new MyItemListener());
		}

		radio[0].setSelected(true);

		content.add(radioPanel, new BorderLayout().NORTH);

		imageLabel.setIcon(image[0]);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		content.add(imageLabel);

		JPanel txtFieldPane = new JPanel();
		txtFieldPane.add(txtField);
		txtFieldPane.add(okBtn);

		BtnListener btnListener = new BtnListener();
		okBtn.addActionListener(btnListener);

		content.add(txtFieldPane, new BorderLayout().SOUTH);

		setSize(1028, 720);
		
		txtField.addKeyListener(new KeyListener());
	}

	// ���� ��ư �̺�Ʈ �ڵ鷯 Ŭ���� ����
	class MyItemListener implements ItemListener {

		// ���� ��ư�� �̺�Ʈ �߻��ϸ� ����Ǵ� �޼ҵ�
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return; // ������ radio ��ư�� ���ؼ��� �ٷ� ���� ����
			}
			if (radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if (radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else if (radio[2].isSelected())
				imageLabel.setIcon(image[2]);
			else
				imageLabel.setIcon(image[0]);
		}

	}

	class BtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < image.length; i++) {
				if (txtField.getText().equals(text[i])) {
					radio[i].setSelected(true);
					imageLabel.setIcon(image[i]);
					txtField.setText("");
				}

			}

		}

	}
	
	class KeyListener extends KeyAdapter {
		public KeyListener() {}
			
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				// Ʈ���� �߻�
				okBtn.doClick();
			}
		}
		
	}

	public static void main(String[] args) {
		new ImageIconEx().setVisible(true);
	}

}
