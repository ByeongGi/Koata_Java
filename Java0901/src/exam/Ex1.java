package exam;
// @author kosta, 2015. 9. 1 , 오전 9:28:35 , Ex1 
import java.io.IOException;
public class Ex1 {
    public static void main(String[] args) {
        try {
            int input = 0;
            while ((input =System.in.read())!= -1) {                
                System.out.println("input : "+input +"(char)input :"+(char)input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end main
} // end class 
