package com.fpt.edu.dao;

import com.fpt.edu.model.Account;

public interface AccountDAO {

	Account findByEmail(String email);
}
