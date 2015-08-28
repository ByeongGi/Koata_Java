package ex1;
// @author kosta, 2015. 8. 24 , 오후 12:15:39 , Ex3_Home 
// POJO 기반으로 작성 
// 집에 대문의 색상을 변경하기 위한 값만을 가진 클래스를 설계 
public class Ex3_Home {
    private String doorColor;
    private int money = 20000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }
    
    
    
    
}
