package com.codeformas.edu.managers;

import com.codeformas.edu.model.CoursesEntity;
import com.codeformas.edu.repository.CoursesEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Component
public class CoursesEntityManager {

	private CoursesEntityRepository coursesEntityRepository;

	@Autowired
	public CoursesEntityManager(CoursesEntityRepository coursesEntityRepository) {
		this.coursesEntityRepository = coursesEntityRepository;
	}

}