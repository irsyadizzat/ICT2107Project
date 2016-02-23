package groupchat;
import network.Listener;

import java.awt.EventQueue;

import javax.swing.JFrame;

import group.Group;
import user.User;


public class Facade {


	private Listener listener;
	
	public Facade(){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					listener = new Listener(frame);
					listener.startListening();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
}
