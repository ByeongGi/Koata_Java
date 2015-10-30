package exam2.ioc_container;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bean_Collection_Object {
	private Map<String, String> map;
	private Properties prop;
	private Set<String> set;
	private List<String> list;
	
	public Bean_Collection_Object(Map<String, String> map, Properties prop,
			Set<String> set, List<String> list) {
		this.map = map;
		this.prop = prop;
		this.set = set;
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
}
