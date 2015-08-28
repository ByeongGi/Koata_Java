package exam;

// @author kosta, 2015. 8. 27 , 오후 5:30:09 , Car 
public abstract class Car {
     String color;   //자동차 보디 색상   각 자동차 마다 색상을 입력하여 출력! 아래동일! 
    int tire;       //타이어 갯수
    int door;       //문짝 갯수
    int seat;       //좌석수
    
    public abstract void brakeMachine();        // 감속 방법 및 ABS유무등
    public abstract void moveMachine();         // 가속 방법 및 기어변경
    public abstract void startMachine();        // 시동 방법
    public abstract void headlightMachine();    // 차별 헤드라이트 색과 가시거리
} // end class 
