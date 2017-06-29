package com.lhx.blog.service;


import java.io.File;
import java.util.Date;

import com.lhx.blog.model.PersonModel;

public interface IPersonService {
	//修改信息
	public void updateData(String pno,String myname,String nickname, String sex,String address,int age,String mail,String signature,Date joindate) throws Exception;
	public void updatePassword(String pno,String password) throws Exception;
	public void update(PersonModel pm)throws Exception;
	//读取Person
	public PersonModel getPerson(String pno) throws Exception;
	//验证账号密码
	public Boolean validate(String pno,String ps) throws Exception;
	//修改头像
	public void update(String pno,File photo,String fileName,String contentType) throws Exception;
}
