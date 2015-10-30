package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

public class IndexAction implements Action{
	private String url;
	private boolean method;
	// Spring  컨테이너로부터 Dao 를 자동으로 주입받는다.
	@Autowired
	private String myName;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		request.setAttribute("myname", myName);
		System.out.println("Log : IndexAction이 수행이 됩니다.");
		// requestScope 값을 저장
		return new ActionForward(url, method);
	}

}
