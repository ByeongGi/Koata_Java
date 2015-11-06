package or.kosta.mvc.vo;


/*
NUM
ID
PWD
NAME
GENDER
REGDATE
*/

public class MemberVo {
	private int num;
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private String regdate;
	public int getNum() {
		return num;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
