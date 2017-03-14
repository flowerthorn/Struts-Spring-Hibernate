package com.city.oa.service;

import java.util.List;

import com.city.oa.model.DepartmentModel;

public interface IDepartmentService {
	
	
	public void add(DepartmentModel dm) throws Exception;
	
	public void modify(DepartmentModel dm) throws Exception;
	
	public void delete(DepartmentModel dm) throws Exception;
	
	public DepartmentModel get(int departmentNo) throws Exception;
	
	public List<DepartmentModel> getList() throws Exception;

}
