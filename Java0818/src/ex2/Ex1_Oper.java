package ex2;
// @author kosta, 2015. 8. 18 , 오후 1:53:15 , Ex1_Oper 

import java.util.Scanner;

public class Ex1_Oper {
    // 연산자 - 산술연산자
    // +,-,/,%: 나머지값
    public static void main(String[] args) 
    {
        // Varable initiate, 
        int numA = 50;
        int numB = 20;
        int res;
        
        res = numA + numB;
        System.out.println("numA + numB  = "+ res);
        
        res = numA - numB;
        System.out.println("numA -  numB  = "+ res);
        
        res = numA * numB; 
        System.out.println("numA *  numB  = "+ res);
        
        res = numA / numB; // 몫
        System.out.println("numA /  numB  = "+ res);
        
        res= numA % numB; // 나머지 
        System.out.println("numA % numB  = "+ res);
    } // end main 
} // and class
