package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// ActionForward를 사용하게 하고 
	// request 와 response 를 model에서 무조건 사용할수 있도록 제공
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response )throws IOException;
}
