package ex1;

public class AfterThrowAdvice {
	
	public void commThrow(Exception ew){
		System.out.println("예외 처리 메서드를편집 :"+ew.getMessage());
	}
}
