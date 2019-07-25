package com.codeformas.edu.v1.resources;

import com.codeformas.edu.v1.managers.AccountsEntityManager;
import com.codeformas.edu.v1.model.AccountsEntity;
import com.codeformas.edu.v1.securityConfig.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsResource {

    private AccountsEntityManager accountsEntityManager;

    @Autowired
    public AccountsResource(AccountsEntityManager accountsEntityManager) {
        this.accountsEntityManager = accountsEntityManager;
    }

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity getAllAccounts(@RequestParam Optional<Integer> limit, @RequestParam Optional<Integer> offset){
        List<AccountsEntity> accountsEntityList = this.accountsEntityManager.getAllAccounts(limit, offset);
        return ResponseEntity.status(HttpStatus.OK).body(accountsEntityList);
    }

    @GetMapping(value = "/{idAcountOptional}", produces = "application/json")
    public ResponseEntity getAcountEntity(@RequestParam Optional<Integer> idAcountOptional){
        Integer idAcount = idAcountOptional.orElse(-1);
        AccountsEntity accountsEntity = this.accountsEntityManager.getAccount(idAcount);
        return ResponseEntity.status(HttpStatus.OK).body(accountsEntity);
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity saveAccount(@RequestBody AccountsEntity accountsEntity){
        accountsEntity = this.accountsEntityManager.saveUpdateAccount(accountsEntity);
        return ResponseEntity.status(HttpStatus.OK).body(accountsEntity);
    }

    @PutMapping(value = "", produces = "application/json")
    public ResponseEntity updateAccount(@RequestBody AccountsEntity accountsEntity){
        accountsEntity = this.accountsEntityManager.saveUpdateAccount(accountsEntity);
        return ResponseEntity.status(HttpStatus.OK).body(accountsEntity);
    }

    @DeleteMapping(value = "/{idAccountOptional}", produces = "application/json")
    public ResponseEntity deleteAccount(@RequestParam Optional<Integer> idAccountOptional){
        Integer idAccount = idAccountOptional.orElse(-1);
        AccountsEntity result = this.accountsEntityManager.deleteAccount(idAccount);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
