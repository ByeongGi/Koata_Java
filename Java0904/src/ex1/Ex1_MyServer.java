package ex1;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// @author kosta, 2015. 9. 4 , 오전 9:24:51 , Ex1_MyServer 
public class Ex1_MyServer {
    private ServerSocket ss;

    public Ex1_MyServer() {
        try {
            ss = new ServerSocket(9999); // 포트 바인딩 
            System.out.println("서버가 생성되었습니다 !"); 
            while (true) {                
                Socket s  = ss.accept(); // Blocking 메서드 -> 클라이언트의 소켓을 열어 저장
                // Client 의 요청이 올 때 까지 대기한다 .
                String ip=s.getInetAddress().getHostAddress(); // -> 사용자의 소켓을 얻어와서 사용자 아이피를 얻어냄 
                System.out.println("클라이언트가 "+ip+ "접속했습니다.");
                
                // Client 의 소켓으로부터 스트림을 연결해서 
                // 2차 스트림으로 생성한다.
                // 스트림은 결국 접속한 Client 의 소켓을 통해서 통신하기 위한 객체이다.
                InputStream is = s.getInputStream(); // 사용자의 원시 스트림을 얻어온다.
                OutputStream os = s.getOutputStream();
                
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter pw = new PrintWriter(new BufferedOutputStream(os),true);
                
                // 클라이언트의 메세지를 BufferdReader 를 사용해서 읽어옴
                String msg = br.readLine();
                System.out.println("클라이언트 메세지 : "+msg);
                // 다시 클라이언트에게 보내기 위해서 PrintWriter 를 사용
                pw.println("안녕하세요 서버입니다. 당신이 보낸 메세지  : "+msg);
                
            }
        } catch (IOException ex) {
            
        
        }
    }
    public static void main(String[] args) {
        new Ex1_MyServer();
    }
    
}
