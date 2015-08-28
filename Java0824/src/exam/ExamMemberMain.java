package exam;
// @author kosta, 2015. 8. 24 , 오전 11:09:10 , ExamMemberMain 
public class ExamMemberMain {
    public static void main(String[] args) {
        ExamMember em = new ExamMember();
        em.setAge(11);
        System.out.println(em.getAge());
        em.setAgree(true);
        System.out.println(em.getAgree());
        em.setName("kira");
        System.out.println(em.getName());
    }
} // end class of ExamMemberMain
