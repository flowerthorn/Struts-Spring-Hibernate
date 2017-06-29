package com.lhx.blog.action;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.apache.tomcat.util.file.Matcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.classfile.PMGClass;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

@Controller("personPhotoUploadAction")
@Scope("prototype")
public class PersonPhotoUploadAction extends ActionSupport {
	public String getPno() {
		return pno;
	}

	public File getPhoto() {
		return photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	private IPersonService ips=null;
	private String pno=null;
	private File photo=null;
	private String photoFileName=null;
	private String photoContentType=null;
	@Autowired
	public void setIps(IPersonService ips) {
		this.ips = ips;
	}

	public String updatephoto() throws Exception
	{	System.out.println(pno);
		ips.update(pno,photo,photoFileName,photoContentType);
		return "updatesuccess";
	}
	
}
