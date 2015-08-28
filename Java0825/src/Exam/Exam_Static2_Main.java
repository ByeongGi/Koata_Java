package Exam;
// @author kosta, 2015. 8. 25 , 오후 2:44:14 , Exam_Static2_Main 
public class Exam_Static2_Main {
    public static void main(String[] args) {
        Exam_Static2 e1 = new Exam_Static2();
        Exam_Static2 e2 = new Exam_Static2();
        e1.increment();
        e2.increment();
        System.out.println("e1 num1:"+e1.getNum1());
        System.out.println("e1 num2:"+e1.getNum2());
        System.out.println("e2 num1:"+e2.getNum1());
        System.out.println("e2 num2:"+e2.getNum2());
        // 생성없이 Static 자원에서 가져올수 있다.
        
        System.out.println("static 자원 :"+Exam_Static2.getNum2());
    } // end main
} // end class of Exam_Static2_Main
