package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Value("101")
	private int Id;

	@Value("Arijit Saha")
	private String name;

	@Value("Intern")
	private String designation;

	@Value("#{bSet}")
	private List<String> contactNos;

	@Value("#{cList}")
	private List<String> projects;

	public Person(int id, String name, String designation, List<String> contactNos, List<String> projects) {
		super();
		Id = id;
		this.name = name;
		this.designation = designation;
		this.contactNos = contactNos;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", designation=" + designation + ", contactNos=" + contactNos
				+ ", projects=" + projects + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<String> getContactNos() {
		return contactNos;
	}

	public void setContactNos(List<String> contactNos) {
		this.contactNos = contactNos;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
