package ex1;
// @author kosta, 2015. 8. 20 , 오후 12:43:03 , Ex3_Menu 
import java.util.Scanner;
public class Ex3_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 입력 , 2 -출력 , 3- 종료");
            int menu = Integer.parseInt(sc.nextLine());
            if (menu ==1) 
            {
                System.out.println("입력 모드 입니다.");
            } else if(menu == 2) {
                System.out.println("출력 모드 입니다");
            } else if (menu == 3){
                System.out.println("모르는 메뉴입니다.");
                break; // 반복문을 빠져나가는 제어문
            } else{
                System.out.println("모르는 메뉴입니다.");
            }// end else if
        } // end  while
        System.out.println("감사합니다. 곧 점심 시간이군요");
    }// end main
}// end class
