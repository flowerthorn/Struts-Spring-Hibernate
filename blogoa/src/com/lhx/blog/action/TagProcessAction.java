package com.lhx.blog.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.ITagService;

@Controller("tagProcessAction")
public class TagProcessAction {
	private TagModel tm;
	private ITagService its;
	
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
	public String add() throws Exception
	{
		its.add(tm);
		return "success";	
	}
	public String modify() throws Exception
	{
		its.modify(tm);
		return "success";	
	}
}
