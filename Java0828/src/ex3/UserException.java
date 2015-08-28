package ex3;
// @author kosta, 2015. 8. 28 , 오후 4:15:44 , UserException 
public class UserException extends Exception{
    private int port;
    
    public UserException(String message) {
        super(message);
    }
    
    public UserException(String message,int port) {
        super(message);
        this.port = port;
    }

    public int getPort() {
        return port;
    }
    
    
}
