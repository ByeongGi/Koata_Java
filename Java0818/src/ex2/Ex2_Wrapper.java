package ex2;
// @author kosta, 2015. 8. 18 , 오후 3:59:44 , Ex2_Wrapper 
public class Ex2_Wrapper {
    public static void main(String[] args) {
        // Wrapper 클래스란? 기본 자료형을 객체형태로 담고서
        // 안에 정의된 자원(메소드)를 사용하여 쓰기 위한 클래스 
        
        // Integer  -  정수와 관련된 자원을 제공해주는 클래스 
        Integer num1 = 10;
        System.out.println("num : "+ num1); // 10 
        
        int num2= 10;
        System.out.println("num2 : "+ num2); // 10
        
        Boolean b1 = true;
        System.out.println("Boolean : "+b1);
        Character c1 = 'C';
        System.out.println("Charater : "+c1);
        
        Byte by= 2;
        System.out.println("BYTE :"+by);
        
        Short s1 =(short)11;
        System.out.println("Short : "+s1);
        Integer i1 = 1;
        System.out.println("Integer : "+i1);
        Long l1= 1L;
        System.out.println("Long : "+l1);
        
        Float f1 = 1.1F;
        System.out.println("Float : "+f1);
        
        Double d1= 1.1;
        System.out.println("Double : "+d1);
        //  정수형 문자열 값을 int 로 변환해서 저장하기 
        String str = "100";
        int number = Integer.parseInt(str); // String - > Integer -> int로 return 
    } // end main    
} // end class 
