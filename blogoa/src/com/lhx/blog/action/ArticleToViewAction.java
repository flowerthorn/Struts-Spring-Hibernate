package com.lhx.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.IArticleService;
import com.lhx.blog.service.ICategoryService;
import com.lhx.blog.service.ITagService;


@Controller("articleToViewAction")
public class ArticleToViewAction {
	public ArticleModel getAm() {
		return am;
	}
	public List<ArticleModel> getArticleList() {
		return articleList;
	}
/*	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}*/
/*	public List<TagModel> getTagList() {
		return tagList;
	}*/
	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
	public void setAm(ArticleModel am) {
		this.am = am;
	}
/*	public void setArticleList(List<ArticleModel> articleList) {
		this.articleList = articleList;
	}*/
	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}
/*	public void setTagList(List<TagModel> tagList) {
		this.tagList = tagList;
	}*/
	@Autowired
	public void setIts(ITagService its) {
		this.its = its;
	}
	private IArticleService ias;
	private ICategoryService ics;
	private ITagService its;
	private ArticleModel am;
	private List<ArticleModel> articleList;
	private List<CategoryModel> categoryList;
	private List<TagModel> tagList;
	public String toview() throws Exception{
		articleList=ias.getListByAll();
		/*categoryList=ics.getList();*/
		//tagList=its.getListByAll();
		return "toview";
	}
}
