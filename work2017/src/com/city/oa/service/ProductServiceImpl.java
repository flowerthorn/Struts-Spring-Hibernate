package com.city.oa.service;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.oa.model.ProductModel;
import com.city.oa.service.IProductService;

public class ProductServiceImpl implements IProductService{
	private Configuration cfg=new Configuration();
	private SessionFactory sf;
	 
	@Override
	public void add(ProductModel pm) throws Exception {
		cfg.configure();
		sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		session.save(pm);
		ts.commit();
		session.close();
		
		
	}

}
