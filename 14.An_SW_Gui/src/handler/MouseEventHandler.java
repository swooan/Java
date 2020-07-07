package handler;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.OutputController;
import resource.Res;
import view.Delete;
import view.Output;
import view.Reservation;
import view.Update;

public class MouseEventHandler implements MouseListener, Res {
	
	Reservation view;
	Output view1;
	Update view2;
	Delete view3;
	
	public static int cnt = -1;
	public static int dcnt = -1;
	public static int num;
	
	public MouseEventHandler(Reservation view) {
		this.view = view;
	}
	
	public MouseEventHandler(Output view1) {
		this.view1 = view1;
	}
	
	public MouseEventHandler(Update view2) {
		this.view2 = view2;
	}
	
	public MouseEventHandler(Delete view3) {
		this.view3 = view3;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable) e.getSource();
			if(view != null && table == view.t1) {
				cnt = view.t1.getSelectedRow();
				
				dateField.setText((String)dm1.getValueAt(cnt, 0));
				
				typeController.service();
				
				
			}
			else if(view != null && table == view.t2) {
				
				dcnt = view.t2.getSelectedRow();
				typeField.setText((String)dm2.getValueAt(dcnt, 0));
				
				view.p4.setVisible(true);
				showController.service();
			}
		}
		if(e.getSource() instanceof JLabel) {
			JLabel seatlabel = (JLabel) e.getSource();
			if(cnt != -1 && dcnt != -1) {
				if(cnt == 0 && dcnt ==0) {
					
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat11Controller.service();
							view.l1.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat11Controller.service();
							view.l2.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat11Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat11Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat11Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat11Controller.service();
							view.l6.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat11Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat11Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat11Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					
				}
				else if(cnt ==0 && dcnt ==1) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat12Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat12Controller.service();
							view.l2.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat12Controller.service();
							view.l3.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat12Controller.service();
							view.l4.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat12Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat12Controller.service();
							view.l6.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat12Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat12Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat12Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==0 && dcnt ==2) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat13Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat13Controller.service();
							view.l2.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat13Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat13Controller.service();
							view.l4.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat13Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat13Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat13Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat13Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat13Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==1 && dcnt ==0) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat21Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat21Controller.service();
							view.l2.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat21Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat21Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat21Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat21Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat21Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat21Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat21Controller.service();
							view.l9.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==1 && dcnt ==1) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat22Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat22Controller.service();
							view.l2.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat22Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat22Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat22Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat22Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat22Controller.service();
							view.l7.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat22Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat22Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==1 && dcnt ==2) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat23Controller.service();
							view.l1.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat23Controller.service();
							view.l2.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat23Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat23Controller.service();
							view.l4.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat23Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat23Controller.service();
							view.l6.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat23Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat23Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat23Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==2 && dcnt ==0) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat31Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat31Controller.service();
							view.l2.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat31Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat31Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat31Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat31Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat31Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat31Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat31Controller.service();
							view.l9.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==2 && dcnt ==1) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat32Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat32Controller.service();
							view.l2.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat32Controller.service();
							view.l3.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat32Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat32Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat32Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat32Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat32Controller.service();
							view.l8.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat32Controller.service();
							view.l9.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				else if(cnt ==2 && dcnt ==2) {
					if(seatlabel == view.l1) {
						if(view.l1.getIcon() == view.white.getIcon()) {
							num = 1;
							seat33Controller.service();
							view.l1.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l1.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l2) {
						
						if(view.l2.getIcon() == view.white.getIcon()) {
							num = 2;
							seat33Controller.service();
							view.l2.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l2.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l3) {
						
						if(view.l3.getIcon() == view.white.getIcon()) {
							num = 3;
							seat33Controller.service();
							view.l3.setIcon(view.black.getIcon());		
							view.dispose();
						}
						else if (view.l3.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l4) {
						
						if(view.l4.getIcon() == view.white.getIcon()) {
							num = 4;
							seat33Controller.service();
							view.l4.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l4.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l5) {
						
						if(view.l5.getIcon() == view.white.getIcon()) {
							num = 5;
							seat33Controller.service();
							view.l5.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l5.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l6) {
						
						if(view.l6.getIcon() == view.white.getIcon()) {
							num = 6;
							seat33Controller.service();
							view.l6.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l6.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l7) {
						
						if(view.l7.getIcon() == view.white.getIcon()) {
							num = 7;
							seat33Controller.service();
							view.l7.setIcon(view.black.getIcon());	
							view.dispose();
						}
						else if (view.l7.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l8) {
						
						if(view.l8.getIcon() == view.white.getIcon()) {
							num = 8;
							seat33Controller.service();
							view.l8.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l8.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
					if(seatlabel == view.l9) {
						
						if(view.l9.getIcon() == view.white.getIcon()) {
							num = 9;
							seat33Controller.service();
							view.l9.setIcon(view.black.getIcon());
							view.dispose();
						}
						else if (view.l9.getIcon() == view.black.getIcon()) {
							JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다.");
						}
					}
				}
				
			}

		}
		
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable) e.getSource();
			if(view1 != null && table == view1.t1) {
				cnt = view1.t1.getSelectedRow();
				
				dateField.setText((String)dm1.getValueAt(cnt, 0));
				
				typeController.service();
				
				
			}
			else if(view1 != null && table == view1.t2) {
				
				dcnt = view1.t2.getSelectedRow();
				typeField.setText((String)dm2.getValueAt(dcnt, 0));
				
				view1.p4.setVisible(true);
				
				outputController.service();
			}
		}
		
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable) e.getSource();
			if(view2 != null && table == view2.t1) {
				int row = table.getSelectedRow();
				
				nameField.setText((String)dm4.getValueAt(row, 0));
				date1Field.setText((String)dm4.getValueAt(row, 1));
				type1Field.setText((String)dm4.getValueAt(row, 2));
				numField.setText(dm4.getValueAt(row, 3).toString());
				
				updateController.service();
				
				view2.dispose();
			}
			
		}
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable) e.getSource();
			if(view3 != null && table == view3.t1) {
				int row = table.getSelectedRow();
				
				name1Field.setText((String)dm5.getValueAt(row, 0));
				date2Field.setText((String)dm5.getValueAt(row, 1));
				type2Field.setText((String)dm5.getValueAt(row, 2));
				num1Field.setText(dm5.getValueAt(row, 3).toString());
				
				view3.b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						deleteController.service();
						JOptionPane.showMessageDialog(null, "예약이 취소되었습니다.");
						view3.dispose();												
					}
				});
				
				view3.b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						view3.dispose();
						
					}
				});
			}
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
}
