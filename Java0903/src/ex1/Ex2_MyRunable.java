package ex1;

// @author kosta, 2015. 9. 3 , 오전 11:01:14 , Ex2_MyRunable 
public class Ex2_MyRunable implements Runnable{
    private MyData d;
    public Ex2_MyRunable(MyData d) {
        this.d = d;
    }
    @Override
    public void run() {
          int i = 0;
        // 스레드의 이름을 name 이란 변수에 저장
        String name = Thread.currentThread().getName();
        while(i<3){
            // System.out.println(name +"  d 의 주소값 "+d.hashCode());
            System.out.println(name + " 지역변수 "+(++i));
            System.out.println(name + " 멤버필드 "+d.getValue2());
            System.out.println("Thread Cnt :"+Thread.activeCount());
        }
    }

}
