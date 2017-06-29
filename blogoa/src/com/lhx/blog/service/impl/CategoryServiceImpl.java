package com.lhx.blog.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhx.blog.model.CategoryModel;
import com.lhx.blog.service.ICategoryService;
@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements ICategoryService {
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public void add(CategoryModel cm) throws Exception {
		sf.getCurrentSession().save(cm);	
	}
	@Override
	public CategoryModel get(int cno) throws Exception {
		return sf.getCurrentSession().get(CategoryModel.class, cno);              
	}
	@Override
	public void modify(CategoryModel cm) throws Exception {
		sf.getCurrentSession().saveOrUpdate(cm);	
	}
	@Override
	public void delete(CategoryModel cm) throws Exception {
		sf.getCurrentSession().delete(cm);
	}
	@Override
	public CategoryModel getWithArticles(int cno) throws Exception {
		String hql="from CategoryModel cm inner join fetch cm.articles am where cm.cno=:cno";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setInteger("cno", cno);
		CategoryModel cm=(CategoryModel) query.uniqueResult();
		return cm;
	}
	@Override
	public List<CategoryModel> getList() throws Exception {
		return sf.getCurrentSession().createQuery("from CategoryModel").list();
	}

}
