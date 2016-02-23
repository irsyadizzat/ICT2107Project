package user;

import java.util.ArrayList;

import group.Group;

public class User {
	
	private String name;
	private ArrayList<User> friendList;
	
	
	public User(){
		
	}

	public void addFriend(User user){
		//adds a friend
	}
	
	public void registerUser(){
		//registers name
	}
	
	public void createGroup(){
		//create a group
		//adds friend at same time
	}
	
	public void privateMesage(){
		//unicast to friend from friend list/
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		name.toLowerCase().trim();
		this.name = name;
	}
}
