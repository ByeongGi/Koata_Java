package Exam;
// @author kosta, 2015. 8. 31 , 오후 2:16:28 , ExamMember 
import java.util.ArrayList;
public class ExamMember {
    public static void main(String[] args) {
        // 연습문제 : ArrayList에 회원의 정보를 저장하려고 한다.
        // 아이디, 이름, 비번, 은 String 
        // 나이 Integer
        // 동의 - Boolean
        ArrayList<Member> mList= new ArrayList<Member>();
        
        Member m1 = new Member();
        m1.setId("wwww3226");
        m1.setName("김병기");
        m1.setPwd("1234");
        m1.setAge(26);
        m1.setAgree(true);
        Member m2 = new Member();
        m2.setId("wwww1234");
        m2.setName("김병");
        m2.setPwd("34543");
        m2.setAge(22);
        m2.setAgree(true);
        Member m3 = new Member();
        m3.setId("wwww15261");
        m3.setName("김기");
        m3.setPwd("34dsd3");
        m3.setAge(23);
        m3.setAgree(true);
        
        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        
        for (Member mList1 : mList) {
            System.out.println("ID : "+mList1.getId());
            System.out.println("NAME :"+mList1.getName());
            System.out.println("AGE : "+mList1.getAge());
            System.out.println("PWD : "+mList1.getPwd());
            System.out.println("AGREE : "+mList1.isAgree());
            System.out.println("===========");           
        }
    }
}
