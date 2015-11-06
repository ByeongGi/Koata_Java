package or.kosta.mvc.vo;

import java.util.HashMap;

public class SearchOptionVo {
	private int orderType;
	private int searchType;
	private String searchValue;
	
	public int getOrderType() {
		return orderType;
	}
	public int getSearchType() {
		return searchType;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
	public HashMap<String,Object> getData(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("orderType", this.orderType);
		map.put("searchType", this.searchType );
		map.put("searchValue", this.searchValue);
		return map;
	}
}
