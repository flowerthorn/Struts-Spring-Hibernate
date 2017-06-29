package com.lhx.blog.service;

import java.util.List;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.TagModel;

public interface IArticleService {
	//添加文章
	public void add(ArticleModel am) throws Exception;
	//修改文章内容
	public void modify(ArticleModel am) throws Exception;
	public void modify(ArticleModel am,int[] tags)throws Exception;
	//删除文章
	public void delete(ArticleModel am) throws Exception;
	//根据文章编号取得文章对象
	public ArticleModel getArticle(int ano) throws Exception;
	//取得所有的文章列表
	public List<ArticleModel> getListByAll() throws Exception;
	//取得指定类别的文章列表
	public List<ArticleModel> getListByCategory(int cno) throws Exception;
	//取得指定标签的文章列表
	public List<ArticleModel> getListByTag(int tno) throws Exception;
	//按检索条件取得文章个数
	public int getCountByCategory(int cno) throws Exception;
	//给指定文章增加指定的标签
	public void addTag(int ano,int tno) throws Exception;
	//给指定文章增加多个标签
	public void addTags(int ano,int[] tnos) throws Exception;
	//取得指定文章的标签集合列表
	public List<TagModel> getTagsByArticle(int ano) throws Exception;
	//检查指定的文章是否有指定的标签
	public boolean hasSpecificTag(int ano,int tno) throws Exception;
	//查询无标签的文章列表
	public List<ArticleModel> getListWithoutTag() throws Exception;
	//分页
	public List<ArticleModel> getListByAllWithPage(int rows,int page) throws Exception;
	//按检索条件取得员工页数
	public int getPageCountBySearch(int cno,int rows) throws Exception;	
	//取得相似标题的文章列表 模糊查询
	public List<ArticleModel> getListBySearchTitle(String title) throws Exception;
}
