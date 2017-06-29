package com.lhx.blog.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.IArticleService;
import com.lhx.blog.service.ITagService;


@Controller("tagFrontAction")
public class TagFrontAction {
	private TagModel tm;
	private ITagService its;
	private List<TagModel> tagList;
	private IArticleService ias;
	private int tno;
	public List<ArticleModel> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<ArticleModel> articleList) {
		this.articleList = articleList;
	}
	private List<ArticleModel> articleList;
	@Autowired
	public void setIas(IArticleService ias) {
		this.ias = ias;
	}
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public List<TagModel> getTagList() {
		return tagList;
	}
	public void setTagList(List<TagModel> tagList) {
		this.tagList = tagList;
	}
	public TagModel getTm() {
		return tm;
	}
	public void setTm(TagModel tm) {
		this.tm = tm;
	}
	@Autowired
	public void setIts(ITagService its) {
		this.its = its;
	}
	public String toadd() throws Exception
	{
		
		return "toadd";
	}
	public String toview() throws Exception {
		tagList=its.getListByAll();
		return "toview";
	}
	public String  tomodify() throws Exception {
		tm=its.getTag(tno);
		return "tomodify";
	}
	public String delete() throws Exception{
		tm=its.getTag(tno);
		its.delete(tm);
		return "success";
	}
	public String toviewArticleByTno() throws Exception {
		tm=its.getTag(tno);
		articleList=ias.getListByTag(tno);
		return "toviewArticleByTno";
	}
}
