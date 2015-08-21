package ex1;

// @author kosta, 2015. 8. 20 , 오후 12:37:27 , Ex3_While 

import java.util.Scanner;

public class Ex3_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("아무 숫자나 입력");
            int num = Integer.parseInt(sc.nextLine());
            if (num %  2 == 0 ) {
                System.out.println("☆");
            } else{
                System.out.println("★");   
            } // end if 
        } // end while
    } // main
} // end clalss 
