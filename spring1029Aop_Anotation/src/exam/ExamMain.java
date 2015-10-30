package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ExamMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/exam.xml");
		BizService bs =ctx.getBean("bizsecurity",BizService.class);
		bs.securityMethod();
	}
}
