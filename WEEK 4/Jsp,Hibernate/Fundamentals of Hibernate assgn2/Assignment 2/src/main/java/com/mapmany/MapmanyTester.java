package com.mapmany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapmanyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For this Many to Many relationship another 2 tables named 'emp_project' &
		// 'project_emp'
		// will be created , which will show their relationship

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.setId(101);
		e1.setName("Abhi");

		e2.setId(102);
		e2.setName("Abhinaba");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(501);
		p1.setProjectname("Hr Management System");

		p2.setPid(502);
		p2.setProjectname("Machine Learning Project");

		List<Emp> employees = new ArrayList<Emp>();
		List<Project> projects = new ArrayList<Project>();

		employees.add(e1);
		employees.add(e2);
		projects.add(p1);
		projects.add(p2);

		e1.setProjects(projects);
		p2.setEmps(employees);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		// Fetching Project Names based on the given employee id
		Emp emp = session.get(Emp.class, 101);
		System.out.println(emp.getName());
		for (Project proj : emp.getProjects()) {
			System.out.println(proj.getProjectname());
		}

		// Fetching Employee Names based on the given project id
		Project p = session.get(Project.class, 501);
		System.out.println(p.getProjectname());
		if (p.getEmps() == null) {
			System.out.println("No such employee");
		} else {
			for (Emp e : p.getEmps()) {

				System.out.println(e.getName());
			}
		}

		tx.commit();
		session.close();

	}

}
