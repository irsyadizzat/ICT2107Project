package group;

import java.util.ArrayList;

import user.User;

public class Group {
	
	public String name;
	private ArrayList<User> usersInGroup;
	
	public Group(){
		
	}
	
	public void registerGroup(){
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		name.toLowerCase().trim();
		this.name = name;
	}
}
