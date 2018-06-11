package com.fpt.edu.dao.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.fpt.edu.dao.AccountDAO;
import com.fpt.edu.model.Account;
import com.ibatis.sqlmap.client.SqlMapClient;

public class AccountDaoImpl implements AccountDAO {

	private static final Logger _log = Logger.getLogger(AccountDaoImpl.class);
	private SqlMapClient sqlMapClient;

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	public Account findByEmail(String email) {
		Account account = null;
		try {
			account = (Account) sqlMapClient.queryForObject("account.getAccountById", email);
			_log.info("test");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

}
