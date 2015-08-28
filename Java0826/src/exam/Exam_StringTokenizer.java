package exam;
// @author kosta, 2015. 8. 26 , 오전 10:49:13 , Exam_StringTokenizer 
import java.util.StringTokenizer;
/*
// 사용자로부터 이름들을 입력 받고 , 구분자도 입력을 받아서 
    // String 클래스로 만들고 
    // 그 값을 StringTokenizer를 사용해서 각각 출력하시오.
    // 예)  메뉴 1 - 입력 , 2 - 출력 ,3 -종료 :1
    // 구분자 입력 : 
    // 입력 : test
    // 입력 : test
    // 입력 : test
    // 입력 : test
    // 입력 : test
    // 입력 : test
    // 메뉴 1 - 입력 , 2 - 출력 , 3 - 종료 : 2 
    // 출력 : test test test test test test
*/
public class Exam_StringTokenizer {
    
    private static StringBuffer sb ; // 멤버 필드에 선언 : insert,list에 재사용
    private static String stringCut ; // 구분자
    // private static StringTokenizer stz;
    
    // 사용자의 입력값 : str , 사용자가 지정한 구분자 stringCut
    public Exam_StringTokenizer(){
        this.sb = new StringBuffer();
    }
    
    // 사용자가 입력할떄 
    public void insertMachine(String str,String stringCut){
        // StringBuffer 를 통해서 구분자와 입력수를 결정한다.
        this.stringCut = stringCut ;
        sb.append(str).append(stringCut);
    } 

    // 사용자가 리스트를 출력할때 
    public String outputMachine(String icon){
        // StringTokenizer를 통해서 결과를 출력 
        StringBuffer res = new StringBuffer();
        // 이미 insertMachine() 호출해서 멤버에 StringBuffer sb 를
        // token 한다.
        StringTokenizer stz = new StringTokenizer(sb.toString(),stringCut);
        while (stz.hasMoreTokens()) {            
            // 토큰할떄마다 새로운 StirngBuffer res에 아이콘을 기준으로 문자열로 저장한다.
            res.append(stz.nextToken()).append(icon);
        }
        sb.delete(0, sb.length()); // 기존 멤버의 버퍼를 초기화
        return res.toString(); // 현재 버퍼의 값을 리턴한다 .
    }
} // end class of Exam_StringTokenizer
