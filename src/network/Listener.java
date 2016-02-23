package network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JFrame;

import settings.CONSTANTS;

import group.Group;
import groupchat.GUI;
import user.User;


public class Listener implements Runnable{
	
	private InetAddress multicastGroupHost = null;
	private MulticastSocket multicastSocket = null;
	private ArrayList<User> registeredUsers;
	private ArrayList<Group> registeredGroups;
	private Thread t;
	private String threadName = "listener";
	private GUI mainFrame;
	
	public Listener(GUI frame){
		mainFrame = frame;
		try {
			multicastGroupHost = InetAddress.getByName(CONSTANTS.MULTICAST_IP);
			multicastSocket = new MulticastSocket(CONSTANTS.MULTICAST_PORT);
			multicastSocket.joinGroup(multicastGroupHost);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in Listener Class");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in Listener Class");
			e.printStackTrace();
		}
		
	}
	
	public void startListening(){
		//listen on mc_grp
		 System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	
	
	public boolean userExists(){
		//check if user registered on arraylist
		return false;
	}
	
	public boolean groupExists(){
		//check if group registered on arraylist
		
		return false;
	}

	@Override
	public void run() {
		

	    DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

		mainFrame.getTxtChat().append("Waiting for a multicast message...");
		
	}
}
