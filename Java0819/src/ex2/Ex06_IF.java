package ex2;
// @author kosta, 2015. 8. 19 , 오전 11:22:10 , Ex6_IF 
// if 문은 True 아니면 , false 다시 말하면  boolean 형의 
// 결과를 가지는 조건식이 있어야 하며 
// 그 조건식의 결과로 수행하는 문장을 결정하게 되는 제어문이다.
// 종류 ) 하나의 조건을 판별 - 단순 if
// 하나의 조건과 그 외의 조건 - if else
// 여러 조건을 한번에 판별 - 다중 if

// 단순 if 문 
/*
 if (조건문){실행문} : 조건이 참이면 실행을 한다.

*/
public class Ex06_IF {
    public static void main(String[] args) {
        System.out.println("======== IF 문 ==========");
        
        System.out.println("======== 예제01 ==========");    
        int su1 = 51;
        String str = "50미만";
        if(su1 >= 50) // if 문의 영역
        {
            str = "50 이상";
            System.out.println("su1의 값 "+ su1+"은"+str+"입니다.");
        } // enf if 
        
        System.out.println("======== 예제02 ==========");    
        int su2 = 30;
        if(su2 <= 30)
        {
            str = "30미만";
            System.out.println("^^");
        } // end if 
        
        System.out.println("======== 예제03 ==========");    
        String str2 = "★";
        String msg1 = "메롱";
        int su3= 30;
        if(su3<=30) // => ture
        {
            str = "♥";
            System.out.println(str2 +"END!");
            // 시스템 종료 
            System.exit(0);
        } // end if
        msg1 = "하이";
        System.out.println(msg1+":"+str2);
            
        
    } // end main
} // end class 
