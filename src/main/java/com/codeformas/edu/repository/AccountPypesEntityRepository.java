package com.codeformas.edu.repository;

import com.codeformas.edu.model.AccountPypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountPypesEntityRepository extends JpaRepository<AccountPypesEntity, Integer> {

    @Query(value = "select * from account_pypes order by id_account_pype limit ?1 offset ?2", nativeQuery = true)
    List<AccountPypesEntity> getAllByLimitAndOffset(Integer limit, Integer offset);


}
