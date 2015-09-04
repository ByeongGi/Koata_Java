package ex1;
// @author kosta, 2015. 9. 2 , 오전 10:28:50 , Ex3_Thread 
// Thread 를 상속받은 클래스
public class Ex3_Thread extends Thread{
    @Override
    public void run() {
        System.out.print("^♡^");
    }
    public static void main(String[] args) throws InterruptedException {
        // 각각의 쓰레드를 객체를 생성 
        Ex3_Thread ref = new Ex3_Thread();
        Ex3_Runnable ref2 = new Ex3_Runnable();
        // Runnble 일때만 start를 사용하기 위해서 다시 생성하도록 
        // start() 호출 
        Thread t = new Thread(ref2); 
        ref.start();
        ref.join(); // ref 쓰레드는 실행하고 다른 쓰레드는  끝날때까지 대기 상태로 변경
        t.start();
        
        for (int i = 0; i < 1000; i++) {
            System.out.print("*");
        }
         // 쓰레드의 수행에는 순서 없이 실행된다.  
    }
    
}
