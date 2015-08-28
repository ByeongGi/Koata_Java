package exam;

// @author kosta, 2015. 8. 27 , 오후 5:37:32 , SportCar 
public class SportCar extends Car{

    @Override
    public void brakeMachine() {
        System.out.println("자동차가 자동으로 인식해서 멈춘다");
    }

    @Override
    public void moveMachine() {
        System.out.println("4배기통으로 가속한다");
        System.out.println("기어는 자동으로 변경된다.");
    }

    @Override
    public void startMachine() {
        System.out.println("홍채 인식");
        System.out.println("시동이 걸린다!");
    }

    @Override
    public void headlightMachine() {
        System.out.println("파랑색 불빛이 난다 ");
    }

}
