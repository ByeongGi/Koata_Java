package ex3;
// @author kosta, 2015. 8. 28 , 오후 3:29:58 , Ex3_Throws 

import java.util.Scanner;

public class Ex3_Throws {

    Scanner sc;

    public Ex3_Throws() {
        sc = new Scanner(System.in);
    }
    
    
    public void insert() throws NumberFormatException{
    
        System.out.println("수를 입력하세요");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("입력한 값 "+ num);    
       
    }
    
    public static void main(String[] args) {
        Ex3_Throws ref = new Ex3_Throws();
        try {
        ref.insert();
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요");
        }
    }
    
}
