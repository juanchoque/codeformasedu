package com.codeformas.edu.v1.managers;

import com.codeformas.edu.v1.model.AccountTypesEntity;
import com.codeformas.edu.v1.repository.AccountPypesEntityRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static reactor.core.publisher.Mono.when;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ActiveProfiles("test")
@RunWith(MockitoJUnitRunner.class)
public class AccountTypesEntityManagerTest {

    //@Autowired
    @Mock
    AccountPypesEntityRepository accountPypesEntityRepository;

    //@MockBean
    //AccountPypesEntityRepository accountPypesEntityRepository;

    //@Autowired
    @InjectMocks
    AccountTypesEntityManager accountTypesEntityManager;

    /*@Before
    public void setUp() {
        accountPypesEntityRepository = Mockito.mock(AccountPypesEntityRepository.class);
        accountTypesEntityManager = new AccountTypesEntityManager(accountPypesEntityRepository);
    }*/

    @Test
    public void getAllAccountTypes() {
        //List<AccountTypesEntity> listTest = new ArrayList();
        //when((Publisher<?>) accountPypesEntityRepository.findAll()).thenReturn(listTest);
        //System.out.println("////////////>" + accountPypesEntityRepository.findAll());
        //System.out.println(">>>>>>>>>>>>" + accountTypesEntityManager.getAllAccountTypes(Optional.ofNullable(null), Optional.ofNullable(null)));

    }

    @Test
    public void getAccountTypesEntityById() {

    }

    @Test
    public void saveUpdateAccountTypesEntity() {
        AccountTypesEntity accountTypesEntity = new AccountTypesEntity();
        accountTypesEntity.setName("Juan1");
        AccountTypesEntity  accountTypesEntity1 = accountTypesEntityManager.saveUpdateAccountTypesEntity(accountTypesEntity);
        System.out.println(">>>ID ACCOUNT>>>>" + accountTypesEntity1.getIdAccountType());
    }

    @Test
    public void deleteAccountTypesEntity() {

    }
}
