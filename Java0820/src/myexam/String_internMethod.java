package myexam;
// @author kosta, 2015. 8. 21 , 오후 8:59:52 , String_internMethod 
public class String_internMethod {
    public static void main(String[] args) {
        
        System.out.println("String을  new 연산자로 생성했을 경우 ");
        String str1 = new String();
        String str2 = new String();
        System.out.println("str1 == str2  :  "+ str1 == str2);
        
        System.out.println("String을 리터널 형태로 선언했을 때");
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("str3 == str4  : "+ str3 == str3);
        
        
    } // end main
} // end class 
