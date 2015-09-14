package ex1;

// @author kosta, 2015. 9. 7 , 오전 9:25:10 , ServerThread 

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerThread extends Thread{
    //==========================================================================
    //========================== Member Field ==================================
    //==========================================================================
    private Socket socket;
    private Ex1_Server server;
    private PrintWriter pw;
    private BufferedReader in;
    
    
    //==========================================================================
    //========================== Constructer ===================================
    //==========================================================================
    public ServerThread(Socket socket,Ex1_Server server) {
        this.socket = socket;
        this.server = server;
        
        try {
            this.pw = new PrintWriter(
                new BufferedOutputStream(
                    socket.getOutputStream()),true); // ture -> autoflush
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 
    
    
    @Override
    public void run() {
        // 접속된 사용자(Socket) 하나당 스레드가 각각 붙어서 
        // Socket으로 부터 연결된 Stream 으로 전송되어온 데이터를 
        // 응답해주는 역할을 수행한다.
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {                
                String msg = in.readLine(); // 사용자의 데이터를 읽어들인다.
                System.out.println("Client Msg : "+msg);
                transMsg(msg);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    } // end run()
    
    /**
     * 사용자가 보낸 파라미터를 분석하여 다시 서버로 보낸다.
     * @param msg 
     */
    private void transMsg(String msg){
        // Protocol 분석
        // ex) draw/color/x /y 
        //     talk/nickname/none/none
        //     enter/all/speaker/say
        StringTokenizer stn = new StringTokenizer(msg,"/");
        String str0 = stn.nextToken();
        String str1 = stn.nextToken();
        String str2 = stn.nextToken();
        String str3 = stn.nextToken();
        System.out.println("Log0 : "+str0 );
        System.out.println("Log1 : "+str1 );
        System.out.println("Log2 : "+str2 );
        System.out.println("Log3 : "+str3 );
        // 서버에서 현재 메세지를 접속된 클라이언트에게 
        // 다시 응답 메세지로 만들어져서 보내져야 한다.
        this.server.sendMsg(str0,str1,str2,str3,this);
        
    }
    
    //==========================================================================
    //========================== Getter & Setter ===============================
    //==========================================================================
    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }

    public Socket getSocket() {
        return socket;
    }
    
    
}
