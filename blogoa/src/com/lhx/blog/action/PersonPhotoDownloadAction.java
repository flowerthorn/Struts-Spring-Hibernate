package com.lhx.blog.action;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;

@Controller("personPhotoDownloadAction")
public class PersonPhotoDownloadAction {
	public PersonModel getPm() {
		return pm;
	}
	
	@Autowired
	public void setIps(IPersonService ips) {
		this.ips = ips;
	}
	public void setPm(PersonModel pm) {
		this.pm = pm;
	}

	private IPersonService ips=null;
	private PersonModel pm=null;
	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	private String pno=null;
	public InputStream getInputStream() throws Exception
	{
		InputStream result=null;
		pm=ips.getPerson(pno);
		if(pm!=null&&pm.getPhotoFilename()!=null){
			result=pm.getPhoto().getBinaryStream();
		}
		return result;
	}
	
	public String show() throws Exception
	{
		return "sucsess";
	}
	
}
