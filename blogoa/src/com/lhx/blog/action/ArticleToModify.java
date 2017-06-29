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
import com.sun.org.apache.bcel.internal.generic.IADD;


@Controller("articleToModify")
public class ArticleToModify {
	private int ano;
	private IArticleService ias;
	private ArticleModel am;
	private List<CategoryModel> categoryList;
	private ITagService its;
	private List<TagModel> tagList;
	public List<TagModel> getTagList() {
		return tagList;
	}
	public void setTagList(List<TagModel> tagList) {
		this.tagList = tagList;
	}
	@Autowired
 	public void setIts(ITagService its) {
		this.its = its;
	}
	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}
	public ArticleModel getAm() {
		return am;
	}

	public void setAm(ArticleModel am) {
		this.am = am;
	}

	private CategoryModel cm;
	private ICategoryService ics;
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
	public void setCm(CategoryModel cm) {
		this.cm = cm;
	}
	public CategoryModel getCm() {
		return cm;
	}
	public String  tomodify() throws Exception{
	am=ias.getArticle(ano);
	categoryList=ics.getList();
	tagList=its.getListByAll();
	return "tomodify";
}
}
