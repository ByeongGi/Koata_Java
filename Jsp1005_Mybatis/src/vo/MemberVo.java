package vo;

public class MemberVo {
	/*
	NUM	NUMBER
	ID	VARCHAR2(20 BYTE)
	PWD	VARCHAR2(20 BYTE)
	NAME	VARCHAR2(45 BYTE)
	POST	CHAR(10 BYTE)
	ROADADDRESS	VARCHAR2(300 BYTE)
	JIBUNADDRESS	VARCHAR2(300 BYTE)
	EDATE	DATE
	*/
	private int num;
	private String id,pwd,name,post,roadAddress,jibunaddress,date;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getRoadAddress() {
		return roadAddress;
	}
	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}
	public String getJibunaddress() {
		return jibunaddress;
	}
	public void setJibunaddress(String jibunaddress) {
		this.jibunaddress = jibunaddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
