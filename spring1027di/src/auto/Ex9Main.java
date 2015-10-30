package auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex9Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("auto/req.xml");
		Ex9_Required er = ctx.getBean("req",Ex9_Required.class);
		er.print();
		
	}
}
