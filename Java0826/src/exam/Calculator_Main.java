package exam;
// @author kosta, 2015. 8. 26 , 오후 6:12:23 , Calculator_ 
import java.util.Scanner;

public class Calculator_Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        
        System.out.println(" 계산기 프로그램 ");
        while (true) {            
            System.out.println("메뉴 사칙 연산 선택 +,-,/,* 중 하나를 입력하세요");    
            System.out.println("종료는 1 입니다.");
            String meun=sc.nextLine();
            if ("1".equals(meun)) {
                System.out.println("종료");
                return;
            }
            System.out.println("첫번쨰 숫자 입력  :");
            int n1 = Integer.parseInt(sc.nextLine());
            System.out.println("첫번쨰 숫자 입력  :");
            int n2 = Integer.parseInt(sc.nextLine());
            String res ="";
            switch(meun){
                case "+":
                    res  = calculator.plus(n1, n2);
                    System.out.println(res);
                    break;
                case "-":
                    res  = calculator.minus(n1, n2);
                    System.out.println(res);
                    break;
                case "/":
                    res  = calculator.divide(n1, n2);
                    System.out.println(res);
                    break;
                case "*":
                     res  = calculator.multiply(n1, n2);
                    System.out.println(res);
                    break;
                case "1":
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
                    
            }
        }
        
        
        
    }
}
