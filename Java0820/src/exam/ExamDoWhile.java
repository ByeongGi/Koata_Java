package exam;
// @author kosta, 2015. 8. 20 , 오후 5:41:52 , ExamDoWhile 
import java.util.Scanner;
public class ExamDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("범위 : ");
        int limit = Integer.parseInt(sc.nextLine());
        System.out.println("숫자 :");
        int num = Integer.parseInt(sc.nextLine());
        // 수와 범위를 받아서 아래처럼 출력 do ~ while 문을 사용 
        // 범위 : 5 
        // 숫자 : 10 
        // 1 2 3 4 5
        // 6 7 8 9 10
        int i=1;
        do {            // == != <= >= ㅌ
            // 출력되는 값이 사용자가 입력한 범위의 수로 나눈 나머지가 0 이면 띄운다.
            System.out.print(i++ +" ");
              if ((i-1)%limit==0) {
                System.out.println("");   
            }
        } while (i<=num);
    } // end main
} // end class 
