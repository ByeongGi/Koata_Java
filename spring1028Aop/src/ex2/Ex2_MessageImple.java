package ex2;

public class Ex2_MessageImple implements Ex2_Message{
	private String message;
	public Ex2_MessageImple() {
		message ="즐거운 점심 시간이 됩시다!";
		
	}
	
	
	@Override
	public void print() {
		// 전에 수행할 작업 
		System.out.println("[Message]"+message);
		// 수행후에 적용할 작업
	}

	@Override
	public String msg() {
		return this.message;
	}

	@Override
	public void print2() {
		System.out.println("[Message2]"+message);
		
	}

}
