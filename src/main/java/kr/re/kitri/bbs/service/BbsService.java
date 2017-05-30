package kr.re.kitri.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.bbs.dao.ArticleDao;
import kr.re.kitri.bbs.vo.ArticleVo;

/**
 * �Խ��� ��� 
 * @author Administrator
 *
 */
@Service
public class BbsService {
	
	@Autowired
	private ArticleDao articleDao;

	//�۾���
	public void writeArticle(ArticleVo vo) {
		this.articleDao.insertArticle(vo);
	}
	
	//��ü�� ����
	public List<ArticleVo> viewAllArticles() {
		return this.articleDao.selectAllArticles();
	}
}
