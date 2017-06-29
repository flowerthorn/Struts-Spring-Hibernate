package com.lhx.blog.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.IArticleService;
import com.lhx.blog.service.ICategoryService;

@Controller("articleModifyAction")
public class ArticleModifyAction {
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
	private ICategoryService ics;
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
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
	{/* 	CategoryModel cm=ics.getWithArticles(cno);
		am.setCategory(cm);*/
		ias.modify(am);	
		/*if (tags!=null) {
			//System.err.println(tags[0]);
			ias.modify(am,tags);
		}*/
		return "success";	
	}
}
