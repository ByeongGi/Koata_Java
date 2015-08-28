package exam;
// @author kosta, 2015. 8. 24 , 오전 11:48:01 , ExamCallByValue2 
public class ExamCallByValue2 {
    public static void test(int n, int n2){
        n++;
        n2 +=10;
        System.out.println(n + ":" + n2); // 22, 20
    } // end test()
    
    public static void main(String[] args) {
        int n = 20;
        int n2= 10;
        System.out.println(n+ ":"+n2); // 20 , 10
    } // end main
} // end class of ExamCallByValue2
