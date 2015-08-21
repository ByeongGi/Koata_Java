package ex1;
// @author kosta, 2015. 8. 18 , 오후 3:18:50 , Ex3_Scanner 
import java.util.Random;
import java.util.Scanner;
public class Ex3_Scanner {
    public static void main(String[] args) 
    {
        // Scanner 생성 - JDK5 버전부터 사용가능 
        Scanner sc = new Scanner(System.in);
        // 사용자 UI 
        System.out.println("메세지 입력! :");
        String msg= sc.nextLine(); // ->Blocking 메서드 : 특정 행위를 하기 전까지 
        // 계속 대기하는 메소드 -> 조건을 만족하면 바로 다음 바로 넘어감
        System.out.println("MSG : "+msg);
        System.out.println("숫자 :");
        // int num = sc.nextInt();
        int num =Integer.parseInt(sc.nextLine()); // -> praseInt()를 사용하여 변환
        System.out.println("Num : "+num);
        // -> 숫자값을 입력후에 nextLine()이 되면 enter(아스키코드) 값을 연산하기 때문에
        // 문자값으로 인식해서 blocking이 해체된다 .
        sc.nextInt(); // -> 이런 문제점을 해결하기 위해서 enter 값 입력값을 받고
        // 다음 메소드에서 입력을 하도록 만들어 준다.
        System.out.println("메세지 입력! :");
        String msg2= sc.nextLine(); 
        System.out.println("MSG : "+msg);
        // nextLine() -> nextInt() -> nextLine() 이런식으로 입력 받으면 마지막으로
        // 호출된 nextLine() 메소드는 작동되지 않는다 
        
    } // end main
} // end class
