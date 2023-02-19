package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssign {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("componentconfig.xml");

		Person person = context.getBean("person", Person.class);

		System.out.println(person);

	}

}
