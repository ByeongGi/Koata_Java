package ex1;
// @author kosta, 2015. 8. 24 , 오전 9:48:25 , Ex1BankMain 
import java.util.Scanner;
public class Ex1BankMain {
    public static void main(String[] args) {
        // Bank객체를 생성해야 멤버에 접근이 가능하다.
        Ex1_Bank eb =new  Ex1_Bank();
        // eb.pay = 100000;
        // setter 호출해서 Bank클래스의 멤버인 pay에 값을 전달하자.
        // eb.setPay(100000);
        // Bank객체의 멤버인 pay의 값을 인출해서 출력해보자.
        System.out.println("Bank의 값"+eb.getPay());
        // 사용자로부터 입력을 받아 특정 Password 일떄만 입력을 하도록 바꾼다 
        System.out.println("사용자는 비밀번호를 입력하세요!");
        Scanner sc = new Scanner(System.in);
        int password = Integer.parseInt(sc.nextLine());
        eb.passTeam(password);
        if (eb.isStatus()) {
        System.out.println("인증되었습니다.! ");
        int pay= Integer.parseInt(sc.nextLine());
        eb.setPay(pay);
        }
        System.out.println("변경된  Pay 값 : "+eb.getPay());
    } // end main
} // end class 
