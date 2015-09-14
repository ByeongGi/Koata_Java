package exam;
// @author kosta, 2015. 9. 7 , 오후 5:15:49 , Client1 

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client1 {
    private Socket s;
    private BufferedReader br;
    
    public Client1() {
        try {
            s= new Socket("192.168.7.193",9999);
            
            PrintWriter pw= new PrintWriter(new BufferedOutputStream(s.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String param ="";
            while (true) {
                System.out.println("서비스를 입력하세요 ");    
                param ="talk"+"/1/2/3";
                pw.println(param);
                System.out.println("param"+param);
                
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            String msg =br.readLine();
                            System.out.println("서버가 보낸 메시지 :"+msg);
                        } catch (IOException ex) {
                            
                            
                        }
                    
                    }
                });
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    }
    public static void main(String[] args) {
        Client1 c = new Client1();
    }
}
