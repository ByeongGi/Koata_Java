package ex2;

public class BizServiceImple implements BizService{

	@Override
	public void bizMethod1() {
		System.out.println("비지니스 로직 수행 1");
	}

	@Override
	public void testbizMethod2() {
		System.out.println("비지니스 로직 수행 2");
		
	}

	@Override
	public void securityMethod() {
		System.out.println("비지니스 로직 수행 3");
		
	}

	@Override
	public String second() {
		StringBuffer sb= new StringBuffer();
		sb.append("-------------------").append("\n");
		sb.append("김길동").append("\n");
		sb.append("-------------------").append("\n");
		return sb.toString();
		
	}

	

}
