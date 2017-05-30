package kr.re.kitri.bbs.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.re.kitri.bbs.vo.ArticleVo;
import kr.re.kitri.service.MessageService;

public class BbsServiceTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("/applicationContext.xml");

		BbsService service = ctx.getBean("bbsService", BbsService.class);
		
		service.writeArticle(new ArticleVo());
		
		List<ArticleVo> list = service.viewAllArticles();
		System.out.println(list);
	}

}
