package com.codeformas.edu.resources;

import com.codeformas.edu.error.ApiException;
import com.codeformas.edu.managers.AccountPypesEntityManager;
import com.codeformas.edu.model.AccountPypesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity getAllAccountsTypes(@RequestParam Optional<Integer> limit, @RequestParam Optional<Integer> offset){
        List<AccountPypesEntity> resultList = this.accountPypesEntityManager.getAllAccountTypes(limit, offset);
        ResponseEntity resultResponseEntity = ResponseEntity.status(HttpStatus.OK).body(resultList);
        return resultResponseEntity;
    }

}
