package kr.re.kitri.bbs.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.re.kitri.bbs.vo.ArticleVo;

public class ArticleDao {

	public List<ArticleVo> selectAllArticles() {
		// 실제 쿼리를 수행해서 데이터를 가져옴
		List<ArticleVo> list = new ArrayList<>();
		
		ArticleVo vo1 = new ArticleVo(1,"제목1","kim","테스트입니다.", new Date());
		ArticleVo vo2 = new ArticleVo(2,"제목2","lee","테스트입니다2.", new Date());
		ArticleVo vo3 = new ArticleVo(3,"제목3","park","테스트입니3다.", new Date());
		ArticleVo vo4 = new ArticleVo(4,"제목4","choi","테스트입니다4.", new Date());
		
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		
		return list;
	}

	public void insertArticle(ArticleVo vo) {
		System.out.println("insert ok..");
	}

}
