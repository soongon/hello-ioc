package kr.re.kitri.bbs.service;

import java.util.List;

import kr.re.kitri.bbs.dao.ArticleDao;
import kr.re.kitri.bbs.vo.ArticleVo;

/**
 * 게시판 기능 
 * @author Administrator
 *
 */
public class BbsService {
	
	private ArticleDao articleDao;
	
	public BbsService(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	//글쓰기
	public void writeArticle(ArticleVo vo) {
		this.articleDao.insertArticle(vo);
	}
	
	//전체글 보기
	public List<ArticleVo> viewAllArticles() {
		return this.articleDao.selectAllArticles();
	}
}
