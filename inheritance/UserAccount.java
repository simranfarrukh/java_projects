package com.farrukhsimran.inheritance;

public abstract class UserAccount {
	private String username, password, fullName;
	
	//Constructor
	UserAccount(String username, String password, String fullName){
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		}
	

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public boolean changePassword(String newPass, String confirmPass) {
		if (newPass == confirmPass) {
			password = newPass;
			return true;
		}
		System.out.println(false);
		return false; 
	}
	
	public abstract void accessWebsite();	
	
	@Override
	public String toString() {
		return "User Details: \n" + 
	 username + "\n" + fullName + "\n" + password + "\n\n";
		}

}
