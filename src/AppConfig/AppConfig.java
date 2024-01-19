/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Controller.ProjectController;
import Repository.ProjectRepository;
import Service.ProjectService;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
@Configuration
@ComponentScan(basePackages = "")
public class AppConfig {
	@Bean
	public ProjectRepository projectRepository() {
		return new ProjectRepository();
	}

	@Bean
	public ProjectService projectService(ProjectRepository projectRepository) {
		return new ProjectService(projectRepository);
	}

	@Bean
	public ProjectController ProjectController(ProjectService projectService) {
		return new ProjectController(projectService);
	}
}
