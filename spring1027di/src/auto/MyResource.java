package auto;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class MyResource {
	@Autowired    			// <bean id="msg2" name="msg2" /> bean 에 설정한 이름으로 찾아감
	@Resource(name="msg2") 
	private String msg;
	public String printMsg(){
		return "당신의 결정은 "+msg;
	}
}
