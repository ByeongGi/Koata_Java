package ex1;

// @author kosta, 2015. 9. 3 , 오전 10:28:24 , Ex1_ThreadMain 
public class Ex1_ThreadMain {
    public static void main(String[] args) {
        MyData d = new MyData();
        Ex1_MyThread1 t1 = new Ex1_MyThread1(d);
        Ex1_MyThread1 t2 = new Ex1_MyThread1(d);
        t1.start();
        t2.start();
        
    }
}
