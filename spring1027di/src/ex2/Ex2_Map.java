package ex2;

import java.util.Map;
// Spring 에서 Collection을 Element로 지원해준다.
public class Ex2_Map {
	private Map<String, Integer> maps;

	public Map<String, Integer> getMaps() {
		return maps;
	}
	
	// <property 엘리먼트 값 안에 <map> 란 엘리먼트로 정의해서 주입해서 할수 있다.
	public void setMaps(Map<String, Integer> maps) {
		this.maps = maps;
	}
	
	
}
