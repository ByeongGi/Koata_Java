package exam;

// @author kosta, 2015. 9. 4 , 오후 3:02:41 , ThreadPool 
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPool01 {

    private ExecutorService executorService;

    public ThreadPool01() {
        //executorService= Executors.newCachedThreadPool(); // 초기 스레드 0 , 코어 스레드 수 0 , 최대 쓰레드 int 의 최대 범위 
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        // 런타임시에 접근할수 있는 프로세스의 숫자만큼 반환한다. 
        // executorService= new ThreadPoolExecutor(2, 50, 120L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        // 실제 내부에서 쓰레드 풀을 만드는 객체로 생성하는 방법
        Future future = executorService.submit(new Runnable() {

            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    System.out.println("처리결과 ");
                    sum += i;
                }

            }
        });

        try {
            future.get();
            System.out.println("작업 처리 완료 ");
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPool01.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("예외 처리 1 ");
        } catch (ExecutionException ex) {
            Logger.getLogger(ThreadPool01.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("예외 처리 2 ");
        }
        
        executorService.shutdown();
      
    }
    
    
    
    public static void main(String[] args) {
        new ThreadPool01();
    }
}
