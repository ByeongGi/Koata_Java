package ex1;
import java.util.Scanner;
public class Ex1_Val {
    public static void main(String[] args) {
       // float 과 double
       // float var1 =3.14 //3.14은 기본적으로 8 바이트 double에 저장
       // float에 저장하기 위해서는 f, F 를 붙어준다.
       float var1, var2;
       var1 = 3.14f;
       var2= 550; // 내부적으로 int 형변환 (int)550 - > 550.0 이라는
                  // float 형 자료로 컴파일러가 변환
       
        System.out.println("var1"+var1);
        System.out.println("var2"+var2);
        
       double var3,var4; // 8 바이트로 double 로 선언  
       var3= var1; // promotion 4byte -> 8byte 저장
       var4 =3.15; // 기본값    
       
        System.out.println("var3"+ var3);
        System.out.println("var4"+ var4);
    } // end main
} // end class 
