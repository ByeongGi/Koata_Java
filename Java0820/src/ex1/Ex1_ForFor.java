package ex1;
public class Ex1_ForFor {
    public static void main(String[] args) {
       // for 문의 응용
       // for 문에 또다른 for 문을 사용
        for (int k = 1; k <10; k++) {
            System.out.print(k+"단"+"    ");
        }
            System.out.println("");        
       for(int i = 1; i<=9; i++){ // row를 반복하는 for 문
           for (int j = 1; j <= 9; j++) {// cell을 반복하는 안쪽 for 문 
               System.out.print("("+j+"x"+i+")"+"="+(i*j));
           }
           System.out.println("");
       } // end for
        System.out.println("===================================================");
       for(int y = 0; y<=9; y++){ // row를 반복하는 for 문 
           for (int x = 1; x <= 9; x++) {// cell을 반복하는 안쪽 for 문 
               if (y == 0) {
                   System.out.print(x+"단 \t");
               } else {
                   System.out.print("("+y+"x"+x+")"+"="+(y*x));
               }
           }
           System.out.println("");
       } // end for
    } // end main
 } // end class
