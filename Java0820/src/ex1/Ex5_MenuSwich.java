package ex1;
// @author kosta, 2015. 8. 20 , 오후 12:43:03 , Ex3_Menu 
import java.util.Scanner;
public class Ex5_MenuSwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // JDK 5 부터 지원 해줌 break에 라벨을 붙어서 
        // 라벨쪽으로 브레이크 해주도록 break 될수 있도록 지원 
        xx:while(true)
        {
            System.out.println("1. 입력 , 2 -출력 , 3- 종료");
            int menu = Integer.parseInt(sc.nextLine());
            switch(menu)
            {
                case 1:
                    System.out.println("입력 모드 입니다.");
                    break;
                case 2:
                     System.out.println("출력 모드 입니다");
                    break;
                case 3:
                    System.out.println("종료 입니다.");
                    // return; 
                    break xx;
                default:
                    System.out.println("모르는 메뉴입니다.");     
            }     
        } // end  while
    }// end main
}// end class

