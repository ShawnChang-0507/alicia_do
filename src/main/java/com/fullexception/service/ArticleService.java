package com.fullexception.service;

import java.util.List;

import com.fullexception.entity.Article;

public interface ArticleService {

	/**
	 * 通过作者得到当前作者所有文章
	 * 
	 * @param authorId
	 * @param currentPage
	 *            当前页，分页用
	 * @return
	 */
	public List<Article> showArticleByAuthorId(int authorId, int currentPage);
}