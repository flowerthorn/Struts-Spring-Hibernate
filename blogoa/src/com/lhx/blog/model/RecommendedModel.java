package com.lhx.blog.model;

public class RecommendedModel {
private int rno;

public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
private ArticleModel article;//多对一

public ArticleModel getArticle() {
	return article;
}
public void setArticle(ArticleModel article) {
	this.article = article;
}

}
