package ex1;

public class Ex1_LifeCycle implements LifeService{
	private String msg;
	public Ex1_LifeCycle() {
		System.out.println("1. 생성자 호출");
	}
	@Override
	public void init() {
		System.out.println("2. init 호출");
	}

	@Override
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
