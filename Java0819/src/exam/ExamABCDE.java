package exam;
// @author kosta, 2015. 8. 19 , 오후 5:19:20 , ExamABCDE 
import java.util.Scanner;
public class ExamABCDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 대문자 , 소문자 분기 선택
        System.out.println("1. 대문자 2. 소문자");
        String input=sc.nextLine();
        
        // 분기 1 이면 대문자 , 2 이면 소문자 출력 명령문
        if (input.equals("1")) 
        {
            
                System.out.println("대문자 선택");
                System.out.println("A~Z 까지사이에 원하는 대문자 입력");
                String input2=sc.nextLine();
                char ch=input2.charAt(0); // 사용자가 입력한 문자열은 char 타입으로 저장

                // 입력한 문자를 아스키 코드 번호(int)로 형변환
                System.out.println("==== 아스키 코드 변환 값 : " + (int)ch+ " ======");
                System.out.println("");
                System.out.println("======= 출력 시작 =======");
                for (int i = ch; i <= 90; i++) 
                { // 65 ~ 90 = A ~ Z 
                    System.out.print((char)i);
                } // end for 
                System.out.println("\n======= 출력 끝 =======");
             
        } else if(input.equals("2")) {
                System.out.println("소문자 선택");
                System.out.println("a~z 까지사이에 원하는 소문자 입력");
                String input2=sc.nextLine();
                char ch=input2.charAt(0); // 사용자가 입력한 문자열은 char 타입으로 저장
                
                 // 입력한 문자를 아스키 코드 번호(int)로 형변환
                System.out.println("==== 아스키 코드 변환 값 : " + (int)ch+ " ======");
                System.out.println("");
                System.out.println("======= 출력 시작 =======");
                for (int i = ch; i <= 122; i++)
                {  //  97~ 122 = a ~  z
                    System.out.print((char)i);
                } // end for
                System.out.println("\n======== 출력 끝 =========");
                
        } // end if         
    } // end main
} // end class
/*
=> Result
1. 대문자 2. 소문자
1
대문자 선택
A~Z 까지사이에 원하는 단어 입력
G
==== 아스키 코드 변환 값 : 71 ======

======= 출력 시작 =======
GHIJKLMNOPQRSTUVWXYZ
======= 출력 끝 =======
*/