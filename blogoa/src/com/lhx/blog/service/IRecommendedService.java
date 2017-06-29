package com.lhx.blog.service;

import java.util.List;

import com.lhx.blog.model.RecommendedModel;

public interface IRecommendedService {
	//得到当前的推荐图书列表
	public List<RecommendedModel> getList() throws Exception;
	//增加文章到推荐文章表
	public void add(int ano) throws Exception;
	//把文章从推荐文章中删除
	public void delete(int ano) throws Exception;
	
}
