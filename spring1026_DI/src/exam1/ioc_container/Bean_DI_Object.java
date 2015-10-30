package exam1.ioc_container;

public class Bean_DI_Object {
	// 주입받는 객체 
	private Bean_Injection_Object injection_Object;	
	public Bean_DI_Object(){}
	// 의존성 관계를 생성자를 통해서 주입 받는법
	public Bean_DI_Object(Bean_Injection_Object injection_Object) {
		this.injection_Object = injection_Object;
	}

	// 의존성 관계를 setter를 통해서 주입 받는 법
	public void setInjection_Object(Bean_Injection_Object injection_Object) {
		this.injection_Object = injection_Object;
	}
	public Bean_Injection_Object getInjection_Object() {
		return injection_Object;
	}
	
	public String printMsg(){
		return injection_Object.msg();
	}
	
}
