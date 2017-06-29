package com.lhx.blog.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lhx.blog.model.ArticleModel;
import com.lhx.blog.model.TagModel;
import com.lhx.blog.service.IArticleService;
@Service("articleService")
@Transactional
public class ArticleServiceImpl implements IArticleService {
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public void add(ArticleModel am) throws Exception {
		sf.getCurrentSession().save(am);	
	}
	@Override
	public void modify(ArticleModel am) throws Exception {
		sf.getCurrentSession().update(am);		
	}
	@Override
	public void delete(ArticleModel am) throws Exception {
		sf.getCurrentSession().delete(am);		
	}
	@Override
	public ArticleModel getArticle(int ano) throws Exception {	
		return  sf.getCurrentSession().get(ArticleModel.class, ano);
	}

	@Override
	public List<ArticleModel> getListByAll() throws Exception {
		return sf.getCurrentSession().createQuery("from ArticleModel", ArticleModel.class).getResultList();
	}
	//取得指定类别的文章列表
	@Override
	public List<ArticleModel> getListByCategory(int cno) throws Exception {
		//String hql="select am from ArticleModel am inner join am.category cm where cm.cno=:cno";
		String hql="from ArticleModel am where am.category.cno=:cno";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setInteger("cno", cno);
		List<ArticleModel> list=query.list();
		return list;
	}
	//取得指定文章的爱好列表
		@Override
	public List<TagModel> getTagsByArticle(int ano) throws Exception {
			String hql="from TagModel tm where tm.articles.ano=:ano";
			Session session=sf.getCurrentSession();
			Query query=session.createQuery(hql);
			query.setInteger("ano", ano);
			List<TagModel> list=query.list();
			return list;
		}
	//取得指定类别的文章数
	public int getCountByCategory(int cno) throws Exception {
		String hql="select count(am) from ArticleModel am where am.category.cno=:cno";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setInteger("cno", cno);
		Long count=(Long) query.uniqueResult();
		return  count.intValue();
	}

	@Override
	public void addTag(int ano, int tno) throws Exception {
		Session session=sf.getCurrentSession();
		ArticleModel am=session.get(ArticleModel.class, ano);
		TagModel cm=session.get(TagModel.class, tno);
		am.getTags().add(cm);
		cm.getArticles().add(am);
	}

	public void addTags(int ano, int[] tnos) throws Exception {
		Session session=sf.getCurrentSession();
		ArticleModel am=session.get(ArticleModel.class, ano);
		for(int t :tnos){
			TagModel cm=session.get(TagModel.class,t);
			am.getTags().add(cm);
			cm.getArticles().add(am);
		}
	}

	public boolean hasSpecificTag(int ano, int tno) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	//取得没有标签的文章列表
	public List<ArticleModel> getListWithoutTag() throws Exception {
		String hql="from ArticleModel am where am not in (select a from"
				+ "TagModel tm inner join tm.articles a)";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		List<ArticleModel> list=query.list();
		return list;
		}
	//取得指定页的文章列表 page 页的序号 rows 每页显示的文章数
	@Override
	public List<ArticleModel> getListByAllWithPage(int rows, int page) throws Exception {
		Session session=sf.getCurrentSession();
		String hql="from ArticleModel";
		Query query=session.createQuery(hql);
		query.setFirstResult(rows*(page-1));
		query.setMaxResults(rows);
		List<ArticleModel> list=query.getResultList();
		return list;
	}
	public List<ArticleModel> getListBySearchTitle(String title) throws Exception {
		String hql = "from ArticleModel am where am.title like '%" + title + "%'";
		List<ArticleModel> allArticlesByTitle=sf.getCurrentSession().createQuery(hql).getResultList();
		return allArticlesByTitle;
	}
	public int getPageCountBySearch(int cno, int rows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<ArticleModel> getListByTag(int tno) throws Exception {
		String hql="from ArticleModel am inner join fetch am.tags tm where tm.tno=:tno";
		Session session=sf.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setInteger("tno",tno);
		List<ArticleModel> list=query.list();
		return list;
	}
	@Override
	public void modify(ArticleModel am, int[] tags) throws Exception {
		am=sf.getCurrentSession().get(ArticleModel.class, am.getAno());
		for(int tno :tags){
			TagModel tm=(TagModel) sf.getCurrentSession().get(TagModel.class, tno);
			am.getTags().add(tm);
			
		}
		sf.getCurrentSession().update(am);
	}

}
