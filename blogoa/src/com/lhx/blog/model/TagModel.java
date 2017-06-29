package com.lhx.blog.model;

import java.util.Set;

public class TagModel {
private int tno;
public int getTno() {
	return tno;
}
public void setTno(int tno) {
	this.tno = tno;
}


private String tname;
private Set<ArticleModel> articles;

public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Set<ArticleModel> getArticles() {
	return articles;
}
public void setArticles(Set<ArticleModel> articles) {
	this.articles = articles;
}
}
