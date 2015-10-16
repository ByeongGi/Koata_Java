package action;

public class HelloAction {
	
	// ValueSatack
	private String msg;
	
	public HelloAction() {
		System.out.println("HelloAction() 생성");
	
	}
	
	
	// 액션 호출기가 호출하는 메서드 예약 execute()
	public String execute() throws Exception{
		System.out.println("execute 호출!");
		this.msg = "안녕하세요"; // ValueStack에 값을 하는것 
		return "success";
	}

	// getter 를 제공해서 뷰에서 값을 인출할수 있는 프로퍼티를 제공해야한다.
	public String getMsg() {
		return msg;
	}
	
	
	
}
