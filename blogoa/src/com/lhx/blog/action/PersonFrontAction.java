package com.lhx.blog.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;

@Controller("personFrontAction")
public class PersonFrontAction {
	private IPersonService ips=null;
	private PersonModel pm=null;
	private String pno;
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	private String[] sexs=new String[]{"boy","girl"};
	private Map<String,String> sexss=new HashMap<String,String>();
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

	public String toviewdata() throws Exception{
		
		pm=ips.getPerson(pno);
		if(pm.getPhotoFilename()==null){
			return "toviewdata";
			}
		return "toviewdatawithphoto";
		
	}
	public String toupdatedata() throws Exception{
		sexss.put("0", "男");
		sexss.put("1", "女");
		pm=ips.getPerson(pno);
		return "toupdatedata";
		
	}
	public String toupdateps() throws Exception{
		pm=ips.getPerson(pno);
		return "toupdateps";
	}
	public String toupdatephoto ()throws Exception {
		pm=ips.getPerson(pno);
		return "toupdatephoto";
	}
}
