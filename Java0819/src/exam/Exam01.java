package exam;
// @author kosta, 2015. 8. 19 , 오후 12:07:57 , Exam01 
import java.util.Scanner;
public class Exam01 
{
    public static void main(String[] args) 
    {
        System.out.println("====================== IF 연습 문제 ===============================");
        Scanner sc= new Scanner(System.in);
        System.out.println("나이를 정수로 입력 : ");
        int age =sc.nextInt();
        System.out.println("입력한 나이 :  "+age+" 세");
        // if 문으로  구현 
        if(age>18)System.out.println("Msg:당신은 Member 회원입니다.");
        if(age <=18)  System.out.println("Msg:당신은 미성년이기 떄문에 접근이 불가능 합니다.");
        
        // 삼항 연산자로 구현 
        String msg= "";
        msg += (age >19)? "Msg:당신은 Member 회원입니다.":"Msg:당신은 미성년이기 떄문에 접근이 불가능 합니다.";
        System.out.println(msg);
        
        msg = "Msg:당신은 Member 회원입니다.";
        if (age <= 19) 
        {
            msg ="Msg:당신은 미성년이기 떄문에 접근이 불가능 합니다.";
            System.out.println(msg);
            System.exit(0);
        }
        System.out.println(msg);
        System.out.println("====================== 출력 결과 끝 !==============================");
    } // end main
} // end class
/**
 * => Result
    ====================== IF 연습 문제 =======================
    나이를 정수로 입력 : 
    20
    입력한 나이 :  20 세
    Msg:당신은 Member 회원입니다.
    Msg:당신은 Member 회원입니다.
    Msg:당신은 Member 회원입니다.
    ====================== 출력 결과 끝 !==============================
 */