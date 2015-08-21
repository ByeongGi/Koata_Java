package ex1;
// @author kosta, 2015. 8. 19 , 오전 10:34:59 , Ex4_Oper 
public class Ex4_Oper {
    public static void main(String[] args) {
        System.out.println("======= 삼항 연산자 ======");
        int a = 10; int b = 15;
        String s = " 크다";
        // 조건 연산자 : (조건식) ? 참:거짓
        System.out.println(a == b ? "같다": "다르다"); 
        System.out.println(a != b ? "같다": "다르다");
        // 1) 
        s += (++a)> b ? (a-b)+"만큼 a가" : (b-a) +"만큼 b 가";
        // 2) 
        a = 10; b = 15;
        s = "크다";
        
        if ( ++a >b )  // 10 + 1 > 15 => false
        {   
            s += (a-b)+ "만큼 a가";
            System.out.println(s);
            
        } else{
             s += (b-a) +"만큼 b 가";
            System.out.println(s);
        } // end if
    } // end main
} // end class
/*
=> Result
======= 삼항 연산자 ======
다르다
같다
크다4만큼 b 가
*/