package exam;
// @author kosta, 2015. 8. 19 , 오후 2:54:57 , exam02 
import java.util.Scanner;
public class Exam02 {
    public static void main(String[] args) {
        // 사용자로부터 임의의 수를 받아서 그 수가 홀수인지 짝수인지 판별해서 
        // 출력하시요
        // 예 > 수를 입력하세요! : 1 
        // result : 1은 홀수입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("========= 홀수 짝수 구분 ==============");
        int num = sc.nextInt();
        if (num%2==0) { // 
            System.out.println(num+" 은 짝수입니다");
        } else {
            System.out.println(num +"은 홀수 입니다.");
        } // end if
    } // end main
} // end class 
/*
=>Result
========= 홀수 짝수 구분 ==============
2
2 은 짝수입니다
*/