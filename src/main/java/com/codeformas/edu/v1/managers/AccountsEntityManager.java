package com.codeformas.edu.v1.managers;

import com.codeformas.edu.v1.repository.AccountsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Component
public class AccountsEntityManager {

	private AccountsEntityRepository accountsEntityRepository;

	@Autowired
	public AccountsEntityManager(AccountsEntityRepository accountsEntityRepository) {
		this.accountsEntityRepository = accountsEntityRepository;
	}

}