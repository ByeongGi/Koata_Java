package vo;

public class Chat_Vo {
	/*CREATE TABLE CROOM(
			NUM NUMBER CONSTRAINT CROOM_NUMPK PRIMARY KEY,
			U_ID VARCHAR2(34),
			CHAT CLOB,
			REIP VARCHAR2(45),
			CDATE DATE
	);*/
	
	private int num;
	public int getNum() {
		return num;
	}
	public String getU_id() {
		return u_id;
	}
	public String getChat() {
		return chat;
	}
	public String getReip() {
		return reip;
	}
	public String getCdate() {
		return cdate;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	public void setReip(String reip) {
		this.reip = reip;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	private String u_id;
	private String chat;
	private String reip;
	private String cdate;
	
}
