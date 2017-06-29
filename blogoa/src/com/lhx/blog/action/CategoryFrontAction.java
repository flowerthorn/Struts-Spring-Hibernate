package com.lhx.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.service.IArticleService;
import com.lhx.blog.service.ICategoryService;


@Controller("categoryFrontAction")
public class CategoryFrontAction {
	private ICategoryService ics;
	private IArticleService ias;
	private List<ArticleModel> articleList;
	private List<CategoryModel> categoryList=null;
	private int cno;
	private CategoryModel cm;
	public List<ArticleModel> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<ArticleModel> articleList) {
		this.articleList = articleList;
	}
	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}
	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}
	public int getCno() {
		return cno;
	}
	public CategoryModel getCm() {
		return cm;
	}
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public void setCm(CategoryModel cm) {
		this.cm = cm;
	}

	//分发到增加页面
		public String toadd() throws Exception
		{
			
			return "toadd";
		}
		//分发到修改页面
		public String tomodify() throws Exception
		{
			
			cm=ics.get(cno);
			return "tomodify";
		}
		public String toview() throws Exception{
			categoryList=ics.getList();
			return "toview";
		}
		public String delete() throws Exception{
			cm=ics.get(cno);
			ics.delete(cm);
			return "success";
		}
		//屏蔽这个,会出现页面404
		public String toselect(){
			return "toselect";
		}
		public String toviewArticleByCno() throws Exception{
			cm=ics.get(cno);
			articleList=ias.getListByCategory(cno);
			return "toviewArticleByCno";
		}
	
}
