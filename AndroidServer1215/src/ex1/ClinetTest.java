package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClinetTest {
	public ClinetTest() {
		
		try {
			Socket s= new Socket("localhost",9999);
			InputStream is = s.getInputStream();
			OutputStream os= s.getOutputStream();
			
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(os),true);
			pw.println("test/msg/1/2/3/4/5/6");
			BufferedReader br = new BufferedReader(new  InputStreamReader(is));
			String msg = br.readLine();
			System.out.println(msg);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new ClinetTest();
	}
	
}
