package action;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;
	private String contentType, contentDisposition;
	private long contentLength;
	private String inputName,bufferSize;
	
	public FileInputStream input;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println("log"+req.getContextPath());
		System.out.println(req.getRealPath("/upload"));
		
		
		
		String basePath = getText("file.path");
		System.out.println("BasePath"+basePath);
		String path = basePath + "/" + fileName; // 절대경로를 조사
		System.out.println("PATH :     "+path);
		File f = new File(path);
		// 헤더의 길이를 지정 
		setContentLength(f.length());
		// 클라이언트로부터 전송될때 인코딩을 해줘야 한다.
		// 한글처리를 해주기 위해서 반드시 필요하다.
		setContentDisposition("attachment; filename="+URLEncoder.encode(fileName,"utf-8"));
		input = new FileInputStream(path);
		return SUCCESS;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getBufferSize() {
		return bufferSize;
	}

	public void setBufferSize(String bufferSize) {
		this.bufferSize = bufferSize;
	}

	public FileInputStream getInput() {
		return input;
	}

	public void setInput(FileInputStream input) {
		this.input = input;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
}
