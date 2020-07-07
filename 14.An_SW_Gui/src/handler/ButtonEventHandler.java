package handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import resource.Res;
import view.AppMain;
import view.Delete;
import view.Finish;
import view.Search;
import view.Output;
import view.Reservation;
import view.Update;

public class ButtonEventHandler implements ActionListener, Res {
	
	AppMain view;
	
	public ButtonEventHandler(AppMain view) {
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == view.btn1) {
				new Reservation();
			}
			else if(btn == view.btn2) {
				new Output();
			}
			else if(btn == view.btn3) {
				new Search();
			}
			else if(btn == view.btn4) {
				new Update();
			}
			else if(btn == view.btn5) {
				new Delete();
			}
			else if(btn == view.btn6) {
				new Finish();		
			}
		}
		
	}

}
