
package ex1;

public class Ex4_Val {
    
    public static void main(String[] args) {
        // JVM 연산 
        byte a = 10; 
        byte b = 10; 
        // JVM 연산할때 특징 
        // 4바이트 이하에서 연산할때 JVM 은 무조건 연산시에
        // int 형으로 자동 형변환한다.
        
       byte c;
       // 큰 자료형에서 작은 자료형으로 값을 전달할떄는
       // demotion(축소변화)이 일어난다고 캐스팅 표기를 해준다(컴파일러가)
       c = (byte) (a+b);
       System.out.println(c);
       // promotion(확대변화) byte - > int
       int num =c;
       System.out.println(num);
       //  연습문제 1) short 자료형도 위와 같이 테스트 
       //  연습문제 2) byte, short 와 같은 정수형 자료의 범위를 넘겨서 
       //  저장해보고 결과를 주석으로 남겨 봅시다.
       
       
       // 1. 연습문제
       short num1 = 200;
       short num2 = 200;
       short num3 = (short) (num1 + num2); // demotion 
        System.out.println(num3);
       int num4 = num3; // promotion
        System.out.println(num3);
        
       // 2. 연습문제
        // byte num5 =  200; // - 56  ->  overflow

       long lb = 1212; // promotion
       long lb2 = 1212L;  // long형으로 대입        
    } // end main
} // end calss 
