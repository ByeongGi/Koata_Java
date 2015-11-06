package or.kosta.mvc.vo;

public class Bbs1CommVo {
/*	NUM
	KCODE
	CNT
	WRITER
	COMM
	REIP
	REGDATE*/
	
	private int num , kcode , cnt ;
	private String writer, comm , reip , regdate;
	
	public int getNum() {
		return num;
	}
	public int getKcode() {
		return kcode;
	}
	public int getCnt() {
		return cnt;
	}
	public String getWriter() {
		return writer;
	}
	public String getComm() {
		return comm;
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
	public void setKcode(int kcode) {
		this.kcode = kcode;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public void setReip(String reip) {
		this.reip = reip;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
