package exam;

// @author kosta, 2015. 9. 3 , 오전 9:19:53 , Thread_Poriority 
public class Thread_Poriority extends Thread{
    public static void main(String[] args) {
        Thread_Poriority t1 = new Thread_Poriority();
        Thread_Poriority t2 = new Thread_Poriority();
        Thread_Poriority t3 = new Thread_Poriority();
        Thread_Poriority t4 = new Thread_Poriority();
        Thread_Poriority t5 = new Thread_Poriority();
        Thread_Poriority t6 = new Thread_Poriority();
        t1.setName("첫번째 쓰레드");
        t2.setName("두번째 쓰레드");
        t3.setName("세번째 쓰레드");
        t4.setName("네번째 쓰레드");
        t5.setName("다섯번째 쓰레드");
        t6.setName("여섯번째 쓰레드");
      
        t1.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    @Override
    public void run() {
            String threaed_name=Thread.currentThread().getName();
            System.out.println(threaed_name);
        for (int i = 0; i < 300; i++) {
            //System.out.println(" -");
            for (int j = 0; j < 10000000; j++) ;
        }
    
    
    }
    
    
}
