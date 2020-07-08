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
	String[] text = { "갸우뚱~", "뭘 봐?", "헤에~~~~~~" };
	ImageIcon[] image = { new ImageIcon("images/포메1.png"), new ImageIcon("images/포메2.PNG"),
			new ImageIcon("images/포메3.PNG") };
	JPanel content;
	JLabel imageLabel = new JLabel();
	JTextField txtField = new JTextField(12);
	JButton okBtn = new JButton("확인");

	public ImageIconEx() {
		setTitle("이미지 라벨과 라디오 버튼 예제");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		content = (JPanel) getContentPane();
		content.setLayout(new BorderLayout());

		// 라디오 패널을 만들어서 라디오 버튼 붙이기
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.DARK_GRAY);

		// 라디오 버튼은 버튼 그룹을 만들어서 붙인다.
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

	// 라디오 버튼 이벤트 핸들러 클래스 선언
	class MyItemListener implements ItemListener {

		// 라디오 버튼에 이벤트 발생하면 실행되는 메소드
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return; // 해제된 radio 버튼에 대해서는 바로 실행 종료
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
				// 트리거 발생
				okBtn.doClick();
			}
		}
		
	}

	public static void main(String[] args) {
		new ImageIconEx().setVisible(true);
	}

}
