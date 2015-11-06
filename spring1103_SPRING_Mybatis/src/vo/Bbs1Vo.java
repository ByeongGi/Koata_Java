package vo;

public class Bbs1Vo {
/*	NUM
	SUB
	WRITER
	PWD
	CONT
	REIP
	HIT
	REGDATE*/
	private int num , hit ;
	private String sub, writer , pwd , cont, reip , regdate;
	public int getNum() {
		return num;
	}
	public int getHit() {
		return hit;
	}
	public String getSub() {
		return sub;
	}
	public String getWriter() {
		return writer;
	}
	public String getPwd() {
		return pwd;
	}
	public String getCont() {
		return cont;
	}
	public String getReip() {
		return reip;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public void setReip(String reip) {
		this.reip = reip;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}
