package auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWireService {
	// Spring에서 어노테이션은 지금까지 알고 있던 어노테이션과 동일하게
	// 실행이 가능한 주석을 의미한다. Spring3.0부터 지원한다.
	// Autowired 란 자동으로 빈을 묶어 주는 설정인데
	// 빈의 설정을 간소화 할수 있다.
	// 자동으로 빈을 묶는 규칙은 
	// 첫번째 property가 같은 이름의 빈을 찾아준다.(byName)
	// 없으면 같은 자료형의 빈을 찾아준다.(byType)
	// 이때 같은 타입이 빈이 있으면 오류가 나고, byType은 모든 빈을 검색해서
	// 같은 자료형인지 아닌지를 비교하기 때문에 속도가 느려질수 있다.
	// 단) 이름이든 타입이든 유일해야 하고 타입이 같을 경우는 Qualifier 를 사용해야 지정해야한다.
	
	@Autowired  
	@Qualifier("name2") 
	private String name;
	public String printName(){
		StringBuffer sb = new StringBuffer();
		return sb.append("당신의 이름은").append(name).toString();
		
	}
}
