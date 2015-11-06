package or.kosta.mvc.vo;
/*
 * 
 *
NUM	    NUMBER
DNAME	VARCHAR2(20 BYTE)
SABUN	NUMBER(10,0)
SANAME	VARCHAR2(34 BYTE)
SAPAY	NUMBER(6,0)
PAYDATE	DATE
EDATE	DATE
 * 
 */
public class SawonPayVo {
	private int num;
	private String dname;
	private int sabun;
	private String saname;
	private int sapay;
	private String paydate;
	private String edate;
	public int getNum() {
		return num;
	}
	public String getDname() {
		return dname;
	}
	public int getSabun() {
		return sabun;
	}
	public String getSaname() {
		return saname;
	}
	public int getSapay() {
		return sapay;
	}
	public String getPaydate() {
		return paydate;
	}
	public String getEdate() {
		return edate;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public void setSaname(String saname) {
		this.saname = saname;
	}
	public void setSapay(int sapay) {
		this.sapay = sapay;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
}
