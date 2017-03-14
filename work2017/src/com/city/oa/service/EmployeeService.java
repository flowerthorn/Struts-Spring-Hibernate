package com.city.oa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.model.EmployeeModel;

public class EmployeeService implements IEmployeeService {

	@Override
	public void add(EmployeeModel em) throws Exception {
		SessionFactory sf=HibernateFactory.createSessionFactory();	
		Session session=sf.openSession();		
		Transaction tx=session.beginTransaction();	
		session.save(em);	
		tx.commit();
	}
}
