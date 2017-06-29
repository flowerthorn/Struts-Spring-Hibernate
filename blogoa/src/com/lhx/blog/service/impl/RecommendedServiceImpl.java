package com.lhx.blog.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.RecommendedModel;
import com.lhx.blog.service.IRecommendedService;
@Service("recommendedService")
@Transactional
public class RecommendedServiceImpl implements IRecommendedService {
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public List<RecommendedModel> getList() throws Exception {
		String hql="from RecommendedModel";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		List<RecommendedModel> list=query.list();
		return list;
	}

	@Override
	public void add(int ano) throws Exception {
		RecommendedModel pm=new RecommendedModel();
		ArticleModel am=sf.getCurrentSession().get(ArticleModel.class, ano);
		pm.setArticle(am);
	    sf.getCurrentSession().save(pm);
		
	}

	public void delete(int ano) throws Exception {
		RecommendedModel pm=new RecommendedModel();
		ArticleModel am=sf.getCurrentSession().get(ArticleModel.class, ano);
		pm.setArticle(am);
	    sf.getCurrentSession().delete(pm);
	}

}
