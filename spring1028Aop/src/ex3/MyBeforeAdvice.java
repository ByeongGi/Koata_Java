package ex3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] id, Object target) throws Throwable {
		System.out.println("LOG Before Start: ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("LOG 메서드 이름" + method.getName());
		System.out.println("LOG 파라미터 타입" + method.getParameterTypes());
		System.out.println("LOG 파라미터 갯수" + method.getParameterCount());
		System.out.println("LOG 타겟" + target.getClass().getName());
		String idv = (String) id[0];
		System.out.println("LOG ID " +idv);
		System.out.println("MethodBeforeAdvice!!!!!");
		System.out.println("LOG Before End: ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	
	}

}
