package com.codeformas.edu.managers;

import com.codeformas.edu.model.DetailCurseAccountsEntity;
import com.codeformas.edu.repository.DetailCurseAccountsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Component
public class DetailCurseAccountsEntityManager {

	private DetailCurseAccountsEntityRepository detailCurseAccountsEntityRepository;

	@Autowired
	public DetailCurseAccountsEntityManager(DetailCurseAccountsEntityRepository detailCurseAccountsEntityRepository) {
		this.detailCurseAccountsEntityRepository = detailCurseAccountsEntityRepository;
	}

}
