package ex1;
// @author kosta, 2015. 9. 2 , 오전 10:23:04 , Ex2 
public class Ex2_Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } // end run 
    public static void main(String[] args) {
        System.out.println("Main 메소드의 시작");
        
        Ex2_Thread ref = new Ex2_Thread();
        ref.start(); // 다른 쓰레드에서 돌아간다
        // ref.run(); // 메인 쓰레드에서만 돌아간다
        System.out.println("Main 메소드의 종료!");
        
    } // end main
} // end class 
