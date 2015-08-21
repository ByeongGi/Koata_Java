
package ex1;
public class Ex3_Val {
    // main 메소드의 프로그램내에 오직 하나이어야만 한다.
    public static void main(String[] args) { 
        // 지역변수 - 메소드나 생성자 즉, Local 변수라고 한다. 
        // 지역변수는 반드시 초기화 해야한다.
        boolean b;//  변수 선언 
        b = true;
        // ---- 참고 --------------------------------------
        // println() 메소드의 인자값으로 문자열과 변수를 전달할떄 
        // "문자열값" + 변수명과 같은 형식으로 값을 전달할수 있다.
        //  그러면 println 은 이 값을 문자열로 취급한다.
        // +: 연산자는 문자열의 연결 연산자로 취급됨
        System.out.println("Boolean 타입의 변수 B 의 값 "+b);
        
        // 문자열  - char 
        // char c= "A"; // 문자열 (X)
        char c= 'A'; // 문자열 (X)
        System.out.println("Char 타입의 변수 c 의 값 "+c);
        c = 65+1;
        System.out.println("Char 타입의 변수 c 의 값 "+c ); // B
        
        // 유니코드 -> 자바는 2바이트 기반.
        c='\u0042'; 
        System.out.println("Char 타입의 변수 c 의 값 "+c ); // B
    } // end main
    
} // end class 
