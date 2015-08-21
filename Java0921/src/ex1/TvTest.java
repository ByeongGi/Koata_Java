package ex1;
// @author kosta, 2015. 8. 21 , 오후 2:39:39 , TvTest 
public class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel=7;
        t.channelDown();
        System.out.println("현재 채널은 "+t.channel+" 입니다.");
        // Tv referenceVariable을 선언하고 , new 연산자를 통해서 Tv() 생성자를
        // 호출하여 힙에 Tv 객체를 생성하고 그에 대한 참조값을 t 에 저장한다.
        // t.channel 을 통해서 객체 멤버 변수에 접근하여 channel 의 값을 갱신하고
        // t.channelDown() 메소드를 호출하여 동작후에 --channel 을 실행하고 
        // 다시 메인메소드으로 돌와 Println 을 호출하고 바뀐 channel 변수의 값을 출력한다.
    } // end main 
} // end class of TvTest
