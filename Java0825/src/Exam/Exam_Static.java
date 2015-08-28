package Exam;
// @author kosta, 2015. 8. 25 , 오후 2:35:07 , Exam_Static 
public class Exam_Static {
    String s1 ="static";
    static String s2 ="STATIC";
    // static 은 생성되지 않은 객체의 자원을 참조 할수 없다 .
    //    public Stiring getSring(){
    //        return s1;
    //    }
    public String getSring(){
        return s2;
    }
} // class of Exam_Static
