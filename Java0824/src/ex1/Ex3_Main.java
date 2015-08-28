package ex1;
// @author kosta, 2015. 8. 24 , 오후 12:25:20 , Ex3_Main 
import java.util.Scanner;
public class Ex3_Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 1.  home 객체를 생성 
        Ex3_Home home = new Ex3_Home();
        System.out.println("주문전 잔고확인 : "+home.getMoney());
        // 2. 사용자가 색상 주문 
        System.out.println("색상 주문 :");
        String color = sc.nextLine();
        // 3. PaintA 회사가 주문자의 집 수고와 색을 받아서 처리 
        Ex3_PaintFactory p1 =new Ex3_PaintFactory();
        // 4. PaintA 회사가 주문자의 집 주소와 색사을 받아서 처리 
        p1.userPaint(home, color);
        p1= null;
        //5 . 사용자가 잘못 전화해서 다른회사에게 같을 일을 시킨다.
        Ex3_PaintFactory p2 = new Ex3_PaintFactory();
        System.out.println("색상 다시 주문 ");
        color = sc.nextLine();
        p2.userPaint(home, color);
        p2= null;
        System.out.println("퇴근 후 대문 색 확인 : "+home.getDoorColor());
        System.out.println("퇴근 후 잔고 확인 : "+home.getMoney());
    } // end main
} // end calss Ex3_Main
