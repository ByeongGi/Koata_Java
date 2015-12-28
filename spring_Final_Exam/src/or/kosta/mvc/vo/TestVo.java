package or.kosta.mvc.vo;

import org.springframework.web.multipart.MultipartFile;

public class TestVo {
	private int num;
	private String sub, writer, content, pwd, mfile;
	private MultipartFile mfile1;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	public String getMfile() {
		return mfile;
	}

	public MultipartFile getMfile1() {
		return mfile1;
	}

	public void setMfile(String mfile) {
		this.mfile = mfile;
	}

	public void setMfile1(MultipartFile mfile1) {
		this.mfile1 = mfile1;
	}

	public String getSub() {
		return sub;
	}

	public String getWriter() {
		return writer;
	}

	public String getContent() {
		return content;
	}

	public String getPwd() {
		return pwd;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
