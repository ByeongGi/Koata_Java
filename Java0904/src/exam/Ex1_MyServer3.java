package exam;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// @author kosta, 2015. 9. 4 , 오전 9:24:51 , Ex1_MyServer 
public class Ex1_MyServer3 {
    private ServerSocket ss;
    private File f;
    public Ex1_MyServer3() {
     
       
        System.out.println(" DB 서비스 :로딩 완료 ! ");
        
        try {
            ss = new ServerSocket(7777); // 포트 바인딩 
            System.out.println("서버가 생성되었습니다 !"); 
            while (true) 
            {                
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
                saveData(msg);
                System.out.println("클라이언트 요청 성공  : "+msg);
                
                // 다시 클라이언트에게 보내기 위해서 PrintWriter 를 사용
                pw.println("1");
               
            } // end while
        } catch (IOException ex) {
            
        
        }
    }
  
    
    
    public void saveData(String qus_ans){
        // 파일 경로 
        String path = "C:\\kosta108\\filetest\\text01.txt";
        f = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            // 파일 저장하기
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            String str="\r\n"+qus_ans;
            System.out.println(qus_ans);
            bw.write(str);
            bw.flush();
          
         
        } catch (IOException ex) {
            ex.printStackTrace();
          
        } finally{
            try {
                if(bw!=null) bw.close();
                if(fw!=null) fw.close();
            } catch (IOException ex) {
               
            }
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        new Ex1_MyServer3();
    }
    
}


