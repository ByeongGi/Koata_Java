package ex1;

// @author kosta, 2015. 9. 4 , 오전 9:37:56 , Ex1_MyClient 

import java.io.IOException;
import java.net.Socket;

public class Ex1_MyClient {
    private Socket s;

    public Ex1_MyClient() {
        try {
            s = new Socket("192.168.7.193",9999);
            System.out.println(s.getInetAddress().getAddress());
            
        } catch (IOException ex) {
       
        
        }
    }
    public static void main(String[] args) {
        new Ex1_MyClient();
    }
    
}
