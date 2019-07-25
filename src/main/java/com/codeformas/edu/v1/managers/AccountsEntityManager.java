package com.codeformas.edu.v1.managers;

import com.codeformas.edu.v1.error.ApiException;
import com.codeformas.edu.v1.model.AccountsEntity;
import com.codeformas.edu.v1.repository.AccountsEntityRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class AccountsEntityManager {

	private AccountsEntityRepository accountsEntityRepository;

	@Autowired
	public AccountsEntityManager(AccountsEntityRepository accountsEntityRepository) {
		this.accountsEntityRepository = accountsEntityRepository;
	}

	public List<AccountsEntity> getAllAccounts(Optional<Integer> limitOpcional, Optional<Integer> offsetOpcional){
		List<AccountsEntity> accountsEntityList = null;

		Integer limit = limitOpcional.orElse(100);
		Integer offset = limitOpcional.orElse(0);

		try{
			accountsEntityList = this.accountsEntityRepository.getByLimitAndOffset(limit, offset);
		}catch (Exception ex){
			throw new ApiException(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(accountsEntityList == null){
			accountsEntityList = Collections.emptyList();
		}

		return accountsEntityList;
	}

	public AccountsEntity getAccount(Integer idAccount){
		Optional<AccountsEntity> accountsOptional = this.accountsEntityRepository.findById(idAccount);
		if(accountsOptional.isPresent()){
			return accountsOptional.get();
		}
		else{
			throw new ApiException(new NotFoundException("Not Found"), HttpStatus.NOT_FOUND);
		}
	}

	public AccountsEntity saveUpdateAccount(AccountsEntity accountsEntity){
		try{
			accountsEntity = this.accountsEntityRepository.save(accountsEntity);
		}
		catch (Exception ex){
			ex.printStackTrace();
			throw new ApiException(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return accountsEntity;
	}

	public AccountsEntity deleteAccount(Integer idAccount){
		AccountsEntity accountsEntity = null;
		try {
			accountsEntity = this.getAccount(idAccount);
			this.accountsEntityRepository.delete(accountsEntity);
		}catch (Exception ex){
			throw new ApiException(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return accountsEntity;
	}

}
