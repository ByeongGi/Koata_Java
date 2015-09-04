package exam;
// @author kosta, 2015. 9. 3 , 오전 10:07:18 , DaemonThread 
public class DaemonThread implements Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();
        
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
                System.out.println(i);
                if (i==5) {
                    autoSave =true;
            }
 
        }
        
        
    } // end main

    @Override
    public void run() {
        while (true) {            
            try {
                Thread.sleep(3*1000);
            } catch (Exception e) {
            }
            if (autoSave) {
                autoSave();
            }
        }
        
    }
    
    public void autoSave(){
        System.out.println("작업 파일이 자동으로 저장되었습니다.");
    }
    
}
