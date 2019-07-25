package com.codeformas.edu.v1.repository;

import com.codeformas.edu.v1.model.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsEntityRepository extends JpaRepository<AccountsEntity, Integer> {

    @Query(value = "select * from accounts order by id_account limit ?1 offset ?2", nativeQuery = true)
    List<AccountsEntity> getByLimitAndOffset(Integer limit, Integer offset);

}
