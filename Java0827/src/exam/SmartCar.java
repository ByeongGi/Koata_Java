package exam;

// @author kosta, 2015. 8. 27 , 오후 5:39:39 , SmartCar 
public class SmartCar extends Car{

    @Override
    public void brakeMachine() {
        System.out.println("장애물이 나오면 자동으로 감속한다");
    }

    @Override
    public void moveMachine() {
        System.out.println("도로를 따라서 자동 운행 한다");
    }

    @Override
    public void startMachine() {
        System.out.println("원격으로 시동이 걸린다");
    }

    @Override
    public void headlightMachine() {
        System.out.println("파랑색 불빛이 나온다");
        System.out.println("2km 까지 밝게 보인다.");
    }
    
    public void smartAutoDrive(){
        System.out.println("단속 구간 자동 제어");
    }

}
