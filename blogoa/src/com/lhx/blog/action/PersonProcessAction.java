package com.lhx.blog.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("personProcessAction")
@Scope("prototype")
public class PersonProcessAction extends ActionSupport{
	public PersonModel getPm() {
		return pm;
	}

	public void setPm(PersonModel pm) {
		this.pm = pm;
	}
	@Autowired
	public void setIps(IPersonService ips) {
		this.ips = ips;
	}

	private IPersonService ips=null;
	private PersonModel pm=null;
	private String repassword=null;
	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String updatedata() throws Exception{
		ips.updateData(pm.getPno(), pm.getMyname(), pm.getNickname(), pm.getSex(), pm.getAddress(), pm.getAge(), pm.getMail(), pm.getSignature(), pm.getJoindate());
		//ips.update(pm);
		return "updatesuccess";
	}
	public String updateps() throws Exception{
		ips.updatePassword(pm.getPno(), pm.getMypassword());
		//ips.update(pm);
		return "updatesuccess";
	}
}
