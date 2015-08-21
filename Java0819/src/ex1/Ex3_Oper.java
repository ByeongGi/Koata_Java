package ex1;
// @author kosta, 2015. 8. 19 , 오전 10:20:34 , Ex3_Oper 
// 증감 연산자 : 1씩 증가 or 1씩 감소에 중심이 있는 연산자며, 
// ++,-- 로 표기한다.
// -- 변수를 기준으로 ++ .-- 가 앞에 있는냐 , 뒤에 있는냐 중요한 연산자
// 전치 연산자 , 증가를 먼저 시켜고 출력함  ++a
// 후치 연산자 , 먼저 출력을 하고 나중에  증가 a++
public class Ex3_Oper {
    public static void main(String[] args) {
        System.out.println("===========증감 연산자 ========== " );
        int a = 10;
        int b =  10;
        int c = 0;
        System.out.println("전치 a : "+(++a)); // a = 11 
        System.out.println("후치 a : "+(b++)); 
        System.out.println("b : "+b);
        
        // 연습 문제 c 를 전치 후치를 적용해서 춣력하기
        System.out.println("========== 연습문제(++) =========");
        System.out.println("전치 C :  "+(++c));
        System.out.println("후치 C :  "+(c++));
        System.out.println("C : "+c);
        
       
        c = 0;
        System.out.println("========== 연습문제(--) =========");
        System.out.println("전치 C :  "+(--c));
        System.out.println("후치 C :  "+(c--));
        System.out.println("C : "+c);
    }// end main
}// end class
/*
=> Result 
===========증감 연산자 ========== 
전치 a : 11
후치 a : 10
b : 11
========== 연습문제(++) =========
전치 C :  1
후치 C :  1
C : 2
========== 연습문제(--) =========
전치 C :  -1
후치 C :  -1
C : -2
*/