package exam;

public class LogIn_Exception extends Exception {
	private String message;

	public LogIn_Exception(String msg) 
	{
		this.message = msg;
	}

	public String getMessage() 
	{
		return message;
	}
}
