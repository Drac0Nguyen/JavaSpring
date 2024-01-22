/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Service.ProjectService;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
@Controller
public class ProjectController {
	/**
	 * @param projectService2
	 */
	@Autowired
	private ProjectService projectService;

	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	public void executeControllerLogic() {
		System.out.println("Controller logic executed.");
		projectService.executeServiceLogic();
	}
}
