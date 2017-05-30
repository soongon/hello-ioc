package kr.re.kitri.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageServiceTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("/applicationContext.xml");
		

		MessageService service = ctx.getBean("messageService", MessageService.class);
		
		String msg = service.getMessage();
		
		System.out.println(msg);

	}

}
