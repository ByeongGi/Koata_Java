package exam;
// @author kosta, 2015. 8. 26 , 오후 12:01:57 , Exam_StringTokenizer_Main 
import java.util.Scanner;
public class Exam_StringTokenizer_Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Exam_StringTokenizer st = new Exam_StringTokenizer();
        System.out.println("StringTokenizer 예제 ");   
        while (true) {            
            System.out.println("메뉴 1 - 입력 , 2 - 출력 , 3 - 종료 ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1:
                System.out.println("구분자 입력 :");
                String stringCut =sc.nextLine();
                System.out.println("입력 수 :");
                int num = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < num; i++) {
                System.out.println("입력");
                String str=sc.nextLine();
                st.insertMachine(str,stringCut);
                }
                break;
                case 2:
                System.out.println("출력 :");
                System.out.println(" 출력할 구분자 입력 :");
                String icon=sc.nextLine();
                String res =st.outputMachine(icon);
                System.out.println(res);
                break;
                case 3:
                System.out.println("종료");
                System.out.println("종료 합니다");
                System.exit(0);
                break;
                default:
                System.out.println("잘못입력했습니다.");
        }
        } // end while
    }
} // end class of Exam_StringTokenizer_Main
