package ex1;
// @author kosta, 2015. 8. 25 , 오전 9:36:27 , MemberMain 
import java.util.Scanner;
public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberVo mv = new MemberVo();
        MemberJoin mj =new MemberJoin();
        
        System.out.println("아이디 입력");
        String id =sc.nextLine();
        // mv.setId(sc.nextLine());
        System.out.println("비밀번호 입력");
        String pwd= sc.nextLine();
        System.out.println("나이 입력");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("이름 입력");
        String name = sc.nextLine();
        System.out.println("전화번호 입력");
        String tel = sc.nextLine();
        System.out.println("이메일 입력");
        String email = sc.nextLine();
       
        // setter 메소드를 사용해서 mv 객체에 값을 저장 
        mv.setId(id);
        mv.setPwd(pwd);
        mv.setName(name);
        mv.setTel(tel);
        mv.setEmail(email);
        mv.setAge(age);
       // 검증을 위해서 MemberJoin의 addMember 에게 CallByReference 
        mj.addMember(mv);
    }// end main
    
} // end class of MemberMain
