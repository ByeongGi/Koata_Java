package ex1;
// @author kosta, 2015. 8. 18 , 오후 4:49:58 , Ex3_Scanner1 
import java.util.Scanner;
public class Ex3_Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름 , 급여를 입력 받고 보너스를 일괄적으로 지급 + 100 
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("연봉 : ");
        // 정수형 문자열로 5000
        int pay = Integer.parseInt(sc.nextLine());
        pay += 100;// 보너스 지급 연산 -> pay =pay +100
        // 저장한 변수에서 값을 출력
        System.out.println("사원이름 :"+name);
        System.out.println("보너스를 포함한 연동 : "+pay);
    } // end main
} // end class 
