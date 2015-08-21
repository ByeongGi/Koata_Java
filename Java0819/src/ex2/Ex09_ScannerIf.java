package ex2;
// @author kosta, 2015. 8. 19 , 오후 2:23:40 , Ex9_ScannerIf 
import java.util.Scanner;
public class Ex09_ScannerIf {
    public static void main(String[] args) {
        String msg = "Hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello 입력 : ");
        String m = sc.nextLine(); // new String()을 반환
        if (m== msg) 
        {
            System.out.println("주소가 같다.");
        } else {
            System.out.println("주소가 다르다.");
        }
        if (msg.equals(m))  
        {
            System.out.println("내용이 같다.");
        } else{
            System.out.println("내용이 다르다.");
        }
    } // end main   
} // end class
/*
Hello 입력 : 
Hello
주소가 다르다.
내용이 같다.
*/