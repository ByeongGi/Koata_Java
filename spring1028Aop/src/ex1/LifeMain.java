package ex1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
// Bean 의 라이프 사이클 
public class LifeMain {
	public static void main(String[] args) {
		// BeanFatory 객체를 생성
		Resource resource = new FileSystemResource("src/ex1/ex1_LifeCycle1.xml");
		XmlBeanFactory  factory = new XmlBeanFactory(resource);
		
		Ex1_LifeCycle life = factory.getBean("lifetest",Ex1_LifeCycle.class);
		factory.destroyBean("lifetest",life);
		System.out.println("get :"+life.getMsg());
		
		//  Spring Container 작업 순서
		//  1. XML 빈 설정 
		//  2. bean 의 Object를 생성
		//  3. Property Injection(DI)
		//  4. init-method
		//  5. destoyed 빈종료
		//  6. 객체를 호출한 자원이 있다면 사용 getMsg()
	}
}
