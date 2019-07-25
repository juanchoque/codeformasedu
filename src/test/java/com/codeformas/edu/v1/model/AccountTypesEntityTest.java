package com.codeformas.edu.v1.model;

import com.codeformas.edu.v1.repository.AccountPypesEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AccountTypesEntityTest {
    @Autowired
    TestEntityManager entityManager;

    @Autowired
    AccountPypesEntityRepository accountPypesEntityRepository;

    @Test
    public void getIdAccountType() {
        AccountTypesEntity accountTypesEntity = new AccountTypesEntity();
        accountTypesEntity.setName("data test test");
        accountTypesEntity = entityManager.persist(accountTypesEntity);
        //accountTypesEntity = accountPypesEntityRepository.save(accountTypesEntity);
        //System.out.println("data for the test>>>>>" + accountTypesEntity.getIdAccountType());
        //System.out.println("?????????1111111111111111???????>" + accountPypesEntityRepository.findAll().size());
        //assertThat(accountPypesEntityRepository.findById(accountTypesEntity.getIdAccountType()).get()).isEqualTo(accountTypesEntity);
    }

    @Test
    public void setIdAccountType() {
        System.out.println("?????????222222222222???????>" + accountPypesEntityRepository.findAll().size());
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getCode() {
    }

    @Test
    public void setCode() {
    }

    @Test
    public void getState() {
    }

    @Test
    public void setState() {
    }
}
