package exam;
// @author kosta, 2015. 8. 18 , 오후 5:24:21 , ExDemo_Math 
public class ExDemo_Math {
     public static void main(String[] args) {
         // Math.random()* 자리수 : 자리수 만큼의 범위에서 난수 발생
         // 0 <= 실수 < 1 
        int rnum =  (int) (Math.random() * 10+1); // 1~10까지 범위에서 난수 발생
         System.out.println(rnum);
    } // end main
} // end class 
