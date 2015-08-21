package exam;
// @author kosta, 2015. 8. 18 , 오후 12:00:43 , ExamProfile 
import java.util.Scanner;
public class ExamProfile {
    public static void main(String[] args) {
        // Scanner initiate and allocate
        Scanner s1 = new Scanner(System.in);
        // Scanner input
        System.out.println("name :");
        String name =s1.nextLine();
        System.out.println("age :");
        String age = s1.nextLine();
        System.out.println("address :");
        String address = s1.nextLine();
        System.out.println("email :");
        String email = s1.nextLine();
        System.out.println("hobby :");
        String hobby= s1.nextLine();
        // Atfer Scanner input , Scanner is close
        s1.close();
        // msg 
        String msg = "안녕하세요 "+ name+"님\n" ;
        msg += "사는곳은 "+address+"이시며";
        msg += "입력하신 이메일은  "+email+"으로 \n";
        msg += "이메일을 전송했습니다.\n";
        msg +=  "기본정보 ::::\n";
        msg +=  "이름: "+name+"\n";
        msg +=  "나이:" +age+"\n";
        msg +=  "사는곳 : "+address+"\n";
        msg +=  "이메일 : "+email+"\n";
        msg +=  "취미 : "+hobby+"\n";
        System.out.println(msg);
    } // end main
} // end class 
