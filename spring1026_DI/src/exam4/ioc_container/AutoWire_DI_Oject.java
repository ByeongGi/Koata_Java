package exam4.ioc_container;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWire_DI_Oject {
	// 1. 가장 먼저 Properties의 이름으로 객체를 찾는다.(byName)
	// 2. 두번째는 같은 형태의 자료형으로 찾는다.
	@Autowired
	private String msg;
	public AutoWire_DI_Oject(){}
	public AutoWire_DI_Oject(String msg){
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	
	
	
}
