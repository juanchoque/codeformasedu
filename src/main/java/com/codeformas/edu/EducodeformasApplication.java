package com.codeformas.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SDGenerator(
		entityPackage = "com.codeformas.edu.model",
		repositoryPackage = "com.codeformas.edu.repositories",
		managerPackage = "com.codeformas.edu.managers",
		repositoryPostfix = "Repository",
		managerPostfix = "Manager",
		onlyAnnotations = false,
		debug = false,
		overwrite = false,
		additionalExtends = {
				QuerydslPredicateExecutor.class
		}
) */
@SpringBootApplication
public class EducodeformasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducodeformasApplication.class, args);
	}

}
