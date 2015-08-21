package ex2;
// @author kosta, 2015. 8. 19 , 오후 2:04:47 , Ex8_String 
public class Ex08_String {
    public static void main(String[] args) {
        String str1 = new String("Hello"); // 명시적 생성 방법 
        String str2 = new String("Hello");
        
        String str3 = "Hello"; // 암시적 생성 방법 일 경우 상수풀에 등록해 놓아서
        String str4 = "Hello"; // 같은 주소값을 가리키게 됨.
        
        // String 클래스가 new로 생성되었을때 
        // 힙역역에 생기는 객체의 주소값이 서로 다르기 때문에
        // == 로는 주소값 비교가 된다. Hello라는 문자열을 비교
        // 하기 위해서는 String 클래스에서 제공하는 equals 라는 메소드를 
        // 사용해서 비교해야 한다.
        // if(str1== str2) // 객체의 주소값을 비교한다.
        if(str1.equals(str2)) // 두 String 객체의 Value 를 비교한다.
        {
            System.out.println("같다");
        } else{
            System.out.println("다르다");
        }
        if(str3==str4) // 두 String 객체는 상수풀로 저장되어 같은 주소를가르키게 된다.
        {
            System.out.println("같다");
        } else{
            System.out.println("다르다");
        }
    } // end main
} // end class 
/*
=> Result
같다
같다
*/
