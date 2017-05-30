package kr.re.kitri.bbs.service;

import java.util.List;

import kr.re.kitri.bbs.dao.ArticleDao;
import kr.re.kitri.bbs.vo.ArticleVo;

/**
 * �Խ��� ��� 
 * @author Administrator
 *
 */
public class BbsService {
	
	private ArticleDao articleDao;
	
	public BbsService(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	//�۾���
	public void writeArticle(ArticleVo vo) {
		this.articleDao.insertArticle(vo);
	}
	
	//��ü�� ����
	public List<ArticleVo> viewAllArticles() {
		return this.articleDao.selectAllArticles();
	}
}
