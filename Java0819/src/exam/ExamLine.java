package exam;
// @author kosta, 2015. 8. 19 , 오후 5:55:53 , ExamLine 
import java.util.Scanner;
public class ExamLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10 수중에서 입력한 수부터 라인추가");
        int input =Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print(i); // 1 ~ 10 까지 출력한다.
            if (input==i)  // 만약 사용자가 입력한 숫자가 온다면 
            {              //한줄을 라인을 추가한다.
                System.out.println("");
            } // end if
        } // end for
    } // end for 
} // end class
/*
=> Result
1~10 수중에서 입력한 수부터 라인추가
5
12345
678910
*/