package ex1;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
		String beanName[]=ctx.getBeanDefinitionNames();
		int num=ctx.getBeanDefinitionCount();
		System.out.println("LOG CNT BEAN :"+num);
		for (String name : beanName) {
			System.out.println(name);
		}
		DaoInter dao=ctx.getBean("dao",DaoInter.class);
		// dao.first();
		System.out.println(dao.getClass().getSimpleName());
		
		System.out.println("인터페이스를 얻어오라"+dao.getClass().getDeclaredFields());
		Method[] m= dao.getClass().getMethods();
		for (Method method : m) {
			System.out.println("프록시 메소드 이름 :"+method.getName());
		}
		
		System.out.println("==========================");
		//dao.second();
		System.out.println("=========================");
		//dao.third();
		
	}
}
