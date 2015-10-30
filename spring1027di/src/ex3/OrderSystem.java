package ex3;

public class OrderSystem {
	// Interface를 has a 관계로 Spring으로 부터 DI를 받기 위해서 정의
	private MenuInter menu; // 메뉴판 ...

	public MenuInter getMenu() {
		return menu;
	}

	public void setMenu(MenuInter menu) {
		this.menu = menu;
	}
	
	public String printMenu(String orderName){
		return menu.order(orderName); // 구현 객체의 order 메서드를 호출 
	}
	
	
	
}
