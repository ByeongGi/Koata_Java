package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect // Aspect 어노테이션 : <aop:config> : proxyFactoryBean
public class BizAdvice {
	@Autowired 
	private SimpleDateFormat f;
	@Autowired
	private Scanner sc;
	@Resource(name="today")
	private Date d;
	
	@Before("execution(* ex2.BizService*.*(..))")
	public void beforeMethod(){
		System.out.println("당신의 이름은 ? ");
		String n = sc.nextLine();
		System.out.println("이름 : "+ n);
		System.out.println("이름 : "+ f.format(d));
		
	}
	
	@AfterReturning(pointcut="execution(* ex2.BizServiceImple.second(..))" , returning="ret")
	public void myReturnMethod(JoinPoint jp,Object ret)
	{
		String name = jp.getSignature().getName();
		System.out.println("Name"+name);
		System.out.println("반환값"+ret);
	}
	
}
