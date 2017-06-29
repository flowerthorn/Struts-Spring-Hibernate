package com.city.oa.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.oa.model.DepartmentModel;
import com.city.oa.service.IDepartmentService;

public class DepartmentServiceImpl implements IDepartmentService {

	@Override
	public void add(DepartmentModel dm) throws Exception {
		
		Configuration cfg=new Configuration();
		cfg.configure(); //默认读取hibernate.cfg.xml
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dm);
		tx.commit();
		session.close();
		sf.close();
		
		
		

	}

	@Override
	public void modify(DepartmentModel dm) throws Exception {
		Configuration cfg=new Configuration();
		cfg.configure(); //默认读取hibernate.cfg.xml
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(dm);
		tx.commit();
		session.close();
		sf.close();
	}

	@Override
	public void delete(DepartmentModel dm) throws Exception {
		Configuration cfg=new Configuration();
		cfg.configure(); //默认读取hibernate.cfg.xml
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(dm);
		tx.commit();
		session.close();
		sf.close();

	}

	@Override
	public DepartmentModel get(int departmentNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
