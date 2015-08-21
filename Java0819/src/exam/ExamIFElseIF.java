package exam;
// @author kosta, 2015. 8. 19 , 오후 3:45:12 , ExamIFElseIF 
import java.util.Scanner;
public class ExamIFElseIF {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           
            System.out.println("좋아하는 과일을 선택합니다");
            System.out.println("orange, apple , pear .... ");
            String s1 ="";
            s1=sc.nextLine();
            System.out.println("선택한 과일은"+s1+" 입니다");
            if ("apple".equals(s1)) 
            {
                System.out.println("사과를 선택했습니다.");
                System.out.println("사과는 빨간색이고 아삭합니다.");
            } else if("orange".equals(s1)) {
                System.out.println("오렌지를 선택했습니다.");
                System.out.println("오렌지는 주황이고 시큼합니다.");
            } else if("pear".equals(s1)){
               System.out.println("배를 선택했습니다.");
                System.out.println("배는 달고 아삭합니다.");
            } else {
                System.out.println("데이터가 없습니다!");
                System.out.println("");
            } // end if
    } // end main
} // end class 
/*
=> Result
좋아하는 과일을 선택합니다
orange, apple , pear .... 
orange
선택한 과일은orange 입니다
오렌지를 선택했습니다.
오렌지는 주황이고 시큼합니다.
*/