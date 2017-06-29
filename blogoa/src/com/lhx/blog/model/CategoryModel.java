package com.lhx.blog.model;

import java.util.Set;

public class CategoryModel {
private int cno;
//一对多--文章关联
private Set<ArticleModel> articles; 
private String cname;
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Set<ArticleModel> getArticles() {
	return articles;
}
public void setArticles(Set<ArticleModel> articles) {
	this.articles = articles;
}
}
