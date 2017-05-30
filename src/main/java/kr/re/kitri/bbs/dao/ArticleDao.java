package kr.re.kitri.bbs.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.re.kitri.bbs.vo.ArticleVo;

public class ArticleDao {

	public List<ArticleVo> selectAllArticles() {
		// ���� ������ �����ؼ� �����͸� ������
		List<ArticleVo> list = new ArrayList<>();
		
		ArticleVo vo1 = new ArticleVo(1,"����1","kim","�׽�Ʈ�Դϴ�.", new Date());
		ArticleVo vo2 = new ArticleVo(2,"����2","lee","�׽�Ʈ�Դϴ�2.", new Date());
		ArticleVo vo3 = new ArticleVo(3,"����3","park","�׽�Ʈ�Դ�3��.", new Date());
		ArticleVo vo4 = new ArticleVo(4,"����4","choi","�׽�Ʈ�Դϴ�4.", new Date());
		
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
