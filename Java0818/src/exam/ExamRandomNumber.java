package exam;
// @author kosta, 2015. 8. 18 , 오후 5:32:36 , ExamRandomNumber 
import java.util.Scanner;
public class ExamRandomNumber 
{
    public static void main(String[] args) 
    {
        // 연습문제 ) 사용자로부터 1~10 숫자를 입력받아  난수를 발생시켜 
        // 발생한 난수와 사용자가 입력한 숫자를 
        // 비교연산자를 이용하여  , 난수와 일치하는지를 출력하시오!
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10 까지의 숫자중에 하나를 입력하세요!");
        System.out.println("숫자 입력:");
        
        int input_Num = sc.nextInt(); 
        int rnum =(int) ((Math.random()*10) + 1); // 1 ~ 10 범위 난수 발생 
         // Math.random() 0<= num <1
        boolean res = input_Num == rnum; // 같은지 여부 판단
        System.out.println("두 입력한 난수와 일치 여부 : "+res);
    } // end main
} // end class
