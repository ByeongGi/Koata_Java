package exam;

public class OrderImp implements OrderInter{

	@Override
	public String order(OrderVo vo) {
		StringBuffer sb = new StringBuffer();
		sb.append("주문자 :"+vo.getName()+"<br>")
		.append("주문상품 : " +vo.getOrderName()+"<br>")
		.append("가격 :" + vo.getPrice() + "<br>")
		.append("갯수 :" +vo.getQuant()+"<br>");
		
		return sb.toString();
	}

}
