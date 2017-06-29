package com.lhx.blog.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.Date;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhx.blog.model.PersonModel;
import com.lhx.blog.service.IPersonService;
@Service("PersonService")
@Transactional
public class PersonServiceImpl implements IPersonService {
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public PersonModel getPerson(String pno) throws Exception {
		return sf.getCurrentSession().get(PersonModel.class, pno);
	}
	@Override
	public Boolean validate(String pno, String ps) throws Exception {
		boolean result=false;	
		String hql="select count(pm.pno) from PersonModel pm where pm.pno=:pno and pm.mypassword=:mypassword";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString("pno", pno);
		query.setString("mypassword",ps);
		Long lcount=(Long)query.uniqueResult();
		if(lcount!=null&&lcount>0){
			result=true;
		}
		return result;
	}
	public void update(String pno,File photo, String fileName, String contentType) throws Exception {
		PersonModel pm=sf.getCurrentSession().get(PersonModel.class,pno);
		pm.setPhotoFilename(fileName);
		pm.setPhotoContentType(contentType);
		InputStream fin=new FileInputStream(photo);
		Blob blobphoto=sf.getCurrentSession().getLobHelper().createBlob(fin, fin.available());
		pm.setPhoto( blobphoto);
		sf.getCurrentSession().update(pm);
		
	}
	@Override
	public void updateData(String pno, String myname, String nickname, String sex, String address, int age, String mail,
			String signature, Date joindate) throws Exception {
		PersonModel pm=sf.getCurrentSession().get(PersonModel.class,pno);
		pm.setMyname(myname);
		pm.setNickname(nickname);
		pm.setAddress(address);
		pm.setSignature(signature);
		pm.setJoindate(joindate);
		pm.setAge(age);
		pm.setMail(mail);
		pm.setSex(sex);
		sf.getCurrentSession().update(pm);
	}
	@Override
	public void updatePassword(String pno, String password) throws Exception {
		PersonModel pm=sf.getCurrentSession().get(PersonModel.class,pno);;
		pm.setPno(pno);
		pm.setMypassword(password);
		sf.getCurrentSession().update(pm);
	}
	@Override
	public void update(PersonModel pm) throws Exception {
		sf.getCurrentSession().update(pm);
		
	}

}
