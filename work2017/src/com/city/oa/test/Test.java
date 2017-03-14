package com.city.oa.test;

import com.city.oa.model.DepartmentModel;
import com.city.oa.service.DepartmentServiceImpl;
import com.city.oa.service.IDepartmentService;


public class Test {

	public static void main(String[] args) {
		
		
		IDepartmentService ds=new DepartmentServiceImpl();
		
		DepartmentModel dm=new DepartmentModel();
	
		dm.setCode("1111");
		dm.setName("OK");
		
		try {
			ds.add(dm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
