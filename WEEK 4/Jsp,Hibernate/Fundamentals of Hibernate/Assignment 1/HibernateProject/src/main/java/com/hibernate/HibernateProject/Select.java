package com.hibernate.HibernateProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        Student s = (Student) session.get(Student.class, id);
        System.out.println(s);
        
        Student s2 = (Student) session.load(Student.class, id);
        System.out.println(s2);
	}
}
