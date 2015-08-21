package ex2;
// @author kosta, 2015. 8. 19 , 오후 2:34:24 , Ex10_String 
public class Ex10_Integer {
    public static void main(String[] args) {
        // 오토 박싱의 범위 => 바이트 범위 
        // -128 ~ 127 => 상수풀에 등록해놓고 byte 객체로 생성 
        // 128 범위를 넘어서면 객체로 생성 
        Integer num1 = 128;
        Integer num2 = 128;
        if (num1== num2) 
        {
            System.out.println("같다");   
        }else{
            System.out.println("다르다");
        }
    } // end main
} // end class 
/*
=> Result
다르다
*/