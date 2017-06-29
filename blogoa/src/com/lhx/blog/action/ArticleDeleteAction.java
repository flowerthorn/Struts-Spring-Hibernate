package com.lhx.blog.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.service.IArticleService;

@Controller("articleDeleteAction")
@Scope("prototype")
public class ArticleDeleteAction {
	private ArticleModel am;
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	private int ano;
	private IArticleService ias;
	public ArticleModel getAm() {
		return am;
	}

	public void setAm(ArticleModel am) {
		this.am = am;
	}

	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}public String delete() throws Exception
	{	am=ias.getArticle(ano);
		ias.delete(am); ;
		return "success";	
	}
}
