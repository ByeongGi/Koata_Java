package exam;

public class OrderSystem {
	private OrderInter menu;

	public OrderInter getMenu() {
		return menu;
	}

	public void setMenu(OrderInter menu) {
		this.menu = menu;
	}
	
	public String printOrder(OrderVo vo){
		return menu.order(vo);
	}
}
