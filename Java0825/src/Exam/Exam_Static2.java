package Exam;

// @author kosta, 2015. 8. 25 , 오후 2:42:40 , Exam_Static2 
public class Exam_Static2 {
    private int num1;
    private static int num2;
    public void increment(){
        num1++;
        num2++;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        Exam_Static2.num2 = num2;
    }
    
}
