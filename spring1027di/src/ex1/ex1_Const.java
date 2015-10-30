package ex1;
// 생성자로 주입을 받은 때 기본값은 String 타입이다.
public class ex1_Const implements Service{
	private int num;
	private String name,str;
	
	public ex1_Const(String str) {
		this.str=str;
		System.out.println("String 형 생성자가 호출되었습니다.");
	
	}
	
	public ex1_Const(int num) {
		this.num=num;
		System.out.println("Int 형 생성자가 호출되었습니다.");
		
	}
	
	@Override
	public String print() {
		int res= num* 10;
		System.out.println("Num:"+res);
		return String.valueOf(res);
	}
	
	// 새로운 Bean 을 만들어서 호출 한 후 moniter() 로 값을 출력해봅시다.
	public ex1_Const(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public String call() {
		StringBuffer s = new StringBuffer();
		s.append(str).append("★");
		return s.toString();
	}
	
	@Override
	public String moniter() {
		StringBuffer s = new StringBuffer();
		s.append("Num : ").append(num +10).append("</br>");
		s.append("NAME: ").append(name);
		return  s.toString();
	}

}
