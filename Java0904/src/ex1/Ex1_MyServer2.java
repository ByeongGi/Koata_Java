package ex1;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
// @author kosta, 2015. 9. 4 , 오전 9:24:51 , Ex1_MyServer 
public class Ex1_MyServer2 {
    private ServerSocket ss;
    private File f;
    private HashMap<String,String> qMap;
    public Ex1_MyServer2() {
        qMap = new HashMap<String,String>(); 
        System.out.println("일반 서비스 :파일 로딩 완료 ! ");
        
        try {
            ss = new ServerSocket(9999); // 포트 바인딩 
            System.out.println("서버가 생성되었습니다 !"); 
            while (true) 
            {                
                roadData(); // 파일 로딩 
                Socket s  = ss.accept(); // Blocking 메서드 -> 클라이언트의 소켓을 열어 저장
                // Client 의 요청이 올 때 까지 대기한다 .
                String ip=s.getInetAddress().getHostAddress(); // -> 사용자의 소켓을 얻어와서 사용자 아이피를 얻어냄 
                System.out.println("클라이언트가 "+ip+ "접속했습니다.");
                System.out.println("파일 재로딩");
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
                
                if (qMap.get(msg)!=null) 
                {
                    pw.println("서버의 응답 : "+qMap.get(msg));
                } else{
                    pw.println("서버의 응답 : "+"무슨 말인지 모르겠습니다 ! ");   
                }
            } // end while
        } catch (IOException ex) {
            
        
        }
    }
    
    public void roadData(){
        // 파일 경로 
        String path = "C:\\kosta108\\filetest\\text01.txt";
        f = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // 파일 읽어오기
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String str="";
            while ((str=br.readLine())!=null) {
                String[] datas =str.split("/");
                qMap.put(datas[0], datas[1]);
                // System.out.println("key : "+datas[0]+ "Value : "+ datas[1]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
          
        } finally{
            try {
                if(br!=null) br.close();
                if(fr!=null) fr.close();
            } catch (IOException ex) {
               
            }
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        new Ex1_MyServer2();
    }
    
}


