package exam;

// @author kosta, 2015. 9. 4 , 오후 2:39:30 , ThreadPoolServer1 

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolServer1 {
    private Executor executorService;
    private ServerSocket serverSocket;
    
    public void startServer(){
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(9999));
        } catch (IOException ex) {
            if (!serverSocket.isClosed()) {
                endServer();
                return;
            }
        
        }
        
    }
    
    public void endServer(){
        // dfff
    }
    
}
