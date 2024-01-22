/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.ProjectRepository;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	public void executeServiceLogic() {
	        System.out.println("Service logic executed.");
	        projectRepository.executeRepositoryLogic();
	}
}
