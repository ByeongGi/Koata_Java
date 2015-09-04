package ex1;

// @author kosta, 2015. 9. 2 , 오전 11:50:50 , TimeThread 
public class ExamTimeThread extends Thread{
       @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                 
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
}
