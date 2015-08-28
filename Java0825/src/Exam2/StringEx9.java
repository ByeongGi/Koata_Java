package Exam2;

// @author kosta, 2015. 8. 25 , 오후 5:13:35 , StringEx9 
public class StringEx9 {
    public static void main(String[] args) {
        String fullName = "Hello.java";
        
        // fullName에서 '.' 의 위치를 찾는다.
        int index = fullName.indexOf('.');
        System.out.println("index "+index);
        // fullName 의 '.' 까지 문자열을 추출한다.
        String fileName =  fullName.substring(0,index);
        
        
        String ext =fullName.substring(index+1);
        
        System.out.println(fullName+"의 확장을 제외한 이름은 "+fileName);
        System.out.println(fullName+"의 확장자는 "+ext);
        
        
        
        
    }

}
