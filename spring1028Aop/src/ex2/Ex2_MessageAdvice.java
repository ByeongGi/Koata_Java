package ex2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
// AOP Aopalliance 에서 제공받은 Interceptor를 사용
// 이것은 Spring의 Advice중에 Around Advice와 동일함
//
public class Ex2_MessageAdvice implements MethodInterceptor{

	@Override // invocation : 수행할 정보
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// start 시간 값 
		System.out.println(" 비지니스 로직이  수행 전에 수행할 작업");
		// 핵심 비지니스 로직을 호출 
		Object rev=invocation.proceed(); // target 메서드를 호출한다.
		if(rev !=null){
			System.out.println(rev);
		}
		// end 시간값과 연산결과 등
		System.out.println("비지니스 로직이 수행한 후 수행할 작업");
		return rev;
	}

}
