package ex1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ex2_LifeCycle implements LifeService{
	private String msg;
	public Ex2_LifeCycle() {
		System.out.println("1. 생성자 호출");
	}
	
	@Override
	@PostConstruct // 초기화 
	public void init() {
		System.out.println("2. init 호출");
	}
	
	@Override
	@PreDestroy // 해체
	public void destory() {
		System.out.println("3. destory 호출");
	
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("DI 호출"+msg);
	}
}
