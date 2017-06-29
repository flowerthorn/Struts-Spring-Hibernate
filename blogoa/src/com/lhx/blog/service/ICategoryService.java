package com.lhx.blog.service;

import java.util.List;

import com.lhx.blog.model.CategoryModel;

public interface ICategoryService {
	//增加类别
	public void add(CategoryModel cm) throws Exception;
	//修改类别
	public void modify(CategoryModel cm) throws Exception;
	//删除类别
	public void delete(CategoryModel cm) throws Exception;
	//取得指定的类别，没有关联的文章
	public CategoryModel get(int cno) throws Exception;
	//取得指定的类别，并关联相关的文章
	public CategoryModel getWithArticles(int cno) throws Exception;
	//取得所有的类别的列表，不取得相关的员工的对线下
	public List<CategoryModel> getList() throws Exception;
}
