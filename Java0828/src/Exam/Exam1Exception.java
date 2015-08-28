package Exam;

// @author kosta, 2015. 8. 28 , 오후 2:16:25 , Exam1Exception 

import java.util.Scanner;

// 아래의 구문에서 모든 에러를 처리하시오 ! 
public class Exam1Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rnum = (int) (Math.random()*3);
        System.out.println("아무 숫자 입력 ");
        
                
        try {
        int userNum = Integer.parseInt(sc.nextLine());
        int res = userNum/rnum;
        // 예외가 발생하면 여기는 실행이 안됨
        // 즉, 예외가 발생하는 구간 이하의 실행문은 실행이 안되기 때문에 
        // 중요한 자원을 사용하다가 반환이 필요한 구문은 여기서 작성하면 안됨. 
        System.out.println("연산결과 : "+res);      
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요 ");
            e.printStackTrace(); // 예외를 다시 출력 ! 
        } catch (ArithmeticException e1){
            System.out.println("랜덤에서 0으로 나누었습니다.");
        }
        
        // NumberFormatException
        
    }
}
