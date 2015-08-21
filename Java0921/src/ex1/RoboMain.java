package ex1;
// @author kosta, 2015. 8. 21 , 오후 12:10:01 , RoboMain 
public class RoboMain {
    public static void main(String[] args) {
        // 클래스를 객체로 선언하고 , 생성 및 자원을 사용하기 
        // 1. 변수 선언이 필요 (자료형 변수명;) 
        RoboDog rd; // 객체 선언 
        
        // 2. 선언한 참조 변수에 힙 영역에 객체를 생성시키고 
        // 그 주소값을 저장시킨다.
        // 참고 RoboDog()는 메서드 호출 형식과 동일하지만
        // 이것을 생성자를 호출한 것이다.
        rd= new RoboDog();
        // h1 = null;
        // 한번 참조가 끊어진 변수는 할 당받은 현재 다시 주소값을 가질수 없다. => 가비지 컬렉터가 수거하지 전까지는 
        // 1. 전원을 키기 
        rd.power = true; // 힙에 생성된 RoboDog 객체의 자원에 접근에 접근 
        // 후에 그값을 True 로 기억 
        if (rd.power) {
            System.out.println("전원을 켰습니다.");
        } else {
            System.out.println("전원을 껐습니다.");
        }
        
        // 2. 상태 변경하기 
        rd.status= 1;
        if (rd.status==1) {
            System.out.println("짓는다!");
        }else if (rd.status==2){
            System.out.println("눕다");
        } else {
            System.out.println("달린다");
        }
        
    } // end main 
} // end class 
