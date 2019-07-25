package com.codeformas.edu.v1.managers;

import com.codeformas.edu.v1.error.ApiException;
import com.codeformas.edu.v1.model.AccountTypesEntity;
import com.codeformas.edu.v1.repository.AccountPypesEntityRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Component
public class AccountTypesEntityManager {

	private AccountPypesEntityRepository accountPypesEntityRepository;

	@Autowired
	public AccountTypesEntityManager(AccountPypesEntityRepository accountPypesEntityRepository) {
		this.accountPypesEntityRepository = accountPypesEntityRepository;
	}

	public List<AccountTypesEntity> getAllAccountTypes(Optional<Integer> limitOpcional, Optional<Integer> offsetOpcional){
		List<AccountTypesEntity> accountTypeList;

		Integer limit = limitOpcional.orElse(-1);
		Integer offset = offsetOpcional.orElse(-1);

		try {
			if( limit >= 0 && offset >= 0){
				accountTypeList = this.accountPypesEntityRepository.getAllByLimitAndOffset(limit, offset);
			}
			else{
				accountTypeList = this.accountPypesEntityRepository.findAll();
			}
		}catch (Exception e){
			throw new ApiException(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(accountTypeList == null){
			accountTypeList = Collections.emptyList();
		}
		return accountTypeList;
	}

	public AccountTypesEntity getAccountTypesEntityById(Integer idAccount){
		Optional<AccountTypesEntity> accountTypesOptional = this.accountPypesEntityRepository.findById(idAccount);
		if(accountTypesOptional.isPresent()){
			return accountTypesOptional.get();
		}
		else{
			throw new ApiException(new NotFoundException("Not Found"), HttpStatus.NOT_FOUND);
		}
	}

	public AccountTypesEntity saveUpdateAccountTypesEntity(AccountTypesEntity accountTypesEntity){
		try {
			accountTypesEntity = this.accountPypesEntityRepository.save(accountTypesEntity);
		}catch (Exception e){
			e.printStackTrace();
			throw new ApiException(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return accountTypesEntity;
	}

	public AccountTypesEntity deleteAccountTypesEntity(Integer idAccountTypesEntity){
		AccountTypesEntity accountTypesEntity = null;
		try {
			accountTypesEntity = this.getAccountTypesEntityById(idAccountTypesEntity);
			this.accountPypesEntityRepository.delete(accountTypesEntity);
		}catch (Exception e){
			throw new ApiException(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return accountTypesEntity;
	}

}
