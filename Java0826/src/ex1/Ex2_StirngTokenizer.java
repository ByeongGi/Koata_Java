package ex1;
// @author kosta, 2015. 8. 26 , 오전 10:30:29 , Ex1_StirngTokenizer 
import java.util.StringTokenizer;
public class Ex2_StirngTokenizer {
    // 문자열에서 특정 구분자로 잘라내느 방식을 제공해주는 클래스 
    // 구분자를 기준으로 잘라낸 문자열 값을 Token 이라고 함.
    public static void main(String[] args) {
        // 예) 02- 1234 - 5678 , 032 - 123 - 1221 이런 경우에 자주 사용됨
        String str = "02-1234-5678";
        StringTokenizer stz = new StringTokenizer(str,"-");
        
        System.out.println("Token Count : "+stz.countTokens());
        
        String te1 = stz.nextToken(); // Token된 자원의 수를 반환
        String te2 = stz.nextToken();
        String te3 = stz.nextToken();
        
        // String te4 = stz.nextToken(); // 더이상 토큰이 남아있지 않기 떄문에 
        // NoSuchElementExcepton이 발생한다.
        
        System.out.println("Tel1"+ te1);
        System.out.println("Tel2"+ te2);
        System.out.println("Tel3"+ te3);
        
        System.out.println("Token Count : "+stz.countTokens()); // countTokens() 남은 토큰수를 세는 메소드 
    }
    
} // end class of Ex2_StirngTokenizer
