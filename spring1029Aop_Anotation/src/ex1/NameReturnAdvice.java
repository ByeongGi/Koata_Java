package ex1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class NameReturnAdvice 
{ // Object ret 핵심 비지니스 로직이 반환하는 값이 넘겨옴 
		
		@AfterReturning(pointcut="execution(* ex1.DaoImple.second())",returning="ret")
		public void myReturnMethod(JoinPoint jp,Object ret)
		{
			String name = jp.getSignature().getName();
			System.out.println("Name"+name);
			System.out.println("반환값"+ret);
		}
}
