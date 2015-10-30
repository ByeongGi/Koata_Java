package action;

import org.springframework.beans.factory.annotation.Autowired;

public class ActionForward 
{
	private String url; // 이동할 view
	private boolean method; // 이동 방식 forward / redirect
 	
	@Autowired
	public ActionForward(String url, boolean method) 
	{
		this.url = url;
		this.method = method;
	}

	public String getUrl() 
	{
		return url;
	}

	public boolean isMethod() 
	{
		return method;
	}

	public void setUrl(String url) 
	{
		this.url = url;
	}

	public void setMethod(boolean method) 
	{
		this.method = method;
	}
	
	
	
}
