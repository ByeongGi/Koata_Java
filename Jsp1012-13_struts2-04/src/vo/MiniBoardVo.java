package vo;

import java.io.Serializable;

public class MiniBoardVo {
	/*
	NUM	NUMBER(10,0)
	SUB	VARCHAR2(100 BYTE)
	WRITER	VARCHAR2(34 BYTE)
	CONT	CLOB
	REIP	VARCHAR2(40 BYTE)
	BDATE	DATE
	*/
	private String sub,writer,cont,bdate,reip;
	private int num;
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getReip() {
		return reip;
	}
	public void setReip(String reip) {
		this.reip = reip;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
