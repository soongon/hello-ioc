package kr.re.kitri.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.bbs.dao.ArticleDao;
import kr.re.kitri.bbs.service.BbsService;
import kr.re.kitri.bbs.vo.ArticleVo;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public void writeArticle(ArticleVo vo) {
		this.articleDao.insertArticle(vo);
	}

	@Override
	public List<ArticleVo> viewAllArticles() {
		return this.articleDao.selectAllArticles();
	}

}
