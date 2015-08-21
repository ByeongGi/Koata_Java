package ex2;
// @author kosta, 2015. 8. 19 , 오후 1:47:50 , Ex_IfElse 
import java.util.Scanner;
// if(조건문){ 1. 실행문 } else { 2. 실행문 }
// 앞에서는 IF 문에 조건이 만족할 경우에만 동작했다면 
// 이번에는 IF 문에 조건에 만족하지 않더라고 무조건 실행 시키려고 사용할떄 쓰는 
// 문장
// 동작하는 로직 
// => 조건문이 항상 참이면 1 . 실행문 실행 
// => 조건문이 거짓이면 2. 실행문 실행 
public class Ex07_IfElse {
    public static void main(String[] args) {
        System.out.println("=========== If-Else ============");
        // == 복습 
        int num1 = 10;
        Scanner sc= new Scanner(System.in);
        System.out.println("숫자 입력 ");
        int num2= Integer.parseInt(sc.nextLine());
        if (num1==num2) 
        {
            System.out.println("같다");
        } else{
            System.out.println("다르다");
        }// end if 
        
    } // end main 
} // end class 
