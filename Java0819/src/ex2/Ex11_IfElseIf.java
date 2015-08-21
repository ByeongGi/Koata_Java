package ex2;
// @author kosta, 2015. 8. 19 , 오후 3:31:24 , Ex11_IfElseIf 
// 다중 if 문 - 조건 비교가 한 가지로 충분치 않을 경우에
import java.util.Scanner;

// 사용하는 문법이다.
// if(조건문1) {실행문} 
// else if (조건문2) {실행문2}
// ...
// else 실행문; (생략가능)
// 동작 로직 
// 조건문 중에 해당되는 조건문에 걸리면 
// 그 조건문에 해당하는 실행문만 실행하고 바로 종료됨
public class Ex11_IfElseIf {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요!");
        Scanner sc = new Scanner(System.in);
        int su1= sc.nextInt();
        String res= "";
        if (su1> 41) 
        {
            res="고급";
        } else if(su1>11){
            res="중급";
        } else if (su1>=0){
            res= "초급";
        } else {
           res="음수";
        }
        System.out.println("결과는 "+res+"입니다.");
    } // end main
} // end class 
/*
=> Result
점수를 입력하세요!
15
결과는 중급입니다.
*/