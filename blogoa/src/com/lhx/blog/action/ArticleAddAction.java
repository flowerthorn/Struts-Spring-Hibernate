package com.lhx.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.IArticleService;

@Controller("articleAddAction")
@Scope("prototype")
public class ArticleAddAction {

	private ArticleModel am;
	private IArticleService ias;
	private List<TagModel> list;
	private int[] tags=null;
	public int[] getTags() {
		return tags;
	}
	public void setTags(int[] tags) {
		this.tags = tags;
	}
	public ArticleModel getAm() {
		return am;
	}
	public void setAm(ArticleModel am) {
		this.am = am;
	}
	public List<TagModel> getList() {
		return list;
	}
	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}
	public void setList(List<TagModel> list) {
		this.list = list;
	}
	public String add() throws Exception {
		//am.setCategory(category);
		ias.add(am);
		if(tags!=null){
			ias.addTags(am.getAno(),tags);
		}
		return "success";
	}
}
