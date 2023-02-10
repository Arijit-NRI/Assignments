package com.hibernate.HibernateProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        
        Scanner sc = new Scanner(System.in);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("Enter student id to update: ");
        int id = sc.nextInt();
        Student s = (Student) session.get(Student.class, id);
        
        if(s != null) {
            System.out.println("Enter new city: ");
            s.setCity(sc.next());
            session.update(s);
            session.flush();
            tx.commit();
            System.out.println("City updated!");
        }
        else {
        	System.out.println("No such record found");
        }
        session.close();
	}

}
