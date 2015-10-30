package ex3;

public class IndoOrder implements MenuInter{

	@Override
	public String order(String orderName) {
		StringBuffer sb = new StringBuffer();
		sb.append("주문하신 인도 요리의 이름은 :").append(orderName);
		return sb.toString();
	}

}
