package com.city.oa.factory;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.hibernate.SessionFactory;

public class HibernateFactory {
	private static SessionFactory sf=null;
	public static SessionFactory createSessionFactory() 
			throws Exception{
		if(sf==null){
			Context ctx=new InitialContext();
			sf=(SessionFactory)ctx.lookup("sf");
			ctx.close();
		}
		return sf;	
	}
}
