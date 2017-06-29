package com.lhx.blog.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.service.ICategoryService;

@Controller("categoryProcessAction")
public class CategoryProcessAction {
	
	public CategoryModel getCm() {
		return cm;
	}
	@Autowired
	public void setIcs(ICategoryService ics) {
		this.ics = ics;
	}
	public void setCm(CategoryModel cm) {
		this.cm = cm;
	}
	private ICategoryService ics;
	private CategoryModel cm;
	private ArticleModel am;
	private int ano;
	//定义增加处理方法
		public String add() throws Exception
		{
			
				ics.add(cm);
				return "success";
			
		}
	//修改部门信息
		public String modify() throws Exception
		{
			
			ics.modify(cm);
			return "success";
			
			
		}
	//根据编号返回一个category
		public String selectbycno() throws Exception{
			int cno=cm.getCno();
			cm=ics.get(cno);
			if (cm==null) {
				return "404";
			}
			return "ok";
		}

}
