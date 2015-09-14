package exam;

// @author kosta, 2015. 9. 7 , 오후 4:02:38 , ServerThread 

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerThreadParam extends Thread{
    private Socket s;
    private Server server;
    
    private PrintWriter pw;
    
    private BufferedReader bw;
    
    
    
    public ServerThreadParam(Socket s ,Server server) {
        this.s = s;
        this.server = server;
        
        try { // 클라이언트에게 메세지를 다시 보내주기 위해서 선언 
            pw= new PrintWriter( new BufferedOutputStream(s.getOutputStream()), true);
        } catch (IOException ex) {
           
        }
    }

    @Override
    public void run() {
        try {
             // 클라이언트에게 메세지를 받기 위해서 선언 
            bw = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while (true) {                
                String msg =bw.readLine();
                System.out.println("msg");
                transMsg(msg);
            }
        } catch (IOException ex) {
           
        }
    }
    
    public void transMsg(String msg){
         StringTokenizer stn = new StringTokenizer(msg,"/");
        String str0 = stn.nextToken();
        String str1 = stn.nextToken();
        String str2 = stn.nextToken();
        String str3 = stn.nextToken();
        System.out.println("Log0 : "+ str0 );
        System.out.println("Log1 : "+ str1 );
        System.out.println("Log2 : "+ str2 );
        System.out.println("Log3 : "+ str3 );
        
        // 파라미터 분석후 서버에서 서비스 분기후 처리 
        this.server.sendMsg(str0,str1,str2,str3,this);
    }

    public PrintWriter getPw() {
        return pw;
    }
    
    
    
}
