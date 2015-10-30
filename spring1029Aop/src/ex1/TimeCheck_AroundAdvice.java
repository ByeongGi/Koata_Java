package ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeCheck_AroundAdvice{
	// Around Advice를 결정했으니까 메서드 이름은 자유롭게 명명하더라도
	// 반드시 JoinPoint를 알아야 하므로 매개 변수로 ProceedingJoinPoint 를 인자로 받아서
	// 타겟 객체의 메서드 호출 시점을 알아야 전후로 감싸서 완성할수 있다.
	public void checkTime(ProceedingJoinPoint pjb)throws Throwable{
		long start =System.currentTimeMillis();
		pjb.proceed(); // Target 객체의 메서드를 호출
		long end =System.currentTimeMillis();
		System.out.println((end-start)+"초");
	}
}
