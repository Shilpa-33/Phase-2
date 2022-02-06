package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.Entity.Courses;
import com.simplilearn.Entity.EProduct;
import com.simplilearn.Entity.PhoneNumber;
import com.simplilearn.Entity.Student;

public class HibernateUtil {

	public static SessionFactory buildSessionFactory() {
		
		// Step 1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(PhoneNumber.class);
		cfg.addAnnotatedClass(Courses.class);
		
		//Step 2
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;
	}

}