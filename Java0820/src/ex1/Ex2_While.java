package ex1;
// @author kosta, 2015. 8. 20 , 오후 12:33:58 , Ex2_While 
public class Ex2_While {
    // for 문 유사 
    // 초기식;
    // while (조건식){
    //}
    public static void main(String[] args) {
       int i = 1;
       while (i<=10){
           // 홀수 짝수 출력
           if (i %2 ==0) {
               System.out.println(i+"짝수");
           } else {
                System.out.println(i+"홀수");
           }
           i++;
       } // while
    } // end main
} // end class
