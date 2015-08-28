package ex2;
// 생성자의 이름으로 클래스 이름 대신 this 를 사용한다.
// 한 생성자에서 다른 생성자 호출떄는 반드시 첫 줄에 써준다
// -> 생성자가 먼저 호출된후에 다른 메소드가 실행된다.
// @author kosta, 2015. 8. 25 , 오후 2:07:56 , Ex3_Cont 
public class Ex3_Cont {
    public Ex3_Cont(int num){
        this(10.5f);
        System.out.println("클로버");
    }
    public Ex3_Cont(){
        this("Test"); System.out.println("하트");
    }
    public Ex3_Cont(String str){
        this(10);
        System.out.println("별");
    }
    public Ex3_Cont(boolean bb){
        System.out.println("^^");
    }
    public Ex3_Cont(float ff){
        this(true); System.out.println("뽕뽕");
        
    }
    public static void main(String[] args) {
        new Ex3_Cont();
    }
} // end class of Ex3_Cont