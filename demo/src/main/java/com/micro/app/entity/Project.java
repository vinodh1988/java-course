package com.micro.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Project {
@Id
   private int projectno;
@Column
   private String title;
@Column
   private String description;
public Project(int projectno, String title, String description) {
	super();
	this.projectno = projectno;
	this.title = title;
	this.description = description;
}
   
public Project() {}

public int getProjectno() {
	return projectno;
}

public void setProjectno(int projectno) {
	this.projectno = projectno;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


}
