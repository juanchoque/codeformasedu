package com.codeformas.edu.repository;

import com.codeformas.edu.model.AccountTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountPypesEntityRepository extends JpaRepository<AccountTypesEntity, Integer> {

    @Query(value = "select * from account_types order by id_account_type limit ?1 offset ?2", nativeQuery = true)
    List<AccountTypesEntity> getAllByLimitAndOffset(Integer limit, Integer offset);

}
