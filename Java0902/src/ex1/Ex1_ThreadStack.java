package ex1;
// @author kosta, 2015. 9. 2 , 오전 10:10:25 , Ex1_ThreadStack 
public class Ex1_ThreadStack extends Thread{
    // 스레드 생명주기 
    // 1. 스레드를 생성한다. 
    // 2. Start() 를 호출한다. - > Runnable 상태 
    // 3. 스케줄러에 의해서 스레드가 run()를 수행한다.  - > Runnning 상태
    // 4. 스레드가 특정한 이유로 Running 상태에서 Blocked 상태로 이동
    // => Blocked 상태 
    // 참고 ) I/O request, synchronized 블록을 수행하고 있을 때는  Bloaked 
    // 상태로 이동하게 되는데, 이런 Blocking 요청이 될때까지 계속 유지됨
    // 5. 스레드가 종료되면 그 스레드는 다시 실행될수 없는 상태가 됨. 
    // => Dead 상태 
    
    public static void main(String[] args) {
        Ex1_ThreadStack ref = new Ex1_ThreadStack();
        ref.start(); // 다른 쓰레드에서 실행됨 
//        java.lang.Exception
//	at ex1.Ex1_ThreadStack.run(Ex1_ThreadStack.java:24)
//        
        ref.run(); // main 의 스택에서 실행됨
//        java.lang.Exception
//	at ex1.Ex1_ThreadStack.run(Ex1_ThreadStack.java:24)
//	at ex1.Ex1_ThreadStack.main(Ex1_ThreadStack.java:18)
    }

    @Override
    public void run() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
