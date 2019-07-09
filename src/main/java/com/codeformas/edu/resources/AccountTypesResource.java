package com.codeformas.edu.resources;

import com.codeformas.edu.error.ApiException;
import com.codeformas.edu.managers.AccountPypesEntityManager;
import com.codeformas.edu.model.AccountTypesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounttypes")
public class AccountTypesResource {
    private AccountPypesEntityManager accountPypesEntityManager;

    @Autowired
    public AccountTypesResource(AccountPypesEntityManager accountPypesEntityManager) {
        this.accountPypesEntityManager = accountPypesEntityManager;
    }

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity getAllAccountTypes(@RequestParam Optional<Integer> limit, @RequestParam Optional<Integer> offset){
        List<AccountTypesEntity> resultList = this.accountPypesEntityManager.getAllAccountTypes(limit, offset);
        ResponseEntity resultResponseEntity = ResponseEntity.status(HttpStatus.OK).body(resultList);
        return resultResponseEntity;
    }

    @GetMapping(value = "/{idAccountTypeOptional}", produces = "application/json")
    public ResponseEntity getAccountTypes (@RequestParam Optional<Integer> idAccountTypeOptional){
        Integer idAccountType = idAccountTypeOptional.orElse(-1);
        AccountTypesEntity accountTypesEntity = this.accountPypesEntityManager.getAccountTypesEntityById(idAccountType);
        return ResponseEntity.status(HttpStatus.OK).body(accountTypesEntity);
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity saveAccountTypes (@RequestBody AccountTypesEntity accountTypesEntity){
        AccountTypesEntity result = this.accountPypesEntityManager.saveUpdateAccountTypesEntity(accountTypesEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping(value = "", produces = "application/json")
    public ResponseEntity updateAccountType(@RequestBody AccountTypesEntity accountTypesEntity){
        throw new ApiException(null, null);
    }

    @DeleteMapping(value = "/{idAccountTypeOptional}", produces = "application/json")
    public RequestEntity deleteAccountType(@RequestParam Optional<Integer> idAccountTypeOptional){
        throw new ApiException(null, null);
    }

}
