package ex1;

public class Ex1_MessegeApp {
	private String msg;
	// setter는 Property이다.
	// 스프링은 외부 조립기에 해당, 외부 조립기는 객체들의 관계를 맞추는 역할을 한다.
	// 스프링 컨터이너에서는 싱글톤 레지스토리가 있어서 빈으로 동록한 모든 객체를 
	// 싱글톤 레지스터리에 등록해놓고 사용한다. 그러면 이 빈은 싱글토으로 관리한다.
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	// 스프링 컨테이너에 의해서 연결된 레퍼런스로 접근할 메서드
	public String printMsg(){
		StringBuffer sb = new StringBuffer();
		sb.append("당신이 입력한 메세지 ").append("msg").append("입니다.");
		return sb.toString();
	}
	

}
