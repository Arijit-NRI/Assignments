package com.mvcValidationDemo;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.*;

public class Employee {

	@Size(min = 3, message = "name must be more than or equal to 3 characters")
	@NotEmpty
	private String name;

	@NotEmpty
	@Size(min = 7, message = "entered password is too short")
	private String password;

	@NotEmpty
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

	public Employee(String name, String password, String age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
