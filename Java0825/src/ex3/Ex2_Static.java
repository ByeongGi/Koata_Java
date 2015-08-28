package ex3;
// @author kosta, 2015. 8. 25 , 오후 3:42:16 , Ex2_Static 
public class Ex2_Static {
// 하드웨어 장비를 사용하기 위해서 JNI, 외부 라이브러리를 현재 클래스에서
// 초기화 한다던지 ...
    // Static 키워드를 쓴 자원은 클래스가 로딩하자 마자 Static 자원들이 클래스 영역에 적재됨 
    // 드라이브 설치 할때 
    static {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        System.out.println("Test2");
    }
   
} // end calss of Ex2_Static