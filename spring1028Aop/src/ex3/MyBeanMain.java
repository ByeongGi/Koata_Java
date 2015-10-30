package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sun.security.jca.GetInstance.Instance;

public class MyBeanMain {
	public static void main(String[] args) {
		ApplicationContext ctx= 
				new GenericXmlApplicationContext("ex3/mybean.xml");
		String[] list=ctx.getBeanDefinitionNames();
		for (String string : list) {
			System.out.println("Bean "+string);
		}
			
		MyBean mbi = ctx.getBean("pfBean",MyBean.class); // 프록시 객체를 가져온다.
		System.out.println(mbi.myGetMessage("김병기"));
		System.out.println(mbi.getClass().getName());
		System.out.println(mbi instanceof  MyBean );
		System.out.println(mbi instanceof  MyBeanImple );
	}
	
}
