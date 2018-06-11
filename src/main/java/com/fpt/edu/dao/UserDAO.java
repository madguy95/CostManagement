package com.fpt.edu.dao;

import com.fpt.edu.model.User;

public class UserDAO {

	public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("nimda");
    }
}
