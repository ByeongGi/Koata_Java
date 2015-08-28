package ex1;
// @author kosta, 2015. 8. 26 , 오전 10:43:14 , Ex2_Tokenizer 
import java.util.StringTokenizer;
public class Ex2_Tokenizer {
    public static void main(String[] args) {
        String str ="Java/Book//♡";
        // StringTokenizer는 의미 없는 공백을 (Whitespace)를 토큰으로 취급하지 않는다.
        StringTokenizer stz = new StringTokenizer(str,"/");
        System.out.println("Token Count"+stz.countTokens());
        // hasmoreTokens() : 토큰할수 있는 자원이 있을 때 ture, 아니면 false
        while (stz.hasMoreTokens()) {
            System.out.println(stz.nextToken());
        }
    } // end main
} // end class of Ex2_Tokenizer
