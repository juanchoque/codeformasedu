package com.codeformas.edu.repository;

import com.codeformas.edu.model.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Repository
public interface CoursesEntityRepository extends JpaRepository<CoursesEntity, Integer> {

}
