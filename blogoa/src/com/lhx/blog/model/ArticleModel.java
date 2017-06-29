package com.lhx.blog.model;

import java.util.Date;
import java.util.Set;

public class ArticleModel {

	private int ano;
	private String title;
	private String content;
	private Date date;
	//多对一 --类别关联
	private CategoryModel category;
	//多对多--标签关联
	private Set<TagModel> tags;
//	//一对多--推荐关联
//	private Set<RecommendedModel> recommendedArticles;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Set<TagModel> getTags() {
		return tags;
	}
	public void setTags(Set<TagModel> tags) {
		this.tags = tags;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
