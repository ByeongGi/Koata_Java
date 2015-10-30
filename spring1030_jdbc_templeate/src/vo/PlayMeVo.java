package vo;

/*
NUM NUMBER PRIMARY KEY,
PNAME VARCHAR2(35),
PRICE NUMBER(8),
USERS VARCHAR2(34),
RDATE DATE
 */
public class PlayMeVo {
	private int num;
	private String pname;
	private int price;
	private String users;
	private String rdate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
}
