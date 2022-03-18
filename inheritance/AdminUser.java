package com.farrukhsimran.inheritance;

public class AdminUser extends UserAccount {

	AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accessWebsite() {
		System.out.println("Accessing website with admin rights");
	}

}
