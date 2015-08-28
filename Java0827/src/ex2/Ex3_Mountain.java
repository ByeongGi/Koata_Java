package ex2;
// @author kosta, 2015. 8. 27 , 오후 4:05:38 , Ex3_Mountain 
// 자식클래스가 현재 클래스의 자원인 1000억원을 상속 받으려면
// 반드시 미션을 해결해야한다.
public abstract class Ex3_Mountain {
    private String money;

    public Ex3_Mountain() {
        money = "1000억원";
    }
    // 부모의 자원
    public String getMoney() {
        return money;
    }
    
    // 추상 메소드 
    public abstract void moveMountain();
}
