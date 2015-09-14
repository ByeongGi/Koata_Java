package ex1;
// @author kosta, 2015. 9. 7 , 오전 9:24:30 , Ex1_Server 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex1_Server {
    
    //==========================================================================
    //========================== Member Field ==================================
    //==========================================================================
    private ServerSocket ss;
    private ArrayList<ServerThread> cList;
    
    //==========================================================================
    //========================== Constructer ===================================
    //==========================================================================
    public Ex1_Server(int port) {
        try {
            ss = new ServerSocket(port);
            System.out.println("Server Start !!! ");
            // ArrayList  생성 ******
            cList = new ArrayList<ServerThread>();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
  
    /**
     * 사용자가 접속하게되면 Thread에 사용자 주소를 ArrayList에 저장하고 
     * Thread에서는 사용자에게 지속적으로 클라이언트에게 메세지를 날려준다 .
     */
    public void execute(){
        while (true) {            
            try {
                Socket s = ss.accept();
                String ip= s.getInetAddress().getHostAddress();
                System.out.println("Server Log1 ip : "+ip);
                // 접속해온 소켓을 Thread가 관리하도록 해야함
                ServerThread ct = new ServerThread(s, this);
                // ArrayList 에 저장
                cList.add(ct);
                ct.start();
                System.out.println("현재 접속한 사용자 : "+ cList.size());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    } // end execute()
    
    
    /**
     * 사용자가 보낸 파라미터를 통해서 서비스를 분기해서 다시 사용자에게 다음
     * 동작을 하도록 메세지를 날린다.
     * @param str0 사용자의 서비스를 구분을 위한 파라미터
     * @param str1
     * @param str2
     * @param str3
     * @param st 
     */
    public void sendMsg(String str0, String str1, String str2, String str3, ServerThread st) {
        String ip= st.getSocket().getInetAddress().getHostAddress();
        
        String str = "";
          if ("talk".equals(str0)) {
                //System.out.println("1");
                str = "talk/none/none/["+str2+ip+"]"+str3;
          } else if ("draw".equals(str0)){
               //System.out.println("2");
                str = str0 + "/" + str1 + "/" +str2+ "/" +str3;
                System.out.println("클라이언트로 메세지 전송 :"+str);
          } else if ("enter".equals(str0)){
                // code add
          } else if ("out".equals(str0)){
                // code add 
          } // 접속된 모든 클라이언트는 ArrayList가 기억하고 있으니 
            // 거기에서 하나씩 빼서 PrintWriter로 데이터를 전송하면 된다.
          
          for (ServerThread c : cList) {
              c.getPw().println(str);
              System.out.println("클라이언트로 메세지 전송 :"+str);
          }
         
          
    }
      
      
    public static void main(String[] args) {
        Ex1_Server es = new Ex1_Server(9999);
        es.execute();
    }
  
      
}
