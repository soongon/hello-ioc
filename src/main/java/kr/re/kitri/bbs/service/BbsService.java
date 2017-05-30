package kr.re.kitri.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.bbs.dao.ArticleDao;
import kr.re.kitri.bbs.vo.ArticleVo;

/**
 * 게시판 기능 
 * @author Administrator
 *
 */
@Service
public class BbsService {
	
	@Autowired
	private ArticleDao articleDao;

	//글쓰기
	public void writeArticle(ArticleVo vo) {
		this.articleDao.insertArticle(vo);
	}
	
	//전체글 보기
	public List<ArticleVo> viewAllArticles() {
		return this.articleDao.selectAllArticles();
	}
}
