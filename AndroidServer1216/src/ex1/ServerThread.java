package ex1;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerThread extends Thread{
	
	private Socket socket;
	private Server_0 server;
	private PrintWriter pw;
	private BufferedReader in;
	
	
	public PrintWriter getPw(){return pw;}
	
	
	
	public ServerThread(Socket socket, Server_0 server) {
		this.socket= socket;
		this.server= server;

		try {
			pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()),true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		super.run();

		try {
			// 소켓 하나당 스레드가 각각 붙어서 스트림에서 전송되어 온 메세지를 응답해준다.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String msg = in.readLine();
				System.out.println("Client Msg : "+msg);
				transMsg(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	private void transMsg(String msg) {
		StringTokenizer stn = new StringTokenizer(msg, "/");
		String str1 = stn.nextToken();
		String str2 = stn.nextToken();
		String str3 = stn.nextToken();
		String str4 = stn.nextToken();
		String str5 = stn.nextToken();
		String str6 = stn.nextToken();
		String str7 = stn.nextToken();
		String str8 = stn.nextToken();
		// Server의 sendMsg를 호출하여 프로토콜을 잘라서 전달한다. 
		server.SendMsg(this, str1, str2, str3, str4, str5, str6 , str7, str8);
		System.out.println("프로토콜 재전송 성공");
	}



	public Socket getSocket() {
		return socket;
	}
	
	
	
}
