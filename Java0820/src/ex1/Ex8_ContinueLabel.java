package ex1;
// @author kosta, 2015. 8. 20 , 오후 5:31:18 , Ex8_ContinueLabel 
public class Ex8_ContinueLabel {
    public static void main(String[] args) {
        label:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( j== 3 ) {
                    continue label;
                }
                System.out.println("i값 : "+i+"j값 : "+j);
            }
        } // end for
    } // end main
} // end class
