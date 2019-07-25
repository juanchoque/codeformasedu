package com.codeformas.edu.v1.resources;

import com.codeformas.edu.v1.securityConfig.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsResource {

    private SecurityUtil securityUtil;

    @Autowired
    public AccountsResource(SecurityUtil securityUtil) {
        this.securityUtil = securityUtil;
    }

    @PostMapping("/user")
    public String login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        System.out.println("this is a test");
        String token = this.securityUtil.getJWTToken(username);
        return token;

    }
}
