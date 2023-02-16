package com.mapmany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Emp {
	
	@Id
	private int id;
	private String name;
	
	//using jointable we can give custom name to our joined table and also we can add
	//the custom columns names also
	
	@ManyToMany
	@JoinTable 
	(name="Emp_Project_Relation",
			joinColumns= {@JoinColumn(name="eid")},
			inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> projects;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, List<Project> projects) {
		this.id = id;
		this.name = name;
		this.projects = projects;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
