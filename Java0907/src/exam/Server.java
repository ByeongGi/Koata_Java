package exam;

// @author kosta, 2015. 9. 7 , 오후 4:01:27 , Server 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    private ServerSocket ss;
    private ArrayList<ServerThreadParam> sList;

    public Server(int port) {
        sList = new ArrayList<>();
        try {
            ss = new ServerSocket(port);
           
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void sendMsg(String str0, String str1, String str2, String str3, ServerThreadParam aThis) {
        String msg = "";
        if ("talk".equals(str0)) {
            System.out.println("Talk 서비스");
            msg = "talk 서비스 ";
        } else if ("draw".equals(str0)){
            System.out.println("draw 서비스");
            msg = "draw 서비스 ";
        } else if("servece3".equals(str0)){
            System.out.println("servece3 서비스");
            msg = "servece3 서비스 ";
        }
        
        for (ServerThreadParam s : sList) {
            s.getPw().println(msg);
        }
        
    }
    
    public void ex(int port){
        try {
            while (true) {
                Socket s = ss.accept();
                System.out.println("사용자 접속 - : "+s.getInetAddress().getHostAddress());
                ServerThreadParam t = new ServerThreadParam(s, this);
                sList.add(t);
                t.start();
                System.out.println("사용자 숫자"+sList.size());
            }
           
        } catch (IOException ex) {
          
        }
    }
    
    public static void main(String[] args) {
         Server s=new Server(9999);
         s.ex(9999);
        
    }
}
