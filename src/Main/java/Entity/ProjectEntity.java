/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
@Entity
@Table(name = "project")
public class ProjectEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String customer;
    private String technologies;
    private int teamSize;
    private String highlight;
    private String members;

    // Constructors, getters, and setters

    // Constructors
    public ProjectEntity() {
        // Default constructor required by JPA
    }

    public ProjectEntity(String name, String description, String customer, String technologies, int teamSize, String highlight, String members) {
        this.name = name;
        this.description = description;
        this.customer = customer;
        this.technologies = technologies;
        this.teamSize = teamSize;
        this.highlight = highlight;
        this.members = members;
    }

    // Getters and setters (omitted for brevity)

    // toString method (optional, for debugging purposes)

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", customer='" + customer + '\'' +
                ", technologies='" + technologies + '\'' +
                ", teamSize=" + teamSize +
                ", highlight='" + highlight + '\'' +
                ", members='" + members + '\'' +
                '}';
    }
}
