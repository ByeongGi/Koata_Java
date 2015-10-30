package auto;

import org.springframework.beans.factory.annotation.Required;

// Required 필수 Property를 검사해주는 어노테이션
// 개발자가 실수로 Property 를 주입하지 않았을때 오류를 던짐
public class Ex9_Required {
	
	private String name;
	private String msg;
	public void print(){
		System.out.println("NAME:" + name);
		System.out.println("MSG:" + msg);
	}
	
	public Ex9_Required(){}
	
	public Ex9_Required(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
