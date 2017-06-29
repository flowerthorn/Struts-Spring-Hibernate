package com.lhx.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.ICategoryService;
import com.lhx.blog.service.ITagService;

@Controller("articleToAddAction")
public class ArticleToAddAction {
	private ICategoryService ics;
	private ITagService its;
	private List<CategoryModel> categoryList;
	private List<TagModel> tagList;
	private ArticleModel am;
	public ArticleModel getAm() {
		return am;
	}
	public void setAm(ArticleModel am) {
		this.am = am;
	}
	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}
	public List<TagModel> getTagList() {
		return tagList;
	}
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
	@Autowired
	public void setIts(ITagService its) {
		this.its = its;
	}
	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}
	public void setTagList(List<TagModel> tagList) {
		this.tagList = tagList;
	}

	public String toadd() throws Exception{
		categoryList=ics.getList();
		tagList=its.getListByAll();
		return "toadd";
	}
}
