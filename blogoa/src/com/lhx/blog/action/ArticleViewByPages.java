package com.lhx.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.service.IArticleService;

@Controller("articleViewByPages")
public class ArticleViewByPages {
private int pages;
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
@Autowired
public void setIas(IArticleService ias) {
	this.ias = ias;
}
private int rows=1;
private IArticleService ias;
private List<ArticleModel> articleList;
public List<ArticleModel> getArticleList() {
	return articleList;
}
public void setArticleList(List<ArticleModel> articleList) {
	this.articleList = articleList;
}
public String articleViewByPages() throws Exception{
	//articleList=ias.getListByAll();
	articleList=ias.getListByAllWithPage(rows, pages);
	return "viewbypages";
}
}
