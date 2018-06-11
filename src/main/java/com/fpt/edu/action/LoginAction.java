package com.fpt.edu.action;

import com.fpt.edu.dao.UserDAO;
import com.fpt.edu.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5855132205198273959L;

	private UserDAO userDAO;
	private User user;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String execute() {
		if (userDAO.checkLogin(user)) {
			return "success";
		}

		return "error";
	}
}
