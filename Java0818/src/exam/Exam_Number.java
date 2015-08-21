package exam;
// @author kosta, 2015. 8. 18 , 오후 2:21:37 , Exam_Number 
import java.util.Scanner;
public class Exam_Number {
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);  
        // System 객체에 선언된  InputStrem 객체를 얻어서 
        // InputStrem 키보드의 입력을 받아서 자료를 저장 
        System.out.println("======= 사칙 연산 ========");
        System.out.println(" 첫번쨰숫자를 입력해주세요");
        int num1=s1.nextInt();
        System.out.println(" 두번쨰 숫자를 입력해주세요");
        int num2=s1.nextInt();
        
        int res = num1 + num2; 
        System.out.println("덧셈 연산 결과 "+res);
        res = num1 - num2; 
        System.out.println("빼기 연산 결과 "+res);
        res = num1 * num2; 
        System.out.println("곱셈 연산 결과 "+res);
        res = num1 / num2;
        System.out.println("몫 연산 결과 "+res);
        res = num1 % num2;
        System.out.println("나머지 연산 결과 "+res);
    }// end main
}// end class
