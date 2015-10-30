package exam;

public class OrderVo {
	private String name;
	private String orderName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	private int price;
	private int quant;
}
