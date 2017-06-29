package com.lhx.blog.service;

import java.util.List;

import com.lhx.blog.model.TagModel;

public interface ITagService {
		//增加标签
		public void add(TagModel tm) throws Exception;
		//修改标签
		public void modify(TagModel tm) throws Exception;
		//删除标签
		public void delete(TagModel tm) throws Exception;
		//取得指定标签
		public TagModel getTag(int tno) throws Exception;
		//取得所有爱好标签
		public List<TagModel>  getListByAll() throws Exception;
		//取得没有文章的标签列表
		public List<TagModel> getTagsWithoutArticle() throws Exception;
}
