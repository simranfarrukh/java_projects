package com.farrukhsimran.inheritance;

import java.util.ArrayList;

public class UserAccountManager {

	private ArrayList<UserAccount> users = new ArrayList<UserAccount>();

	public void addUser(UserAccount user) {
		users.add(user);
	}

	public boolean login(String username, String password) {
		for (UserAccount user: users) {
			if (user.getUsername() == username && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
}
