package ex1;
import java.util.Scanner;
// @author kosta, 2015. 8. 18 , 오전 10:54:53 , NewClass 
public class Ex2_RefDataType {
    // 참조 자료형을 선언하는 방법
    public static void main(String[] args) {
        // 자료형 변수명; --> 선언
        int a;
        a= 10;
        // 1. 어떤 객체를 참조자료형으로 사용한것인지를 결정
        // 예) 문자열을 변수에 저장하고 싶다. String 을 사용!
        // String 자료형으로 선언한 변수를 선언
        Scanner scanner1;
        String s1; // java.lang에 있는 클래스는 import 없이 사용가능 
        // IDE 환경에서는 import를 임의로 시키지 말고 단축키로 불러낸다. 
        String s;
        
        // 객체 생성 방법 new 란 연산자를 사용한다.
        // -> new 연산자를 통해서 힙 영역에 객체를 생성한다.
        Scanner scan;
        scan = new Scanner(System.in);
       
        // Scanner 클래스 기능 : 사용자의 키보드의 입력 값을 한줄 단위로 입력 받음
        System.out.println("값입력 : ");
        String str = scan.nextLine();
        System.out.println("출력결과:"+str);  
        //  Scanner scan = null; 객체가 힙 영역에 생성되지 않아서 발생->NullPointerException
        //  Scanner scan = new Scanner(System.in); 힙 영역에 객체 생성 
    } // end main
} // end class 
