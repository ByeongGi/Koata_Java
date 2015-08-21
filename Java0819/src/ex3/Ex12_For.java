package ex3;
// @author kosta, 2015. 8. 19 , 오후 4:32:57 , Ex12_For 
// For 문
        // 반복 대상 : 1~10까지를 출력
        // 문법
        /*  
            - 초기식은 for문의 시작이면서 딱 한번만 값이 대입
            - 조건을 판별해서 ture가 발생되면
            - 실행문을 실행시키고 
            - 증감식을 실핼한다.
            - 증가한 값이 조건식을 만족할떄까지 이 작업은 반복하다가 
            - 증가한 값이 조건식을 만족하지 않는다면 (false )라면 반복문
            - 영역 { } 을 빠져 나온다.
            for (초기식;조건식;증감식){
                실행문;    
            }    
        */
public class Ex12_For {
    public static void main(String[] args) {
        System.out.println("=============== For 문 ============\n");
        // 연습문제 1 부터 20 까지를 출력 해본다.
        System.out.println("============ 1 번 연습문제 ===========");
        for (int i = 1; i <= 20; i++) {
            if (i%2==0) // => 2로 나눈 나머지가 0 인 수는 짝수 
            {           // => 그렇지 않은 수는 홀수 
                System.out.println(i+"- 짝수");
            } else{
                System.out.println(i+"- 홀수");
            }// end if
        } // end for
    } // end main
} // end class
/*
=> Result
=============== For 문 ============

============ 1 번 연습문제 ===========
1- 홀수
2- 짝수
3- 홀수
4- 짝수
5- 홀수
6- 짝수
7- 홀수
8- 짝수
9- 홀수
10- 짝수
11- 홀수
12- 짝수
13- 홀수
14- 짝수
15- 홀수
16- 짝수
17- 홀수
18- 짝수
19- 홀수
20- 짝수
*/