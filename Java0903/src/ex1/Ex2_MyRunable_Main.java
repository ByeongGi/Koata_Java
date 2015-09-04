package ex1;

// @author kosta, 2015. 9. 3 , 오전 11:04:08 , Ex2_MyRunable_Main 
public class Ex2_MyRunable_Main {
    public static void main(String[] args) {
        MyData d = new MyData();
       
       
        new Thread(new Ex2_MyRunable(d)).start();
        new Thread(new Ex2_MyRunable(d)).start();
     
    }
}
