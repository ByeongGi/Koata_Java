package ex1;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server_0 {
	private ServerSocket ss;
	private Socket s;
	private String reip;
	
	// 클라이언트 소켓을 저장할 ArrayList
	private ArrayList<ServerThread> cliList;
	public Server_0(int port) {
		try {
			ss = new ServerSocket(port);
			System.out.println("Server Start!!");
			cliList = new ArrayList<ServerThread>();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// 서버에서 사용자의 소켓 객체를 저장함 
	public void execute(){
		while(true){
			
			try {
				Socket s=  ss.accept();
				System.out.println("소켓 접속 성공 "+s.getInetAddress());
				reip = s.getInetAddress().getHostAddress();
				// 접속해 온 소켓을 ServerThread가 관리하도록 함 
				ServerThread st = new ServerThread( s, this);
				
				// ArrayList에 저장 
				cliList.add(st);
				st.start();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	// 
	
	public void SendMsg(ServerThread s, String ... str){
		String type1  = str[0];
		String type2  = str[1];
		String type3  = str[2];
		String type4  = str[3];
		String type5  = str[4];
		String type6  = str[5];
		String type7  = str[6];
		String type8  = str[7];
		
		StringBuffer sb = new StringBuffer();
		sb.append(type1).append("/");
		sb.append(type2).append("/");
		sb.append(type3).append("/");
		sb.append(type4).append("/");
		sb.append(type5).append("/");
		sb.append(type6).append("/");
		sb.append(type7).append("/");
		sb.append(type8);
		
		System.out.println("Msg : "+sb.toString());
		
		// 모든 유저에게 완성된 Str을 스트림을 통해서 보내는 작업 
		for(ServerThread e :cliList){
			e.getPw().println(sb.toString());
		}
	}
	
	
	
}
