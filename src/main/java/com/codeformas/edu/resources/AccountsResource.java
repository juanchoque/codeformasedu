package com.codeformas.edu.resources;

import com.codeformas.edu.security.SecurityUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/accounts")
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
