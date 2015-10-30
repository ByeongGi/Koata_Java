package ex1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class LifeMain2 {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/ex1/ex2_LifeCycle1.xml");
		XmlBeanFactory  factory = new XmlBeanFactory(resource);
		
		Ex2_LifeCycle life = factory.getBean("lifetest2",Ex2_LifeCycle.class);
		factory.destroyBean("lifetest2",life);
		System.out.println("get :"+life.getMsg());
		
	}
}
