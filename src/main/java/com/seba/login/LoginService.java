package com.seba.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Sebastian") && password.equals("dupa")) {
			return true;
		}
		return false;
	}

}
