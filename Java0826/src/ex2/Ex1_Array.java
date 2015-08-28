package ex2;
// @author kosta, 2015. 8. 26 , 오후 1:49:52 , Ex1_Array 
public class Ex1_Array {
    // 배열이라는 것은 변수들의 묶음이다.
    // 배열은 객체이다. 
    // 1차원 - 다 차원
    // 기본자료형 배열, 참조자료형 배열
    // 반드시 크기가 있어야 생성할수 있다.
    public static void main(String[] args) {
       // 배열 선언
       char[] ch;
       ch = new char[5]; 
        System.out.println(ch.length);
        System.out.println(ch[0]);
        // 배열을 초기화 
        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        ch[4] = 'S';
        // 출력 
        int len = ch.length;
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("");
        // 향상된 For문 제공 : JDK 5부터
        // 배열 , Collection의 데이터를 반복할 때 사용
        // for (배열 또는 Collection이 가지고 있는 자료형 변수명 : 배열변수)
        // 바구니 : 상자 => 상자에서 해당 자룔를 꺼내서 바구니에 담을떄 true(in)
        for (char d : ch) {
            System.out.print(d);
            
        }
         System.out.println("");
         System.out.println("================");
        
         int[] score  = {100, 90, 80, 70,60, 50};
         for (int t : score) {
             
             if (t>=80) {
             System.out.println(t+"☆");    
             } else {
              System.out.println(t);    
             }
        }
         
    } // end main
} // end calss Ex1_Array
