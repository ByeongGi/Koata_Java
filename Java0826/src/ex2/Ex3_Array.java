package ex2;
// @author kosta, 2015. 8. 26 , 오후 2:24:51 , Ex3_Array 
public class Ex3_Array {
    private String[] str;
    
    public Ex3_Array() { 
    str = new String[5]; // String 객체 배열 생성  각각의 배열 속에는 배열객체에 대한 각각 의 주소값만 들어가 있다.
    str[0] =  new String("Test"); // 1. 객체 생성 
    str[1] = "Test";              // 상수풀 에 대한 주소값을 담긴 객체 
    str[2] = new String("Test"); // 2. 객체 생성 
    str[3] = "Test";             // 상수풀
    str[4] = "Test";             // 상수풀
    }
    
    
    public String[] getStr(){
        return str;
    }
    
    public static void main(String[] args) {
        Ex3_Array ea = new Ex3_Array();
        String[] s = ea.getStr();
        for (String e : s) {
            System.out.println(e); 
        }
        
        System.out.println(s);
    }
    
    
}
