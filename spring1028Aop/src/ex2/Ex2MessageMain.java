package ex2;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class Ex2MessageMain {
	public static void main(String[] args) {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		
		
		// Target : AOP 적용 되는 객체
		Ex2_MessageImple target = new Ex2_MessageImple();
		pfBean.setTarget(target);
		
		// PointCut : 메서드의 이름을 찾아서 분류한다.
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.setMappedName("pri*"); // 필터링 하기 
		
		
		// Advice
		Ex2_MessageAdvice advice = new  Ex2_MessageAdvice();
		// pfBean.addAdvice(advice);
		
		// Advisor -> Advisor에 포인트컷과 어드바이스 등록
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
		
		// 메서드 호출 
		
		Ex2_Message prMessage = (Ex2_Message)pfBean.getObject(); 
		// 참고 리턴시 제네릭 Return 해당 형변환한 객체로 으로 리턴한다.
		// Proxy 객체를 반환받는다.이떄 받은 객체는 Ex2_Message의 인터페이스형으로 
		// 내부적으로 Proxy 객체가 생성되어 사용자의 해당 메소드의 요청이 들어오면
		// advice 에 설정된대로 작동된다.
		
		prMessage.print();
		System.out.println("====================");
		prMessage.print2();
		System.out.println("====================");
		String msg = prMessage.msg();
		System.out.println("====================");
	}
}
