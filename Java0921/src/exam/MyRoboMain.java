package exam;

// @author kosta, 2015. 8. 21 , 오후 4:20:53 , RoboMain 

import java.util.Scanner;

public class MyRoboMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyRoboDog rd = new MyRoboDog();
        while(true) {
            System.out.println("1- 전원 On, 2 - 전원 Off, 3 : 짓다 , 4 : 눕다 , 5 : 달린다 . ");
            int num= 0;
            // 입력 에러 처리 
            try {
            num = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
            }
            
            if (num ==1 || num == 2) {
                rd.powerHandler(num);
            }else {
                rd.statusHandler(num);
            }
        }
    } // end main
} // end class 
