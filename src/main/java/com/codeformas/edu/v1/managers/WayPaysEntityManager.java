package com.codeformas.edu.v1.managers;

import com.codeformas.edu.v1.repository.WayPaysEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 28/06/2019
*/
@Component
public class WayPaysEntityManager {

	private WayPaysEntityRepository wayPaysEntityRepository;

	@Autowired
	public WayPaysEntityManager(WayPaysEntityRepository wayPaysEntityRepository) {
		this.wayPaysEntityRepository = wayPaysEntityRepository;
	}

}