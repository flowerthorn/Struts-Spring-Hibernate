package com.lhx.blog.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.service.IArticleService;

public class ArticleSelectByTags {
	private int ano;
	private int cno;
	private int[] tags;
	public int[] getTags() {
		return tags;
	}

	public void setTags(int[] tags) {
		this.tags = tags;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}
	private IArticleService ias;
	private ArticleModel am;
	public int getAno() {
		return ano;
	}

	public void setAm(ArticleModel am) {
		this.am = am;
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
	public String modify() throws Exception
	{ 
		ias.modify(am);	
		/*if (tags!=null) {
			//System.err.println(tags[0]);
			ias.modify(am,tags);
		}*/
		return "success";	
	}
}
