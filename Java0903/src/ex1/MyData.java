package ex1;
// @author kosta, 2015. 9. 3 , 오전 10:18:04 , MyData 
public class MyData {
    private int value2;
    
    // getValue2()란 메서드는 스레드들이 사용함 ~~~~스레드들이 공유/ 경쟁하는 영역: 임계영역
    public int getValue2() {
        return ++value2;
    }
    
}
