package ex1;
// @author kosta, 2015. 8. 26 , 오전 9:50:16 , StringBuffer 
public class Ex1_StringBuffer {
    // 문자열 변경이 자주 사용되는 객체 일수록 메모리의 
    // 임시적인 공간(Buffer)을 사용하는 StirngBuffer 클래스
    // 를 사용하는 것이 바람직하다.
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("JavaBook");
        int var = sb.capacity();
        System.out.println("Capacity : "+ var); // 캐쉬 크기
        System.out.println("Length : "+sb.length()); // 문자 길이 
        
        sb.append("@naver").append(".com");
        System.out.println("===========================");
        System.out.println("Capacity : "+ var); // 캐쉬 크기
        System.out.println("Length : "+sb.length()); // 문자 길이 
        String str =sb.toString();
        System.out.println(sb); // 내부적으로  String.ValueOf() 메소드를 통해서
        // 변환되므로 String으로 변환됨. 그래서 sb.toString() 메소드로 sout 을 쓸 필요가 없음
        
        sb.insert(sb.indexOf("@"),"하트"); // insert(int positon,"삽입할문자열" )
        System.out.println("Capacity : "+ var); // 캐쉬 크기
        System.out.println("Length : "+sb.length()); // 문자 길이 
        System.out.println("변경된 sb : "+sb);
        
    } // end main
} // end class of Ex1_StringBuffer
