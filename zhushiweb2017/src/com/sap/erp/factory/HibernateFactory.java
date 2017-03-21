package com.sap.erp.factory;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class HibernateFactory {
	
	private static SessionFactory sf=null;
	
	public static SessionFactory getSessionFactory() throws Exception
	{
		if(sf==null){
			/*Context ctx=new InitialContext();
			sf=(SessionFactory)ctx.lookup("sf");
			ctx.close();*/
			Configuration cfg=new Configuration();
			cfg.configure(); //默认读取hibernate.cfg.xml
			sf=cfg.buildSessionFactory();	
		}
		return sf;
	}

}
