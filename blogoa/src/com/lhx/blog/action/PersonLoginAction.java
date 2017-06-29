package com.lhx.blog.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Controller("personLoginAction")
@Scope("prototype")
public class PersonLoginAction extends ActionSupport  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonModel pm;
	private String pno;
	private String ps=null;
	private IPersonService ips=null;
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}

	public PersonModel getPm() {
		return pm;
	}
	public void setPm(PersonModel pm) {
		this.pm = pm;
	}
	
	public String getPs() {
		return ps;
	}
	
	public void setPs(String ps) {
		this.ps = ps;
	}
	@Autowired
	public void setIps(IPersonService ips) {
		this.ips = ips;
	}
	public void validate(){
		if(pno==null||pno.equals("")){
			addFieldError("pno", "账号长度不能为空");
		}
		if (ps==null||ps.trim().equals("")) {
			addFieldError("ps", "密码不能为空");
		}
		else if (ps.length()<6||ps.length()>12) {
			addFieldError("ps","密码长度应该到6到12位之间");
		}
	}
	public String login() throws Exception{
		//服务器端验证
		if (ips.validate(pno, ps)) {
			PersonModel pm=ips.getPerson(pno);
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("pm", pm);
			return SUCCESS;
		}
		String error=this.getText("welcome.loginerror");
		this.addActionError(error);
		return "failure";
	}
}
