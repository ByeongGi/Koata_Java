package model;
// Model이 수행한 후에 Controller 에게 
// 보고할 필요한 정보를 가진 클래스 
public class ActionFoword {
	// View의 정보 , forward or redirect 로 이동할것인지
	private String url;
	private boolean method;
	public ActionFoword(String url, boolean method) {
		this.url = url;
		this.method= method;
	}
	public String getUrl() {
		return url;
	}
	
	public boolean isMethod() {
		return method;
	}
	
}
