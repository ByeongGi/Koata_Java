package ex3;

// @author kosta, 2015. 8. 28 , 오후 4:19:24 , UserExcetionDemo 

import java.util.Scanner;

public class UserExcetionDemo {
    public void checkMsg(String str) throws UserException{
        if (str.length()<= 0) {
            // 예외를 강제로 발생시키는 구문 Throw
            throw new UserException("반드시 값을 입력하세요 ");
        } else {
            throw new UserException(str + "축하합니다.",9999);
        }
        
    }
    
    public void checkNum(String num) throws UserException{
       
        try {
            int num2 = Integer.parseInt(num);    
        } catch (Exception e) {
         throw new UserException("숫자를 입력하세요 ");
        }
    
        
            
        
    }
    
    
    
    
    public static void main(String[] args) {
        UserExcetionDemo ued = new  UserExcetionDemo();
//        try {
//        ued.checkMsg("입력 !!");
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("숫자를 입력:");
            ued.checkNum(sc.nextLine());
        } catch (UserException e) {
            e.printStackTrace();
        }
        
        
    }
}
