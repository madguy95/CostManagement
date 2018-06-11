package com.fpt.edu.action;

import com.fpt.edu.dao.AccountDAO;
import com.fpt.edu.model.Account;
import com.opensymphony.xwork2.ActionSupport;

public class SignInAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6405263393553139726L;

	private AccountDAO accountDAO;
	private Account account;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String execute() throws Exception {
		if (accountDAO.findByEmail(account.getEmail()) != null) {
			return "success";
		}
		return "error";
	}
}
