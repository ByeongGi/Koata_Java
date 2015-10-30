package ex2;

public class Ex2_Message {
	
	private Ex2_Resource resource;

	public void setResource(Ex2_Resource resource) {
		this.resource = resource;
	}
	
	// Spring으로부터  di 를 받기 위한 메서드
	public String msgPrint(){
		String name = resource.getName();
		return name + "님 안녕하세요";
		
		
	}
}
