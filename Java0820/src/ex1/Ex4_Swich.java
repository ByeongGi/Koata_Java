package ex1;
// @author kosta, 2015. 8. 20 , 오후 1:52:56 , Ex4_Swich 
import java.util.Scanner;
public class Ex4_Swich {
    // 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러개의
    // 처리문을 한번에 수행하는 데 사용하는 분기문이다.
    // 조건값(인자값) 정수형 (byte,short,int) , long , Stirng(*****) 안되는데
    // boolean, 실수형 < = 안됨 
    public static void main(String[] args) {
        int num = 10; // int short byte
        String msg = "";
        switch(num){
            case 1:
                msg = "1월 입니다.";
                break;
            case 10:
                msg = "10월 입니다.";
                break;
            default :
                msg = "그외";
        }
        System.out.println(msg);
        String s= "A"; // JDK 7  String 형을  switch문에서 사용이 가능하다.
        switch(s){
            case "A":
                System.out.println("A 출력");
                break;
            case "B":
                System.out.println("B 출력");
                break;
        }
        char c= 'A';
        switch(c){
             case 'A':
                System.out.println("A 출력");
                break;
            case 'B':
                System.out.println("B 출력");
                break;
        }
        
        int code = 4;
        // 스위치 문 사용 시 범위를 구할떄 , 그룹으로 표현할떄 사용!
        switch(code){
            case 1:case 2:case 3:
            System.out.println("쥬라기 파크 상용중 ");
            break;
            case 4:case 5:case 6:
            System.out.println("아바바 상영중");
            break;
        }
    }// end main
} // end class 
