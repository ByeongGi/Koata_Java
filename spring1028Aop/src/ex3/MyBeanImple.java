package ex3;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanImple implements MyBean{
	@Autowired
	private String msg;
	
	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("NAME : ").append(",MSG : ").append(msg);
		// 로깅 공통 관심 사항을 적용하고 싶은것임
		System.out.println("핵심 로직 검사 -----------------!!!!!!");
		return sb.toString();
	}

}
