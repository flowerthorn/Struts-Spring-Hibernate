package com.lhx.blog.service.impl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.ITagService;
@Service("tagService")
@Transactional
public class TagServiceImpl  implements ITagService{
	private SessionFactory sf=null;
	
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void add(TagModel tm) throws Exception {
		sf.getCurrentSession().save(tm);
		
	}

	@Override
	public void modify(TagModel tm) throws Exception {
		sf.getCurrentSession().update(tm);
		
	}

	@Override
	public void delete(TagModel tm) throws Exception {
		sf.getCurrentSession().delete(tm);
		
	}

	@Override
	public TagModel getTag(int tno) throws Exception {
		return sf.getCurrentSession().get(TagModel.class, tno);
	}

	@Override
	public List<TagModel> getListByAll() throws Exception {
		Session session=sf.getCurrentSession();
		
		String hql="from TagModel";
		Query query=session.createQuery(hql);
		List<TagModel> list=query.list();
		
		return list;
	}
	//取得没有文章的标签列表
	public List<TagModel> getTagsWithoutArticle() throws Exception {
		Session session=sf.getCurrentSession();
		String hql="from TagModel tm where bm not in(select bm from ArticleModel am inner join am.tags bm)";
		Query query=session.createQuery(hql);
		List<TagModel> list=query.list();
		return list;
	}

}
