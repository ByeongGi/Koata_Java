package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
		
		DaoInter dao=ctx.getBean("target",DaoInter.class);
		dao.first();


		System.out.println("==========================");
		dao.second();
		System.out.println("=========================");
		dao.third();
		
	}
}

