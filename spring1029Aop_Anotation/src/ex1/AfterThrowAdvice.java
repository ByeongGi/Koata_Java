package ex1;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect // 프록시 빈 팩토리에 등록
public class AfterThrowAdvice 
{
	
	@AfterThrowing(pointcut="execution(* ex1.DaoImple.third())",throwing="ew")
	public void commThrow(Exception ew)
	{
		System.out.println("예외 처리 메서드를편집 :"+ew.getMessage());
	}
}
