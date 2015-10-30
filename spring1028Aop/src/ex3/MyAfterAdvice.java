package ex3;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) 
			throws Throwable {
		System.out.println("After Start =====================!!!!!");
		System.out.println("LOG "+arg0);
		System.out.println("LOG "+arg1);
		System.out.println("LOG "+arg2);
		System.out.println("LOG "+arg3);
		System.out.println("AfterReturingAdvice!!!!!");
		System.out.println("After End =====================!!!!!");
	}

}
